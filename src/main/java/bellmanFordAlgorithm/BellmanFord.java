package bellmanFordAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BellmanFord {

    private List<Edge> edgeList;
    private List<Vertex> vertexList;

    public List<Vertex> getCycleList() {
        return cycleList;
    }

    private List<Vertex> cycleList;

    public BellmanFord(List<Edge> edgeList, List<Vertex> vertexList) {
        this.edgeList = edgeList;
        this.vertexList = vertexList;
        this.cycleList = new ArrayList<>();
    }

    public void bellmanFord(Vertex sourceVertex) {
        sourceVertex.setDistance(0);
        for (int i = 0; i < vertexList.size() - 1; i ++) {

            for (Edge edge: edgeList) {

                if (edge.getStartVertex().getDistance() == Double.MAX_VALUE) {
                    continue;
                }

                double newDistance = edge.getStartVertex().getDistance() + edge.getWeight();

                if (newDistance < edge.getTargetVertex().getDistance()) {
                    edge.getTargetVertex().setDistance(newDistance);
                    edge.getTargetVertex().setPreviousVertex(edge.getStartVertex());
                }
            }
        }

        for (Edge edge: edgeList) {
            if (edge.getStartVertex().getDistance() != Double.MAX_VALUE) {
                if (hasCycle(edge)) {
                    Vertex vertex = edge.getStartVertex();
                    while (!vertex.equals(edge.getTargetVertex())) {
                        this.cycleList.add(vertex);
                        vertex = vertex.getPreviousVertex();
                    }
                    this.cycleList.add(edge.getTargetVertex());
                    System.out.println("There is a cycle");
                    return;
                }
            }
        }
    }

    private boolean hasCycle(Edge edge) {
        return edge.getStartVertex().getDistance() + edge.getWeight() < edge.getTargetVertex().getDistance();
    }

    public List<Vertex> shortestPath(Vertex targetVertex) {
        if (targetVertex.getDistance() == Double.MAX_VALUE) {
            System.out.println("There is no path to this vertex");
            return null;
        }

        List<Vertex> shortPath = new ArrayList<>();
        for (Vertex predecessor = targetVertex; predecessor != null; predecessor = predecessor.getPreviousVertex()) {
            shortPath.add(predecessor);
        }
        Collections.reverse(shortPath);
        return shortPath;
    }
}
