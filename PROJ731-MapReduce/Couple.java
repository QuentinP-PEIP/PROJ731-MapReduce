public class Couple {
    private String mot;
    private Integer nombre;

    public Couple(String m, Integer n){ //Création d'une classe Couple
        this.mot = m; //Elle contient un mot
        this.nombre = n; //Et un nombre
    }

    public String get_mot(){
        return this.mot;
    }

    public Integer get_nombre(){
        return this.nombre;
    }
    
    public void afficher(){ //Fonction pour afficher un Couple
        System.out.println("(" + this.get_mot() + "," + get_nombre() + ")");
    }
}
