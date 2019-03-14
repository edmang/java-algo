package DAGShortestPath;

public class Edge {

    private Vertex origin;
    private Vertex destination;
    private double weight;

    public Edge(Vertex origin, Vertex destination, double weight) {
        this.origin = origin;
        this.destination = destination;
        this.weight = weight;
    }

    public Vertex getOrigin() {
        return origin;
    }

    public void setOrigin(Vertex origin) {
        this.origin = origin;
    }

    public Vertex getDestination() {
        return destination;
    }

    public void setDestination(Vertex destination) {
        this.destination = destination;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "origin=" + origin +
                ", destination=" + destination +
                ", weight=" + weight +
                '}';
    }
}
