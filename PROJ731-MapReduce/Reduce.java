import java.util.ArrayList;
import java.util.HashMap;

public class Reduce {
    
    HashMap<String, ArrayList<Integer>> dico = new HashMap<String, ArrayList<Integer>>();
    HashMap<String, Integer> dicof = new HashMap<String, Integer>();
    
    public Reduce(HashMap<String, ArrayList<Integer>> dico){
        this.dico = dico;
    }

    public void compter(HashMap<String, ArrayList<Integer>> dico){
        for(String s : dico.keySet()){
            Integer valeur = dico.get(s).size();
            this.dicof.put(s, valeur);
        }
    }

    public void afficher(){
        for(String s : this.dicof.keySet()){
            System.out.println("Le mot " + s + " est contenu " + this.dicof.get(s) + " fois dans le texte");
        }

    }
}
