public class Main {
    public static void main(String args[]) {
        String nom_fichier = "Hamilton.txt";
        Fichier fichier = new Fichier(nom_fichier);
        String partie = fichier.texte_divise.get(0);
        Partie n = new Partie(partie);

        

    }
}
