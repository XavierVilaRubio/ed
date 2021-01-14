import java.util.*;

public class Graph {
    public static final double INFINITY = Double.MAX_VALUE;
    public HashMap<String, Vertex> vertexMap = new HashMap<String, Vertex>();
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
            System.out.println();
            printPath(w);
        }
    }
    public Vertex vertex_min_dist(HashMap<String, Vertex> N)
    {
        Vertex minim_value = new Vertex(INFINITY);
        String minim_key = null;
        for (Map.Entry<String, Vertex> entry: N.entrySet()) {
            if (entry.getValue().dist < minim_value.dist) {
                minim_key = entry.getKey();
                minim_value = entry.getValue();
            }

        }
        return N.remove(minim_key);
    }
    public void dijkstra(String startName)
    {
        Vertex v = getVertex(startName);
        clearAll();
        v.dist = 0;
        HashMap<String, Vertex> N = new HashMap<>(vertexMap);
        while(!N.isEmpty())
        {
            Vertex u = vertex_min_dist(N);
            for(Edge edge : u.adj) {
                if (N.containsValue(edge.dest)) {
                    if(edge.dest.dist > u.dist + edge.cost) {
                        edge.dest.dist = u.dist + edge.cost;
                        edge.dest.prev = u;
                    }else {
                        edge.dest.dist = edge.cost;
                    }
                }
            }
        }
    }
    private Vertex getVertex(String vertexName)
    {
        Vertex v = vertexMap.get(vertexName);
        if (v == null) {
            v = new Vertex(vertexName);
            vertexMap.put(vertexName, v);
        }
        return v;
    }
    private void printPath(Vertex dest)
    {
        //System.out.print(dest.name);
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
