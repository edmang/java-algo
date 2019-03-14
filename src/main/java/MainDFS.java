import dfs.DFS;
import dfs.Vertex;

import java.util.ArrayList;
import java.util.List;

public class MainDFS {

    public static void main(String[] args) {
        /**
         * DFS Algorithm
         */

        DFS dfs = new DFS();
        dfs.Vertex vertex1 = new dfs.Vertex("1");
        dfs.Vertex vertex2 = new dfs.Vertex("2");
        dfs.Vertex vertex3 = new dfs.Vertex("3");
        dfs.Vertex vertex4 = new dfs.Vertex("4");
        dfs.Vertex vertex5 = new dfs.Vertex("5");

        List<Vertex> vertexList = new ArrayList<>();
        vertex1.addNeighbour(vertex2);
        vertex1.addNeighbour(vertex3);
        vertex3.addNeighbour(vertex4);
        vertex4.addNeighbour(vertex5);

        vertexList.add(vertex1);
        vertexList.add(vertex2);
        vertexList.add(vertex3);
        vertexList.add(vertex4);
        vertexList.add(vertex5);

        dfs.dfs(vertexList, "r");

    }
}
