package cycleDetectionDFS;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Vertex {

    private String name;
    private boolean visited;
    private boolean beingVisited;
    private List<Vertex> adjancenciesList;

    public Vertex(String name) {
        this.name = name;
        this.adjancenciesList = new ArrayList<>();
    }

    public boolean isVisited() {
        return this.visited;
    }

    public boolean isBeingVisited() {
        return this.beingVisited;
    }

    public void addNeightbour(Vertex vertex) {
        this.adjancenciesList.add(vertex);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
