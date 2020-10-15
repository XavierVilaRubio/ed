public class Aliases {
    public static void main(String[] args){
        Persona x = new Persona();
        Persona y = new Persona();
        x.nom = "Joan";
        y.nom = "Alberto";
        Persona z;
        z = x;
        x = y;
        x.nom = "Marc";
        System.out.println("Nom en x es: " + x.nom);
        System.out.println("Nom en y es: " + y.nom);
        System.out.println("Nom en z es: " + z.nom);
    }
}
