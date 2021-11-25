import java.util.ArrayList;

public class MapThread extends Thread{
    private String threadName;
    private String partOfText;
    private ArrayList<Couple> Thmot = new ArrayList<Couple>();
    
    /** Création et démarrage automatique du thread */
    public MapThread(String threadName, String partOfText) {
        this.threadName = threadName;
        this.partOfText = partOfText;
        this.start();
    }

    public void run() {
        long debut = System.currentTimeMillis();
        Map map = new Map(this.partOfText);
        System.out.println("Le thread " + this.threadName + " est lancé");
        map.splitbyword(this.partOfText);
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
