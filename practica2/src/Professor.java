public class Professor extends Persona{
    public String despatx;

    public String getDespatx() {
        return despatx;
    }

    public void setDespatx(String despatx) {
        this.despatx = despatx;
    }

    public Professor(String _nom, String _dni, String _despatx){
        nom = _nom;
        dni = _dni;
        despatx = _despatx;
    }

    @Override
    public String toString() {
        return super.toString() + " Despatx: " + despatx;
    }
}
