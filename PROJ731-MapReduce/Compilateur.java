import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Compilateur {
    
    public Compilateur(){}

    //Cette classe est utilisée pour regrouper les méthodes agissant sur les résultats des différentes parties du programme

    public static ArrayList<Couple> compilationResMap(ArrayList<Couple> resMap1, ArrayList<Couple> resMap2){ //Permet de concaténer deux listes de couples
      
        ArrayList<Couple> resMap = new ArrayList<Couple>(); //On initialise notre ArrayList résultat
        resMap.addAll(resMap1); //On y ajouter la première liste
        resMap.addAll(resMap2); //la deuxième
        return resMap; //on retourne la liste
      }

      public static ArrayList<HashMap<String, ArrayList<Integer>>> compilationResShuffle(HashMap<String, ArrayList<Integer>> hashMap){ //Permet de diviser en deux une hashmap
      
        HashMap<String, ArrayList<Integer>> dico1 = new HashMap<String, ArrayList<Integer>>(); //Première partie de notre liste de hashmap
        HashMap<String, ArrayList<Integer>> dico2 = new HashMap<String, ArrayList<Integer>>(); //deuxième partie
        ArrayList<HashMap<String, ArrayList<Integer>>> listDico = new ArrayList<HashMap<String, ArrayList<Integer>>>(); //Liste de hashmaps
  
        int cpt = 0; //On initialise un compteur afin de gérer la répartition entre les deux hashmap
        for (Map.Entry<String, ArrayList<Integer>> entry : hashMap.entrySet()) { //Pour chaque couple dans la hashmap en paramètre
          String cle = entry.getKey(); //On récupère la clé
          ArrayList<Integer> valeur = entry.getValue(); //et sa valeur
          if (cpt%2 == 0){ //Si le compteur est pair, on ajoute le couple dans le dico1
            dico1.put(cle, valeur);
          }
          else{
            dico2.put(cle, valeur); //sinon on ajoute le couple dans le dico2
          }
          cpt++; //On incrémente le compteur
          } 
      
        listDico.add(dico1); //On ajoute le dico1 à la liste
        listDico.add(dico2); //de même pour le dico2
        return listDico; //On retourne la liste des hashmaps
      }

      public static HashMap<String, Integer> compilationResReduce(HashMap<String, Integer> hashMap1, HashMap<String, Integer> hashMap2 ){ //Permet de concaténer deux hashmaps
      
        HashMap<String, Integer> dicoF = hashMap1; //On initialise notre hashmap final comme égale à la première hashmap
  
        for (Entry<String, Integer> entry : hashMap2.entrySet()) { //il ne reste donc plus qu'à ajouter les valeurs de la seconde hashmap
          String cle = entry.getKey();
          Integer valeur = entry.getValue();
          dicoF.put(cle, valeur);
        }
   
        return dicoF; //On retourne la hashmap finale
      }
}
