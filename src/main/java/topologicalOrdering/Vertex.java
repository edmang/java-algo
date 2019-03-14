package topologicalOrdering;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Vertex {

    private String data;
    private boolean isVisited;
    private List<Vertex> neighbours;

    // Constructor
    public Vertex(String data) {
        this.data = data;
        this.neighbours = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex) {
        this.neighbours.add(vertex);
    }

    @Override
    public String toString() {
        return this.data;
    }
}
