import java.util.ArrayList;
import java.util.HashMap;

public class ReduceThread extends Thread {

    private String threadName;
    HashMap<String, ArrayList<Integer>> dico = new HashMap<String, ArrayList<Integer>>();
    HashMap<String, Integer> dicof = new HashMap<String, Integer>();
    
    /** Création et démarrage automatique du thread */
    public ReduceThread(String threadName, HashMap<String, ArrayList<Integer>> dico) {
        this.threadName = threadName;
        this.dico = dico;
        this.start();
    }

    public void run() {
        long debut = System.currentTimeMillis();
        Reduce reduce = new Reduce(this.dico);
        System.out.println("Le thread " + this.threadName + " est lancé");
        reduce.compter(this.dico);
        //reduce.afficher();
        System.out.println("Le thread " + this.threadName + " a fini");
        long tempsExe = System.currentTimeMillis()-debut;
        System.out.println("Temps d'exécution de " + this.threadName + " est de " + tempsExe + " ms");
        this.dicof = reduce.dicof;
        
    }

    public HashMap<String, Integer> get_dicof(){

        return this.dicof;
    }
    
}
