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
        
        long debut = System.currentTimeMillis();
        
        String adresse = "PROJ731-MapReduce\\Textes\\" + fichier;
        this.texte = new String(Files.readAllBytes(Paths.get(adresse)),
                StandardCharsets.UTF_8);
       
        long tempsExe1 = System.currentTimeMillis()-debut;
        System.out.println("Temps de copie est de " + tempsExe1 + " ms");
        
        this.texte_divise = this.cut();
        
        long tempsExe2 = System.currentTimeMillis()-debut;
        System.out.println("Temps d'exécution du cut est de " + tempsExe2 + " ms");
    }

    public ArrayList<List<String>> cut(){
        ArrayList<List<String>> tableau = new ArrayList<List<String>>();
        
        String mot[] = this.texte.split("\\P{L}+");
        List<String> list = Arrays.asList(mot);
        int moitie = list.size()/2;
        List<String> part1 = list.subList(0, moitie);
        List<String> part2 = list.subList(moitie, list.size());
        //System.out.println(part2);
        
        tableau.add(part1);
        tableau.add(part2);
        return tableau;
    }
}
