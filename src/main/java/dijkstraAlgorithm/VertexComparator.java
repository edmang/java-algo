package dijkstraAlgorithm;

import java.util.Comparator;

public class VertexComparator implements Comparator<Vertex> {

    @Override
    public int compare(Vertex v1, Vertex v2) {
        if (v1.getWeight() > v2.getWeight()) {
            return 1;
        } else if(v1.getWeight() < v2.getWeight()) {
            return - 1;
        } else {
            return 0;
        }
    }
}
