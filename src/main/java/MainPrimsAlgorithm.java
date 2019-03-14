import primsAlgorithm.Edge;
import primsAlgorithm.PrimsAlgorithm;
import primsAlgorithm.Vertex;

import java.util.ArrayList;
import java.util.List;

public class MainPrimsAlgorithm {

    public static void main(String[] args) {
        List<Vertex> vertexList = new ArrayList<>();
        Vertex vertex0 = new Vertex("A");
        Vertex vertex1 = new Vertex("B");
        Vertex vertex2 = new Vertex("C");

        vertexList.add(vertex0);
        vertexList.add(vertex1);
        vertexList.add(vertex2);

        vertex0.addNeighbour(new Edge(1, vertex0, vertex1));
        vertex0.addNeighbour(new Edge(1, vertex0, vertex2));
        vertex0.addNeighbour(new Edge(10, vertex1, vertex2));

        vertex1.addNeighbour(new Edge(1, vertex1, vertex0));
        vertex2.addNeighbour(new Edge(1, vertex2, vertex0));
        vertex2.addNeighbour(new Edge(10, vertex2, vertex1));

        PrimsAlgorithm primsAlgorithm = new PrimsAlgorithm(vertexList);
        primsAlgorithm.primsAlgorithm(vertexList.get(0));

        primsAlgorithm.showMst();
    }
}
