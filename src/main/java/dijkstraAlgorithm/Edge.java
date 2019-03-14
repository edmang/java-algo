package dijkstraAlgorithm;

public class Edge {

    private Vertex from;
    private Vertex to;
    private int distance;

    public Edge(Vertex from, Vertex to, int distance) {
        this.from = from;
        this.to = to;
        this.distance = distance;
    }

    public Vertex getFrom() {
        return from;
    }

    public void setFrom(Vertex from) {
        this.from = from;
    }

    public Vertex getTo() {
        return to;
    }

    public void setTo(Vertex to) {
        this.to = to;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
