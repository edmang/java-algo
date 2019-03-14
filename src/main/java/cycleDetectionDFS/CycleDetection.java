package cycleDetectionDFS;

import java.util.List;

public class CycleDetection {

    public void detectCycle(List<Vertex> vertexList) {

        for(Vertex v: vertexList) {
            if (!v.isVisited()) {
                dfs(v);
            }
        }
    }

    public void dfs(Vertex vertex) {
        System.out.println("DFS on vertex " + vertex);
        vertex.setBeingVisited(true);
        for(Vertex v: vertex.getAdjancenciesList()) {
            if (!v.isBeingVisited()) {  // this condition check if the Vertex is already in a status "Being Visited"
                System.out.println("There is a backward edge -> there is a cycle");
                return;
            }

            if(!v.isVisited()) {
                v.setVisited(true);
                dfs(v);
            }
        }
        vertex.setBeingVisited(true);
        vertex.setVisited(true);
    }
}
