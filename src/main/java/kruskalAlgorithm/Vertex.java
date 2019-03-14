package kruskalAlgorithm;

public class Vertex {
    private String name;
    private Node node; // every vertex is itself a disjoint set, that we are going to merge later in the spanning tree

    public Vertex(String name) {
        this.name = name;
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

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}
