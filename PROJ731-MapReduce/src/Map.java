import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Map {
	
	public String texte;
	public HashMap<String, Integer> freqs = new HashMap<String, Integer>(); //HashMap liant un caract�re avec son nombre d'apparition 
	
	public Map (String texte) {	
		this.texte = texte;
	}
	
public HashMap<String, Integer> analyse_text() throws FileNotFoundException { //Fonction qui scan le texte donn�
		    
        String texteMin = texte.toLowerCase(); //Transforme tous les caract�res en minuscule
        texteMin = texteMin.replaceAll("\\p{Punct}", ""); //Envl�ve aussi les ' il faudrait ajouter une exception
        String[] tab_mots = texteMin.split(" ");
        for (int i = 0; i < tab_mots.length; i++) { //Pour tout les caract�res

            Integer freq_mot = freqs.get(tab_mots[i]); //On initialise la fr�quence du caract�re gr�ce � notre HashMap et au caract�re en question
            if (freq_mot != null) { //Si le caract�re est d�j� renseign�
                freqs.put(tab_mots[i], (freq_mot + 1)); //On incr�mente son nombre d'apparition
            }
            else {
            	freqs.put(tab_mots[i], 1); //Sinon on l'initialise � 1
           }  
        }
        return freqs;
	}
}
