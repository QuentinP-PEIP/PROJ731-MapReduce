import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String args[]) throws InterruptedException, IOException {

        long debut = System.currentTimeMillis();  

        String nom_fichier = "big.txt";
        Fichier2 fichier = new Fichier2(nom_fichier);
        List<String> partie1 = fichier.texte_divise.get(0);
        List<String> partie2 = fichier.texte_divise.get(1);  

        //Test thread
        MapThread mapth1 = new MapThread("mapt1", partie1);
        MapThread mapth2 = new MapThread("mapt2", partie2);

        long tempsExe = System.currentTimeMillis()-debut;
        System.out.println("Temps d'exécution du map est de " + tempsExe + " ms");
        //TimeUnit.SECONDS.sleep(1);

        mapth1.join();
        mapth2.join();

        ArrayList<Couple> resMap = Compilateur.compilationResMap(mapth1.getThmot(), mapth2.getThmot());

        Shuffle s = new Shuffle(resMap);

        ArrayList<HashMap<String, ArrayList<Integer>>> dicoF = Compilateur.compilationResShuffle(s.motreunis);

        ReduceThread redth1 = new ReduceThread("redt1", dicoF.get(0));
        ReduceThread redth2 = new ReduceThread("redt2", dicoF.get(1));
        
        redth1.join();
        redth2.join();

        HashMap<String, Integer> resReduce = Compilateur.compilationResReduce(redth1.get_dicof(), redth2.get_dicof());

        System.out.println(resReduce);
    }
}
