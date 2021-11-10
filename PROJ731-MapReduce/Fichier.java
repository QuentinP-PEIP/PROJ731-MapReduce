import java.io.*;
import java.util.*;

//import javax.sql.rowset.spi.SyncResolver;

//import java.io.BufferedWriter;
import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;

public class Fichier {
    int number;	//Texte dans le fichier
    ArrayList<String> texte_divise;

    public Fichier(String fichier) {
        String adresse = "Textes\\" + fichier;
		this.number = this.count_line(adresse);

        System.out.println("Le fichier contient " + this.number + " lignes");
        
        this.texte_divise = this.cut(adresse);

        System.out.println("Partie 1: \n" + texte_divise.get(0) + "\n");
        System.out.println("Partie 2: \n" + texte_divise.get(1) + "\n");

    }

    public int count_line(String adresse){ //Fonction qui permet de compter le nombre de ligne dans le document donné par l'adresse
        int line_number = 0;
        
        try {
                File myObj = new File(adresse);
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    line_number += 1;
                    myReader.nextLine();
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        return line_number;
    }
    
    public ArrayList<String> cut(String adresse){ //Fonction qui permet de couper le texte en Deux et le renvoie dans un tableau
        ArrayList<String> tableau = new ArrayList<String>();
        tableau.add(0, "");
        tableau.add(1, "");
        int line_number = 0;
        int moitie = this.number/2;

        try {
            File myObj = new File(adresse);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(line_number < moitie){
                    tableau.set(0, tableau.get(0) + " " + data); 
                }
                else{
                    tableau.set(1, tableau.get(1) + " " + data);
                }
                line_number += 1;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return tableau;
    }
}
