package primsAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgorithm {

    private List<Vertex> unvisitedVertices;
    private List<Edge> spanningTree;
    private PriorityQueue<Edge> edgeHeap;
    private double fullCost;

    public PrimsAlgorithm(List<Vertex> unvisitedVertices) {
        this.unvisitedVertices = unvisitedVertices;
        this.spanningTree = new ArrayList<>();
        this.edgeHeap = new PriorityQueue<>();
    }

    public void primsAlgorithm(Vertex randomVertex) {
        this.unvisitedVertices.remove(randomVertex);                                                                    // start at random point

        while (!unvisitedVertices.isEmpty()) {
            for (Edge edge : randomVertex.getAdjencies()) {
                if (this.unvisitedVertices.contains(edge.getTargetVertex())) {                                          // check if it is in the current PriorityQueue
                    this.edgeHeap.add(edge);                                                                            // may use the boolean in the class definition of Vertex
                }
            }

            Edge minEdge = this.edgeHeap.remove();

            this.spanningTree.add(minEdge);
            this.fullCost += minEdge.getWeight();
            randomVertex = minEdge.getTargetVertex();

            this.unvisitedVertices.remove(randomVertex);
        }
    }

    public void showMst() {
        for (Edge edge : this.spanningTree) {
            System.out.println(edge.getStartVertex() + " - " + edge.getTargetVertex());
        }
    }
}
