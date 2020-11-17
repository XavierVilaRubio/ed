public class Coche implements Comparable<Coche>{
    public String matricula;

    public Coche(String new_matricula){
        matricula = new_matricula;
    }

    @Override
    public int compareTo(Coche o) {
        return this.matricula.compareTo(o.matricula);
    }

    public String toString() {
        return "Coche{matricula: " + matricula + "}";
    }
}
