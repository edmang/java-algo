package dfs;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Vertex {

    private String name;
    private boolean isVisited;
    private List<Vertex> neighbours;

    // Constructor
    public Vertex(String name) {
        this.name = name;
        this.neighbours = new ArrayList<Vertex>();
    }

    // Add neighbourhood
    public void addNeighbour(Vertex neighbour) {
        this.neighbours.add(neighbour);
    }

}
