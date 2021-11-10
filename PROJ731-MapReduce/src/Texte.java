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
	//private HashMap<Character, Integer> freqs = new HashMap<Character, Integer>(); //HashMap liant un caract�re avec son nombre d'apparition 
	
	
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
	
	public String texte = ""; //On initialise notre texte comme une chaine de caract�res vide
	
	public String toStringTxt() throws FileNotFoundException {
		
		Scanner scan = new Scanner(new File(this.nom_texte)); //On cr�� un scanner qui va scanner le fichier en param�tre
        
        while(scan.hasNextLine()){ //Tant qu'il y a encore des lignes
            String ligne = scan.nextLine(); //On scan la ligne suivante
            //System.out.println(ligne); //On l'affiche
            texte += ligne; //et on l'ajoute au texte
        }
        
        return texte;
		
	}
	

	/*public HashMap<Character, Integer> analyse_text() throws FileNotFoundException { //Fonction qui scan le texte donn�
		
        Scanner scan = new Scanner(new File(this.nom_texte)); //On cr�� un scanner qui va scanner le fichier en param�tre
        
        while(scan.hasNextLine()){ //Tant qu'il y a encore des lignes
            String ligne = scan.nextLine(); //On scan la ligne suivante
            System.out.println(ligne); //On l'affiche
            texte += ligne; //et on l'ajoute au texte
        }
        
        String texteMin = texte.toLowerCase(); //Transforme tous les caract�res en minuscule
        char[] chars = texteMin.toCharArray(); //Cr�e une liste de caract�res
        for (int i = 0; i < texteMin.length(); i++) { //Pour tout les caract�res

            Integer freq_carac = freqs.get(chars[i]); //On initialise la fr�quence du caract�re gr�ce � notre HashMap et au caract�re en question
            if (freq_carac != null) { //Si le caract�re est d�j� renseign�
                freqs.put(chars[i], (freq_carac + 1)); //On incr�mente son nombre d'apparition
            }
            else {
            	freqs.put(chars[i], 1); //Sinon on l'initialise � 1
           }  
        }
        
        //Boucle test d'affichage
        for (char i : trierHashMap(freqs).keySet()) { //Pour tous les caract�res dans notre HashMap tri�e
        	
        	float freq_carac = ((float)freqs.get(i)/(float)texteMin.length())*100; //On calcul la fr�quence en pourcentage
        	}
        
        return trierHashMap(freqs);
	}
	//Split du fichier entre les diff�rents map
	
	
		public static HashMap<Character, Integer> trierHashMap(Map<Character, Integer> hmap){ //M�thode trouv�e sur internet (http://www.codeurjava.com/2015/07/comment-trier-une-hashmap-par-cles.html), le but est de trier notre HashMap en copiant les cl�s dans une liste afin de les trier avec Collections.sort()
			
	        List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>( hmap.entrySet()); //On cr�� une liste qui contient les informations de notre map. entrySet permet de parcourir les couples cl�/valeurs
	        
	        //Tri de la liste
	        Collections.sort( list, new Comparator<Map.Entry<Character, Integer>>(){ //Collections.sort ressemble au sort() utilis� sur les ArrayList, mais celui ci permet d'aussi trier les LinkedList
	        	
	           public int compare (Map.Entry<Character, Integer>o1, Map.Entry<Character, Integer> o2 ) { //On va donc comparer les diff�rents couples cl�/valeur
	              
	              return (o1.getValue()).compareTo( o2.getValue()); //On compare les valeurs des cl�s puisqu'on veut trier suivant les fr�quences
	           }
	        }
	        );

	        //Cr�ation d'une nouvelle HashMap � partir de la LinkedList
	        HashMap<Character, Integer> hmapTriee = new LinkedHashMap<Character, Integer>();
	        
	        for (Map.Entry<Character, Integer> entry : list){ //Pour tous les �l�ments de la liste
	            hmapTriee.put( entry.getKey(), entry.getValue() ); //On les les ins�res par couples dans notre HashMap.
	        }
	        
	        return hmapTriee; //On retourne notre HashMap tri�e. 
	    }*/

	
}
