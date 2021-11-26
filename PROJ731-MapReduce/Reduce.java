import java.util.ArrayList;
import java.util.HashMap;

public class Reduce {
    
    HashMap<String, ArrayList<Integer>> dico = new HashMap<String, ArrayList<Integer>>();
    HashMap<String, Integer> dicof = new HashMap<String, Integer>();
    
    public Reduce(HashMap<String, ArrayList<Integer>> dico){
        this.dico = dico;
    }

    public void compter(HashMap<String, ArrayList<Integer>> dico){
        for(String s : dico.keySet()){//Pour toutes les clés du dictionnaire
            Integer valeur = dico.get(s).size();//Collecte des valeurs et on comptele nombre d'apparitions du mot
            this.dicof.put(s, valeur);//Mise à jour du dictionnaire
        }
    }

    public void afficher(){//Fonction permettant d'afficher toutes les données du dictionnaire
        for(String s : this.dicof.keySet()){
            System.out.println("Le mot " + s + " est contenu " + this.dicof.get(s) + " fois dans le texte");
        }

    }
}
