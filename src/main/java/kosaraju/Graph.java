package kosaraju;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<Edge> edgeList;
    private List<Vertex> vertexList;

    public Graph() {
    }

    public Graph(List<Edge> edgeList, List<Vertex> vertexList) {
        this.edgeList = edgeList;
        this.vertexList = vertexList;
    }

    public Graph transposeGraph() {
        Graph transposedGraph = new Graph();
        List<Vertex> transposedVertexList = new ArrayList<>();

        for (Vertex vertex : this.vertexList) {
            transposedVertexList.add(vertex);
        }

        for (Edge edge : this.edgeList) {
            transposedVertexList.get(transposedVertexList.indexOf(edge.getTargetVertex())).addNeighbour(edge.getStartVertex());
        }
        transposedGraph.setVertexList(transposedVertexList);
        return transposedGraph;
    }

    public List<Edge> getEdgeList() {
        return edgeList;
    }

    public void setEdgeList(List<Edge> edgeList) {
        this.edgeList = edgeList;
    }

    public List<Vertex> getVertexList() {
        return vertexList;
    }

    public void setVertexList(List<Vertex> vertexList) {
        this.vertexList = vertexList;
    }
}
