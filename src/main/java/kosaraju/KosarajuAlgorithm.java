package kosaraju;

public class KosarajuAlgorithm {

    private int[] id;
    private int count;
    private boolean[] marked;

    public KosarajuAlgorithm(Graph graph) {
        DepthFirstOrder dfs = new DepthFirstOrder(graph.transposeGraph());
        this.marked = new boolean[graph.getVertexList().size()];
        this.id = new int[graph.getVertexList().size()];

        for (Vertex vertex: dfs.getReversePostOrder()) {
            if (!marked[vertex.getId()]) {
                dfs(vertex);
                this.count ++;
            }
        }
    }

    private void dfs(Vertex vertex) {
        this.marked[vertex.getId()]  = true;
        id[vertex.getId()] = count;
        vertex.setComponentId(count);

        for (Vertex v: vertex.getAdjencies()) {
            if (!marked[v.getId()]) {
                dfs(v);
            }
        }
    }

    public int getCount() {
        return this.count;
    }
}
