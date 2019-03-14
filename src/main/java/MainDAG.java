import DAGShortestPath.DAG;
import DAGShortestPath.Edge;
import DAGShortestPath.Vertex;

import java.util.ArrayList;
import java.util.List;

public class MainDAG {

    public static void main(String[] args) {

        List<Vertex> vertexList = new ArrayList<>();

        vertexList.add(new Vertex("A"));
        vertexList.add(new Vertex("B"));
        vertexList.add(new Vertex("C"));

        vertexList.get(0).addNeighbour(new Edge(vertexList.get(0), vertexList.get(1), 1));
        vertexList.get(0).addNeighbour(new Edge(vertexList.get(0), vertexList.get(2), 1));
        vertexList.get(1).addNeighbour(new Edge(vertexList.get(1), vertexList.get(2), 1));

        DAG dag = new DAG();
        dag.shortestPath(vertexList, vertexList.get(0), vertexList.get(2));
        dag.showShortestPath(vertexList.get(2));
    }
}
