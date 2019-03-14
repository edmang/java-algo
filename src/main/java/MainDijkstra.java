import dijkstraAlgorithm.DijkstraAlgorithm;
import dijkstraAlgorithm.Edge;
import dijkstraAlgorithm.Vertex;

import java.util.Arrays;
import java.util.List;

public class MainDijkstra {

    public static void main(String[] args) {

        Vertex vA = new Vertex("A");        // root vertex
        Vertex vB = new Vertex("B");
        Vertex vC = new Vertex("C");
        Vertex vD = new Vertex("D");
        Vertex vE = new Vertex("E");
        Vertex vF = new Vertex("F");
        Vertex vG = new Vertex("G");
        Vertex vH = new Vertex("H");

        Edge edgeAB = new Edge(vA, vB, 5);
        Edge edgeAH = new Edge(vA, vH, 8);
        Edge edgeAE = new Edge(vA, vE, 9);

        Edge edgeBH = new Edge(vB, vH, 4);
        Edge edgeBD = new Edge(vB, vD, 15);
        Edge edgeBC = new Edge(vB, vC, 12);

        Edge edgeHC = new Edge(vH, vC, 7);
        Edge edgeHF = new Edge(vH, vF, 6);

        Edge edgeEH = new Edge(vE, vH, 5);
        Edge edgeEF = new Edge(vE, vF, 4);
        Edge edgeEG = new Edge(vE, vG, 20);

        Edge edgeCD = new Edge(vC, vD, 3);
        Edge edgeCG = new Edge(vC, vG, 11);

        Edge edgeFC = new Edge(vF, vC, 1);
        Edge edgeFG = new Edge(vF, vG, 13);

        Edge edgeDG = new Edge(vD, vG, 9);

        vA.addNeighbours(new Edge[] {edgeAB, edgeAH, edgeAE});
        vB.addNeighbours(new Edge[] {edgeBH, edgeBD, edgeBC});
        vC.addNeighbours(new Edge[] {edgeCD, edgeCG});
        vD.addNeighbours(new Edge[] {edgeDG});
        vE.addNeighbours(new Edge[] {edgeEH, edgeEF, edgeEG});
        vF.addNeighbours(new Edge[] {edgeFC, edgeFG});
        vH.addNeighbours(new Edge[] {edgeHF, edgeHC});

        List<Vertex> graph = Arrays.asList(new Vertex[] {vA, vB, vC, vD, vE, vF, vG, vH});
        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm(vA, graph);
        dijkstraAlgorithm.run();
    }
}
