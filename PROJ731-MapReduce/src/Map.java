import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Map {
	
	public String texte;
	public HashMap<String, Integer> freqs = new HashMap<String, Integer>(); //HashMap liant un caractère avec son nombre d'apparition 
	
	public Map (String texte) {	
		this.texte = texte;
	}
	
public HashMap<String, Integer> analyse_text() throws FileNotFoundException { //Fonction qui scan le texte donné
		    
        String texteMin = texte.toLowerCase(); //Transforme tous les caractères en minuscule
        texteMin = texteMin.replaceAll("\\p{Punct}", ""); //Envlève aussi les ' il faudrait ajouter une exception
        String[] tab_mots = texteMin.split(" ");
        for (int i = 0; i < tab_mots.length; i++) { //Pour tout les caractères

            Integer freq_mot = freqs.get(tab_mots[i]); //On initialise la fréquence du caractère grâce à notre HashMap et au caractère en question
            if (freq_mot != null) { //Si le caractère est déjà renseigné
                freqs.put(tab_mots[i], (freq_mot + 1)); //On incrémente son nombre d'apparition
            }
            else {
            	freqs.put(tab_mots[i], 1); //Sinon on l'initialise à 1
           }  
        }
        return freqs;
	}
}
