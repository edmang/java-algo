package dijkstraUdemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {

    public void computePaths(Vertex sourceVertex) {

        sourceVertex.setDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);

        while (!priorityQueue.isEmpty()) {

            Vertex actualVertex = priorityQueue.poll();
            for (Edge edge: actualVertex.getAdjacenciesList()) {

                Vertex v = edge.getTargetVertex();
                double newDistance = actualVertex.getDistance() + edge.getWeight();

                if (newDistance < v.getDistance()) {
                    v.setDistance(newDistance);
                    //priorityQueue.remove(v);
                    v.setPredecessor(actualVertex);
                    priorityQueue.add(v);
                }
            }
        }
    }

    public List<Vertex> getShortesPath(Vertex startVertex) {
        List<Vertex> shortestVertex = new ArrayList<>();

        for (Vertex predecessor = startVertex; predecessor != null; predecessor = predecessor.getPredecessor()) {
            shortestVertex.add(predecessor);
        } // "for" form of a "while" ;)
        Collections.reverse(shortestVertex);
        return shortestVertex;
    }
}
