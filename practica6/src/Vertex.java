import java.util.ArrayList;
import java.util.List;

public class Vertex {
    public static final double INFINITY = Double.MAX_VALUE;
    String name;
    List<Edge> adj = new ArrayList<Edge>();
    double dist;
    Vertex prev;

    public Vertex(String name) {
        this.name = name;
    }

    public Vertex(double dist) {
        this.dist = dist;
    }

    public void reset(){
        this.prev = null;
        this.dist = INFINITY;
    }
}
