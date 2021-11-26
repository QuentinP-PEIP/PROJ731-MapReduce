import java.util.HashMap;
import java.util.ArrayList;

public class Shuffle {
    public HashMap<String, ArrayList<Integer>> motreunis = new HashMap<String, ArrayList<Integer>>();//Dictionnaire conteant les données des couples
    
    public Shuffle (ArrayList<Couple> mot){
        reunion(mot);
    }

    public void reunion(ArrayList<Couple> mot){

        for (Couple c : mot){//Pour tous les couples dans la liste de Couple
            if (appartiens(c.get_mot())){ // On vérifie si le mot est déjà présent dans le dictionnaire, si oui:
                ArrayList<Integer> value = this.motreunis.get(c.get_mot());//on collete la donnée déjà présente dans le dictionnaire
                value.add(1);//On la met à jour en ajoutant une apparition
                this.motreunis.put(c.get_mot(), value);//On met à jour le dictionnaire
            }
            else{//Si non:
                ArrayList<Integer> valeur = new ArrayList<Integer>();//On récupère les données
                this.motreunis.put(c.get_mot(), valeur);//On l'ajoute au dictionnaire
            }
        }
    }

    public boolean appartiens(String mot){//Fonction renvoyant True si le mot en argument est déjà présent dans le dictionnaire
        return this.motreunis.containsKey(mot);
    }

    public void affiche(){//Fonction affichant le dictionnaire
        System.out.println(this.motreunis);
    }
}
