package DAGShortestPath;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {

    private Stack<Vertex> stack;

    public TopologicalSort() {
        this.stack = new Stack<>();
    }

    public void sort(List<Vertex> vertexList) {
        for (Vertex vertex: vertexList) {
            if (!vertex.isVisited()) {
                dfs(vertex);
            }
        }
    }

    private void dfs(Vertex vertex) {
        for (Edge edge: vertex.getAdjencies()) {

            /*
            if (!edge.getDestination().isVisited()) {
                edge.getDestination().setVisited(true);
                dfs(edge.getDestination());
            }
            */

            Stack<Vertex> actualStack = new Stack<>();
            actualStack.push(vertex);
            while (!actualStack.isEmpty()) {
                Vertex actualVertex = actualStack.pop();
                for(Edge e: actualVertex.getAdjencies()) {
                    if (!e.getDestination().isVisited()) {
                        e.getDestination().setVisited(true);
                        actualStack.push(e.getDestination());
                    }
                }
            }

        }

        this.stack.push(vertex);
    }

    public Stack<Vertex> getTopologicalOrder() {
        Collections.reverse(this.stack);
        return this.stack;
    }
}
