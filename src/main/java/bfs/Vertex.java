package bfs;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Vertex {

    private int data;
    private boolean isVisited;
    private List<Vertex> neighbours;

    // Constructor
    public Vertex(int data) {
        this.data = data;
        this.neighbours = new ArrayList<Vertex>();
    }

    // Add neighbourhood
    public void addNeighbour(Vertex neighbour) {
        this.neighbours.add(neighbour);
    }
}


