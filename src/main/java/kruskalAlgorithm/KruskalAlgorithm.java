package kruskalAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalAlgorithm {

    public void spanningTree(List<Vertex> vertexList, List<Edge> edgeList) {

        DisjointSet disjointSet = new DisjointSet(vertexList);
        List<Edge> minimumSpanningTree = new ArrayList<>();

        Collections.sort(edgeList);

        for (Edge edge: edgeList) {

            Vertex u = edge.getStartVertex();
            Vertex v = edge.getTargetVertex();

            if (disjointSet.find(u.getNode()) != disjointSet.find(v.getNode())) {                                       // they are not in the same disjoint set --> can add them together
                minimumSpanningTree.add(edge);
                disjointSet.union(u.getNode(), v.getNode());
            }
        }

        for (Edge edge: minimumSpanningTree) {
            System.out.println(edge.getStartVertex() + " " + edge.getTargetVertex() + " -- ");
        }
    }
}
