package kosaraju;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private int id;
    private String name;
    private boolean isVisited;
    private List<Vertex> adjencies;
    private int componentId;

    public Vertex(int id, String name) {
        this.id = id;
        this.name = name;
        this.adjencies = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex) {
        this.adjencies.add(vertex);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Vertex> getAdjencies() {
        return adjencies;
    }

    public void setAdjencies(List<Vertex> adjencies) {
        this.adjencies = adjencies;
    }

    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }
}
