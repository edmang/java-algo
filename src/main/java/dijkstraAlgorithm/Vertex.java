package dijkstraAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String data;
    private int weight;
    private Vertex predecessor;
    private List<Edge> neighbours;

    public Vertex(String data) {
        this.data = data;
        this.neighbours = new ArrayList<>();
    }

    public void addNeighbours(Edge[] edges) {
        for(int i = 0; i < edges.length; i ++) {
            this.neighbours.add(edges[i]);
        }
    }

    public void addNeighour(Edge edge) {
        this.neighbours.add(edge);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public List<Edge> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Edge> neighbours) {
        this.neighbours = neighbours;
    }

    @Override
    public String toString() {
        return this.data;
    }
}
