import java.util.HashMap;

public class Map {
    String texte;
    HashMap<String, Integer> mot;
    public Map(String texte){
        this.texte = texte.toLowerCase();
        splitbyword(this.texte);
    }

    public void splitbyword(String texte){
        String result = texte.replaceAll("\\p{Punct}&&[^']+", " "); 
        String[] words = result.split(" ");
        HashMap<String, Integer> mot = new HashMap<String, Integer>();
        for (String s : words){
            mot.put(s, 1);
        }
        this.mot = mot;
    }
}
