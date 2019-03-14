package kosaraju;

import java.util.Stack;

public class DepthFirstOrder {

    private Stack stack;

    public DepthFirstOrder(Graph graph) {
        this.stack = new Stack();
        
        for(Vertex vertex: graph.getVertexList()) {
            if(!vertex.isVisited()) {
                dfs(vertex);
            }
        }
    }

    private void dfs(Vertex vertex) {
        for (Vertex v: vertex.getAdjencies()) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dfs(v);
            }
        }
    }

    public Stack<Vertex> getReversePostOrder () {
        return this.stack;
    }
}
