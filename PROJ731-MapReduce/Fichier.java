import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fichier {
    String texte;
    ArrayList<List<String>> texte_divise;
    

    public Fichier(String fichier) throws IOException {
        
        long debut = System.currentTimeMillis();// valeur de temps initiale pour comparer
        
        String adresse = "Textes\\" + fichier; // Adresse du fichier à étudier
        
        this.texte = new String(Files.readAllBytes(Paths.get(adresse)),
                StandardCharsets.UTF_8); // Lecture et copie du fichier dans l'attribut texte
       
        long tempsExe1 = System.currentTimeMillis()-debut; // calcul du temps pour la lecture et la copie
        System.out.println("Temps de copie est de " + tempsExe1 + " ms");
        
        this.texte_divise = this.cut();
        
        long tempsExe2 = System.currentTimeMillis()-debut;
        System.out.println("Temps d'exécution du cut est de " + tempsExe2 + " ms");
    }

    public ArrayList<List<String>> cut(){ // Progtamme coupant le texte en deux et le renvoyant
        // Dans une liste de liste de String
        ArrayList<List<String>> tableau = new ArrayList<List<String>>();
        
        String mot[] = this.texte.split("\\P{L}+"); //Suppression de tous les signes d'accentuation et ponctuation
        List<String> list = Arrays.asList(mot); //Convertion en liste de String
        int moitie = list.size()/2;
        List<String> part1 = list.subList(0, moitie);//Separation de la liste en deux -> Part1
        List<String> part2 = list.subList(moitie, list.size()); // ->Part2
        //System.out.println(part2);
        
        tableau.add(part1);
        tableau.add(part2);
        return tableau;
    }
}
