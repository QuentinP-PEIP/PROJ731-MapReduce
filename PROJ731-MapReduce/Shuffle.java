import java.util.HashMap;
import java.util.ArrayList;

public class Shuffle {
    public HashMap<String, ArrayList<Integer>> motreunis = new HashMap<String, ArrayList<Integer>>();
    
    public Shuffle (ArrayList<Couple> mot){
        reunion(mot);
    }

    public void reunion(ArrayList<Couple> mot){

        for (Couple c : mot){
            if (appartiens(c.get_mot())){
                ArrayList<Integer> oldvalue = this.motreunis.get(c.get_mot());
                ArrayList<Integer> newvalue = oldvalue;
                newvalue.add(1);
                this.motreunis.put(c.get_mot(), newvalue);
            }
            else{
                ArrayList<Integer> valeur = new ArrayList<Integer>();
                valeur.add(1);
                this.motreunis.put(c.get_mot(), valeur);
            }
        }
    }

    public boolean appartiens(String mot){
        return this.motreunis.containsKey(mot);
    }

    public void affiche(){
        System.out.println(this.motreunis);
    }
}
