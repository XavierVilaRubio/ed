public class Lector extends Persona{
    public String grup;

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public Lector(String _nom, String _dni, String _grup){
        nom = _nom;
        dni = _dni;
        grup = _grup;
    }

    @Override
    public String toString() {
        return super.toString() + " Grup: " + grup;
    }
}
