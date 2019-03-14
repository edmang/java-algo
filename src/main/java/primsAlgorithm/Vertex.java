package primsAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {

    private String name;
    private boolean isVisited;
    private Vertex previousVertex;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    private List<Edge> adjencies;
    private double distance = Double.POSITIVE_INFINITY;     // to check if the heap need to update

    public Vertex(String name) {
        this.name = name;
        this.adjencies = new ArrayList<>();
    }

    public void addNeighbour(Edge edge) {
        this.adjencies.add(edge);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public Vertex getPreviousVertex() {
        return previousVertex;
    }

    public void setPreviousVertex(Vertex previousVertex) {
        this.previousVertex = previousVertex;
    }

    public List<Edge> getAdjencies() {
        return adjencies;
    }

    public void setAdjencies(List<Edge> adjencies) {
        this.adjencies = adjencies;
    }

    @Override
    public int compareTo(Vertex o) {
        return Double.compare(this.distance, o.getDistance());
    }
}
