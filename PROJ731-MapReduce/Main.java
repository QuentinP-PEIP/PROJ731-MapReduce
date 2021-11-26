import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String args[]) throws InterruptedException, IOException {

        long debut = System.currentTimeMillis(); //On initialise l'heure à laquelle commence le programme

        String nom_fichier = "big.txt"; //On choisi le fichier à analyser
        Fichier2 fichier = new Fichier2(nom_fichier); //On crée un object fichier2 utilisé pour faire des actions sur le fichier
        List<String> partie1 = fichier.texte_divise.get(0); //On crée une list de string correspondant à la première moitiée du fichier 
        List<String> partie2 = fichier.texte_divise.get(1); //On crée une list de string correspondant à la deuxième moitiée du fichier 

        MapThread mapth1 = new MapThread("mapt1", partie1); //On crée le premier thread map qui traite la première partie du fichier
        MapThread mapth2 = new MapThread("mapt2", partie2); //et le deuxième qui traite la deuxième partie du fichier

        mapth1.join(); //On attend que le thread map1 se finisse
        mapth2.join(); //et que le map2 aussi

        ArrayList<Couple> resMap = Compilateur.compilationResMap(mapth1.getThmot(), mapth2.getThmot()); //On rassemble les deux résultats des threads en une seule liste

        Shuffle s = new Shuffle(resMap); //On crée un objet shuffle qui permet la réunion en une hashmap des différents mots et leur fréquence

        ArrayList<HashMap<String, ArrayList<Integer>>> dicoF = Compilateur.compilationResShuffle(s.motreunis); //On divise la hashmap en deux

        ReduceThread redth1 = new ReduceThread("redt1", dicoF.get(0)); //Le thread reduce 1 traite la première moitiée de la hashmap
        ReduceThread redth2 = new ReduceThread("redt2", dicoF.get(1)); //le thread reduce 2, la deuxième
        
        redth1.join(); //On attend que le thread reduce 1 ait fini
        redth2.join(); //de même pour le 2

        HashMap<String, Integer> resReduce = Compilateur.compilationResReduce(redth1.get_dicof(), redth2.get_dicof()); //On rassemble les deux résultats des threads en une seule hashmap

        //System.out.println(resReduce);

        PrintWriter writer = new PrintWriter("resultat_map_reduce.txt", "UTF-8"); 
        writer.println(resReduce); //On écrit cette hashmap dans un fichier txt
        writer.close();

        long tempsExe = System.currentTimeMillis()-debut; //On initialise l'heure à la fin de l'exécution
        System.out.println("Temps d'exécution du map-reduce est de " + tempsExe + " ms"); //On peut donc calculer le temps total d'exécution
    }
}
