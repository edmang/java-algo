package dfs;

import java.util.List;
import java.util.Stack;

public class DFS {

    private Stack<Vertex> stack = new Stack<>();

    public void dfs(List<Vertex> vertexList, String type) {

        for (Vertex vertex: vertexList) {

            if(!vertex.isVisited()) {
                vertex.setVisited(true);
                if (type.equals("i")) {
                    dfsWithStack(vertex);
                }
                if (type.equals("r")) {
                    dfsRecursive(vertex);
                }
            }
        }
    }

    /**
     * LIFO Structure
     * Last In First Out
     * @param rootVertex
     */
    private void dfsWithStack(Vertex rootVertex) {
        this.stack.add(rootVertex);
        rootVertex.setVisited(true);
        while(!stack.isEmpty()) {
            /**
             * Important line: the LIFO structure
             */
            Vertex actualVertex = this.stack.pop();  // remove the top && return it
            System.out.println("Actual Vertex: " + actualVertex.getName());

            for(Vertex neighbour: actualVertex.getNeighbours()) {
                if (!neighbour.isVisited()) {
                    neighbour.setVisited(true);
                    stack.push(neighbour);
                }
            }
        }
    }

    /**
     * OS will automatically handling the use of stack in recursive case
     * @param vertex
     */
    private void dfsRecursive(Vertex vertex) {
        System.out.println("Actual Vertex: " + vertex.getName());
        for(Vertex v: vertex.getNeighbours()) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dfsRecursive(v);
            }
        }
    }
}
