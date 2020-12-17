import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Graph {
    public static final double INFINITY = Double.MAX_VALUE;    

    public void addEdge(String sourceName, String destName, double cost)
    {
        Vertex v = getVertex(sourceName);
        Vertex w = getVertex(destName);
        v.adj.add(new Edge(w, cost));
    }
    public void printPath(String destName)
    {
        Vertex w = vertexMap.get(destName);
        if (w == null)
            System.out.println("Error");
        else if (w.dist == INFINITY)
            System.out.println("Path does not exist");
        else
        {
            System.out.print("Cost is: " + w.dist);
            printPath(w);
            System.out.println();
        }
    }
    public void dijkstra(String startName)
    {
        PriorityQueue<Path> pq = new PriorityQueue<Path>();
	//TO BE COMPLETED

    }
    private Vertex getVertex(String vertexName){
        Vertex v;
        return v;
    }
    private void printPath(Vertex dest){
        if (dest.prev != null)
        {
            printPath(dest.prev);
            System.out.print(" to ");
        }
        System.out.print(dest.name);

    }
    private void clearAll()
    {
        for (Vertex v : vertexMap.values())
            v.reset();
    }
}
