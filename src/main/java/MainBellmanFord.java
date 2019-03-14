import bellmanFordAlgorithm.BellmanFord;
import bellmanFordAlgorithm.Edge;
import bellmanFordAlgorithm.Vertex;

import java.util.ArrayList;
import java.util.List;

public class MainBellmanFord {

    public static void main(String[] args) {

        List<Vertex> vertexList = new ArrayList<>();

        vertexList.add(new Vertex("A"));
        vertexList.add(new Vertex("B"));
        vertexList.add(new Vertex("C"));

        List<Edge> edgeList = new ArrayList<>();
        edgeList.add(new Edge(1, vertexList.get(0), vertexList.get(1)));
        edgeList.add(new Edge(10, vertexList.get(0), vertexList.get(2)));
        edgeList.add(new Edge(1, vertexList.get(1), vertexList.get(2)));

        BellmanFord bellmanFord = new BellmanFord(edgeList, vertexList);
        bellmanFord.bellmanFord(vertexList.get(0));
        System.out.println(bellmanFord.shortestPath(vertexList.get(2)));
    }
}
