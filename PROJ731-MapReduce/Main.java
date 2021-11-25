public class Main {
    public static void main(String args[]) {
        String nom_fichier = "Hamilton.txt";
        Fichier fichier = new Fichier(nom_fichier);
        String partie = fichier.texte_divise.get(0);

        Map n = new Map(partie);
        Shuffle s = new Shuffle(n.mot);
        //s.affiche();

        Reduce r = new Reduce(s.motreunis);

        r.afficher();


        

    }
}
