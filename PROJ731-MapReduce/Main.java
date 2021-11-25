import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        String nom_fichier = "big.txt";
        Fichier2 fichier = new Fichier2(nom_fichier);
        List<String> partie = fichier.texte_divise.get(0);

        Map n = new Map(partie);
        Shuffle s = new Shuffle(n.mot);
        //s.affiche();

        Reduce r = new Reduce(s.motreunis);

        r.afficher();


        

    }
}
