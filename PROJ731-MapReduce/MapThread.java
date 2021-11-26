import java.util.ArrayList;
import java.util.List;

public class MapThread extends Thread{

    private String threadName; //Les threads map ont un nom
    private List<String> texte; //Une liste de String
    private ArrayList<Couple> Thmot = new ArrayList<Couple>(); //et une liste de couple (string, entier)
    
    /** Création et démarrage automatique du thread */
    public MapThread(String threadName, List<String> texte) { //Un thread prend en paramètre un nom et une liste de textes
        this.threadName = threadName;
        this.texte = texte;
        this.start(); //le thread se lance et exécute la méthode run()
    }

    public void run() {

        long debut = System.currentTimeMillis();
        Map map = new Map(this.texte); //On crée une tâche map avec la liste de textes passé en paramètre
        System.out.println("Le thread " + this.threadName + " est lancé");
        map.splitbyword(); //On crée les couples (mot, entier)
        System.out.println("Le thread " + this.threadName + " a fini");
        long tempsExe = System.currentTimeMillis()-debut;
        System.out.println("Temps d'exécution de " + this.threadName + " est de " + tempsExe + " ms");
        this.Thmot = map.mot; //On actualise la liste de couple du thread
    }

    public ArrayList<Couple> getThmot() {
        return this.Thmot;
    }

    public void afficher(){ //Permet d'afficher les différents couples en sortie de la tâche map
        for(Couple c:this.Thmot){
            c.afficher();
        }
    }
}
