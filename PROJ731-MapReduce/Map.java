import java.util.ArrayList;
import java.util.List;

public class Map {
    List<String> texte;
    ArrayList<Couple> mot = new ArrayList<Couple>();

    public Map(List<String> texte){
        this.texte = texte;
        splitbyword();
    }

    public void splitbyword(){
        for (int i = 0; i<this.texte.size(); i++){
            String s = this.texte.get(i).toLowerCase();
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
