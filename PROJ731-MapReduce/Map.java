import java.util.ArrayList;
import java.util.List;

public class Map {
    private List<String> texte;
    public ArrayList<Couple> mot = new ArrayList<Couple>();

    public Map(List<String> texte){
        this.texte = texte;
    }

    public void splitbyword(){ //Fonction transformant les listes de mot en liste de Couple
        for (int i = 0; i<this.texte.size(); i++){ //Pour tous les éléments de la liste
            String s = this.texte.get(i).toLowerCase(); //Modification des majuscule en minuscule
            Couple c = new Couple(s, 1); // Création des Couples
            this.mot.add(c); //Ajout à la liste de Couple
        }
    }

    public void afficher(){ // Fonction pour afficher tous les couples de la liste de Couple
        for(Couple c:this.mot){
            c.afficher();
        }
    }
}
