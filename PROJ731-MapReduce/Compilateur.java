import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Compilateur {
    
    public Compilateur(){}

    public static ArrayList<Couple> compilationResMap(ArrayList<Couple> resMap1, ArrayList<Couple> resMap2){
      
        ArrayList<Couple> resMap = new ArrayList<Couple>();
        resMap.addAll(resMap1);
        resMap.addAll(resMap2);
        return resMap;
      }

      public static ArrayList<HashMap<String, ArrayList<Integer>>> compilationResShuffle(HashMap<String, ArrayList<Integer>> hashMap){
      
        HashMap<String, ArrayList<Integer>> dico1 = new HashMap<String, ArrayList<Integer>>();
        HashMap<String, ArrayList<Integer>> dico2 = new HashMap<String, ArrayList<Integer>>();
        ArrayList<HashMap<String, ArrayList<Integer>>> listDico = new ArrayList<HashMap<String, ArrayList<Integer>>>();
  
        int cpt = 0;
        for (Map.Entry<String, ArrayList<Integer>> entry : hashMap.entrySet()) {
          String cle = entry.getKey();
          ArrayList<Integer> valeur = entry.getValue();
          if (cpt%2 == 0){
            dico1.put(cle, valeur);
          }
          else{
            dico2.put(cle, valeur);
          }
          cpt++;
          } 
      
        listDico.add(dico1);
        listDico.add(dico2);   
        return listDico;
      }

      public static HashMap<String, Integer> compilationResReduce(HashMap<String, Integer> hashMap1, HashMap<String, Integer> hashMap2 ){
      
        HashMap<String, Integer> dicoF = hashMap1;
  
        for (Entry<String, Integer> entry : hashMap2.entrySet()) {
          String cle = entry.getKey();
          Integer valeur = entry.getValue();
          dicoF.put(cle, valeur);
        }
   
        return dicoF;
      }
}
