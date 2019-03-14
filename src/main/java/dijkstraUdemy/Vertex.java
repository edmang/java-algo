package dijkstraUdemy;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {
    // implements Comparable interface !!
    // another way is to create a comparator class implements Comparable<Vertex>
    // and add the class to the constructor of the PriorityQueue

    private String name;
    private List<Edge> adjacenciesList;
    private boolean isVisited;
    private Vertex predecessor;
    private double distance = Double.MAX_VALUE;

    public Vertex(String name) {
        this.name = name;
        adjacenciesList = new ArrayList<>();
    }

    public void addNeighbour(Edge edge) {
        this.adjacenciesList.add(edge);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getAdjacenciesList() {
        return adjacenciesList;
    }

    public void setAdjacenciesList(List<Edge> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
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

    @Override
    public int compareTo(Vertex o) {
        return Double.compare(this.distance, o.getDistance());
    }
}
