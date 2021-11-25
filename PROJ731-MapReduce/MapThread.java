import java.util.ArrayList;
import java.util.List;

public class MapThread extends Thread{
    private String threadName;
    private List<String> texte;
    private ArrayList<Couple> Thmot = new ArrayList<Couple>();
    
    /** Création et démarrage automatique du thread */
    public MapThread(String threadName, List<String> texte) {
        this.threadName = threadName;
        this.texte = texte;
        this.start();
    }

    public void run() {
        long debut = System.currentTimeMillis();
        Map map = new Map(this.texte);
        System.out.println("Le thread " + this.threadName + " est lancé");
        map.splitbyword();
        System.out.println("Le thread " + this.threadName + " a fini");
        long tempsExe = System.currentTimeMillis()-debut;
        System.out.println("Temps d'exécution de " + this.threadName + " est de " + tempsExe + " ms");
        this.Thmot = map.mot;
    }

    public ArrayList<Couple> getThmot() {
        return this.Thmot;
    }

    public void afficher(){
        for(Couple c:this.Thmot){
            c.afficher();
        }
    }
}
