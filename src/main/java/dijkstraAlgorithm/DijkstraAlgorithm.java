package dijkstraAlgorithm;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class DijkstraAlgorithm {

    private Vertex rootVertex;
    private List<Vertex> graph;
    private Queue<Vertex> queue;

    public DijkstraAlgorithm(Vertex rootVertex, List<Vertex> graph) {

        this.rootVertex = rootVertex;
        this.graph = graph;
        queue = new PriorityQueue<>(new VertexComparator());
    }

    public void run() {
        queue.add(rootVertex);
        for(Vertex vertex: graph) {
            vertex.setWeight(999999);
            queue.add(vertex);
        }
        rootVertex.setWeight(0);

        while(!queue.isEmpty()) {
            Vertex currentVertex = queue.poll();
            for(Edge edge: currentVertex.getNeighbours()) {
                int tempValue = rootVertex.getWeight() + edge.getDistance();
                if (tempValue < edge.getTo().getWeight()) {
                    edge.getTo().setWeight(tempValue);
                    edge.getTo().setPredecessor(currentVertex);
                }
            }
            System.out.println(currentVertex.getPredecessor());
        }
    }
}
