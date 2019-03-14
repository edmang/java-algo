package DAGShortestPath;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private Vertex predecessor;
    private List<Edge> adjencies;
    private boolean isVisited;
    private double distance = Double.MAX_VALUE;

    public Vertex(String name) {
        this.name = name;
        this.adjencies = new ArrayList<>();
    }

    public void addNeighbour(Edge edge) {
        this.adjencies.add(edge);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public List<Edge> getAdjencies() {
        return adjencies;
    }

    public void setAdjencies(List<Edge> adjencies) {
        this.adjencies = adjencies;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
