package DAGShortestPath;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class DAG {

    public void shortestPath(List<Vertex> vertexList, Vertex sourceVertex, Vertex targetVertex) {

        sourceVertex.setDistance(0);
        TopologicalSort topologicalSort = new TopologicalSort();

        topologicalSort.sort(vertexList);
        Stack<Vertex> stack = topologicalSort.getTopologicalOrder();

        for (Vertex actualVertex: stack) {

            for(Edge edge: actualVertex.getAdjencies()) {

                Vertex u = edge.getOrigin();
                Vertex v = edge.getDestination();

                double newDistance = u.getDistance() + edge.getWeight();
                if (newDistance < v.getDistance()) {
                    v.setDistance(newDistance);
                    v.setPredecessor(u);
                }
            }
        }

        if (targetVertex.getDistance() == Double.MAX_VALUE) {
            System.out.println("No shortest path");
        }
    }

    public void showShortestPath(Vertex targetVertex) {
        List<Vertex> list = new ArrayList<>();
        for (Vertex predecessor = targetVertex; predecessor != null; predecessor = predecessor.getPredecessor()) {
            list.add(predecessor);
        }

        Collections.reverse(list);
        System.out.println(list);
    }
}
