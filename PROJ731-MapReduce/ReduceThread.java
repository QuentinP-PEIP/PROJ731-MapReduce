import java.util.ArrayList;
import java.util.HashMap;

public class ReduceThread extends Thread {

    private String threadName; //Les threads reduce ont un nom
    HashMap<String, ArrayList<Integer>> dico = new HashMap<String, ArrayList<Integer>>(); //Une hashmap (mot, [1,1,1,1,1])
    HashMap<String, Integer> dicof = new HashMap<String, Integer>(); //Une hashmap résultat final
    
    /** Création et démarrage automatique du thread */
    public ReduceThread(String threadName, HashMap<String, ArrayList<Integer>> dico) {
        this.threadName = threadName;
        this.dico = dico;
        this.start();
    }

    public void run() {
        long debut = System.currentTimeMillis();
        Reduce reduce = new Reduce(this.dico); //On crée un reduce avec comme paramètre une hashmap du type (mot, [1,1,1,1,1])
        System.out.println("Le thread " + this.threadName + " est lancé");
        reduce.compter(this.dico); //Permet de modifier la hashmap afin qu'elle soit sous la forme (mot, entier)
        //reduce.afficher();
        System.out.println("Le thread " + this.threadName + " a fini");
        long tempsExe = System.currentTimeMillis()-debut;
        System.out.println("Temps d'exécution de " + this.threadName + " est de " + tempsExe + " ms");
        this.dicof = reduce.dicof; //On actualise la hashmap résultat du thread
        
    }

    public HashMap<String, Integer> get_dicof(){

        return this.dicof;
    }
    
}
