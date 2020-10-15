public class Persona_ implements Comparable<Persona_>{
    public String nom;
    public String dni;

    public Persona_(String _nom, String _dni){
        nom = _nom;
        dni = _dni;
    }

    @Override
    public int compareTo(Persona_ o) {
        return this.dni.compareTo(o.dni);
    }

    public String toString() {
        return "Persona{nom: " + nom + ", dni: " + dni + "}";
    }
}
