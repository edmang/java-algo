import dijkstraUdemy.DijkstraAlgorithm;
import dijkstraUdemy.Edge;
import dijkstraUdemy.Vertex;

public class MainDijkstraUdemy {

    public static void main(String[] args) {

        Vertex v0 = new Vertex("A");
        Vertex v1 = new Vertex("B");
        Vertex v2 = new Vertex("C");

        v0.addNeighbour(new Edge(1, v0, v1));
        v0.addNeighbour(new Edge(3, v0, v2));
        v1.addNeighbour(new Edge(1, v1, v2));

        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
        dijkstraAlgorithm.computePaths(v0);
        System.out.println(dijkstraAlgorithm.getShortesPath(v2));
    }
}
