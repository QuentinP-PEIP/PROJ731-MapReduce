import java.util.ArrayList;

public class Map {
    String texte;
    ArrayList<Couple> mot = new ArrayList<Couple>();

    public Map(String texte){
        this.texte = texte.toLowerCase();
        splitbyword(this.texte);
    }

    public void splitbyword(String texte){
        String result = texte.replaceAll("\\p{Punct}&&[^']+", " ");
        String result1 = result.replaceAll(",", "");
        String result2 = result1.replaceAll("\\.", "");
        String[] words = result2.split(" ");
        for (String s : words){
            if(!s.equals("")){
                Couple c = new Couple(s, 1);
                this.mot.add(c);
            }
        }
    }

    public void afficher(){
        for(Couple c:this.mot){
            c.afficher();
        }
    }
}
