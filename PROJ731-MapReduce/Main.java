import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.Map;
import java.util.Map.Entry;


public class Main {
    public static void main(String args[]) throws InterruptedException {

        long debut = System.currentTimeMillis();  
        String nom_fichier = "Hamilton.txt";
        Fichier fichier = new Fichier(nom_fichier);
        String partie1 = fichier.texte_divise.get(0);
        String partie2 = fichier.texte_divise.get(1);

        //Map n = new Map(partie);
        
        

        //Test thread
        MapThread mapth1 = new MapThread("mapt1", partie1);
        MapThread mapth2 = new MapThread("mapt2", partie2);
        long tempsExe = System.currentTimeMillis()-debut;
        System.out.println("Temps d'exécution du main est de " + tempsExe + " ms");
        TimeUnit.SECONDS.sleep(1);

        //mapth1.afficher();

        ArrayList<Couple> resMap = compilationResMap(mapth1.getThmot(), mapth2.getThmot());

        Shuffle s = new Shuffle(resMap);

        //s.affiche();

        ArrayList<HashMap<String, ArrayList<Integer>>> dicoF = compilationResMap(s.motreunis);
        //System.out.println(dicoF.get(0));

        ReduceThread redth1 = new ReduceThread("redt1", dicoF.get(0));
        ReduceThread redth2 = new ReduceThread("redt2", dicoF.get(1));
        //Reduce r = new Reduce(s.motreunis);
        TimeUnit.SECONDS.sleep(1);
        HashMap<String, Integer> resReduce = compilationResReduce(redth1.get_dicof(), redth2.get_dicof());
        System.out.println(resReduce);

        //r.afficher();
    }

    public static ArrayList<Couple> compilationResMap(ArrayList<Couple> resMap1, ArrayList<Couple> resMap2){
      
      ArrayList<Couple> resMap = new ArrayList<Couple>();
      resMap.addAll(resMap1);
      resMap.addAll(resMap2);
      return resMap;
    }

    public static ArrayList<HashMap<String, ArrayList<Integer>>> compilationResMap(HashMap<String, ArrayList<Integer>> hashMap){
      
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
