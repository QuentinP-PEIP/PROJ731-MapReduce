import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;


public class Texte {

	private String nom_texte;
	//private HashMap<Character, Integer> freqs = new HashMap<Character, Integer>(); //HashMap liant un caractère avec son nombre d'apparition 
	
	
	public Texte (String nom_texte) {
		
		this.nom_texte = nom_texte+".txt"; //Le format de nos exemples sont en .txt
	}
	
	public int nbCarac() {
		
		return texte.length();
	}
	

	public String getNom_texte() {
		return nom_texte;
	}
	

	public String getTexte() {
		return texte;
	}
	
	public String texte = ""; //On initialise notre texte comme une chaine de caractères vide
	
	public String toStringTxt() throws FileNotFoundException {
		
		Scanner scan = new Scanner(new File(this.nom_texte)); //On créé un scanner qui va scanner le fichier en paramètre
        
        while(scan.hasNextLine()){ //Tant qu'il y a encore des lignes
            String ligne = scan.nextLine(); //On scan la ligne suivante
            //System.out.println(ligne); //On l'affiche
            texte += ligne; //et on l'ajoute au texte
        }
        
        return texte;
		
	}
	

	/*public HashMap<Character, Integer> analyse_text() throws FileNotFoundException { //Fonction qui scan le texte donné
		
        Scanner scan = new Scanner(new File(this.nom_texte)); //On créé un scanner qui va scanner le fichier en paramètre
        
        while(scan.hasNextLine()){ //Tant qu'il y a encore des lignes
            String ligne = scan.nextLine(); //On scan la ligne suivante
            System.out.println(ligne); //On l'affiche
            texte += ligne; //et on l'ajoute au texte
        }
        
        String texteMin = texte.toLowerCase(); //Transforme tous les caractères en minuscule
        char[] chars = texteMin.toCharArray(); //Crée une liste de caractères
        for (int i = 0; i < texteMin.length(); i++) { //Pour tout les caractères

            Integer freq_carac = freqs.get(chars[i]); //On initialise la fréquence du caractère grâce à notre HashMap et au caractère en question
            if (freq_carac != null) { //Si le caractère est déjà renseigné
                freqs.put(chars[i], (freq_carac + 1)); //On incrémente son nombre d'apparition
            }
            else {
            	freqs.put(chars[i], 1); //Sinon on l'initialise à 1
           }  
        }
        
        //Boucle test d'affichage
        for (char i : trierHashMap(freqs).keySet()) { //Pour tous les caractères dans notre HashMap triée
        	
        	float freq_carac = ((float)freqs.get(i)/(float)texteMin.length())*100; //On calcul la fréquence en pourcentage
        	}
        
        return trierHashMap(freqs);
	}
	//Split du fichier entre les différents map
	
	
		public static HashMap<Character, Integer> trierHashMap(Map<Character, Integer> hmap){ //Méthode trouvée sur internet (http://www.codeurjava.com/2015/07/comment-trier-une-hashmap-par-cles.html), le but est de trier notre HashMap en copiant les clés dans une liste afin de les trier avec Collections.sort()
			
	        List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>( hmap.entrySet()); //On créé une liste qui contient les informations de notre map. entrySet permet de parcourir les couples clé/valeurs
	        
	        //Tri de la liste
	        Collections.sort( list, new Comparator<Map.Entry<Character, Integer>>(){ //Collections.sort ressemble au sort() utilisé sur les ArrayList, mais celui ci permet d'aussi trier les LinkedList
	        	
	           public int compare (Map.Entry<Character, Integer>o1, Map.Entry<Character, Integer> o2 ) { //On va donc comparer les différents couples clé/valeur
	              
	              return (o1.getValue()).compareTo( o2.getValue()); //On compare les valeurs des clés puisqu'on veut trier suivant les fréquences
	           }
	        }
	        );

	        //Création d'une nouvelle HashMap à partir de la LinkedList
	        HashMap<Character, Integer> hmapTriee = new LinkedHashMap<Character, Integer>();
	        
	        for (Map.Entry<Character, Integer> entry : list){ //Pour tous les éléments de la liste
	            hmapTriee.put( entry.getKey(), entry.getValue() ); //On les les insères par couples dans notre HashMap.
	        }
	        
	        return hmapTriee; //On retourne notre HashMap triée. 
	    }*/

	
}
