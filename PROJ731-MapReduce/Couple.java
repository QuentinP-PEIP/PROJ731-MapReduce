public class Couple {
    private String mot;
    private Integer nombre;

    public Couple(String m, Integer n){
        this.mot = m;
        this.nombre = n;
    }

    public String get_mot(){
        return this.mot;
    }

    public Integer get_nombre(){
        return this.nombre;
    }
    
    public void afficher(){
        System.out.println("(" + this.get_mot() + "," + get_nombre() + ")");
    }
}
