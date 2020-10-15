public class Coche implements Comparable<Coche>{
    public String matricula;

    public Coche(String _matricula){
        matricula = _matricula;
    }

    @Override
    public int compareTo(Coche o) {
        return this.matricula.compareTo(o.matricula);
    }

    public String toString() {
        return "Coche{matricula: " + matricula + "}";
    }
}
