package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public void bfs(Vertex root) {

        /**
         * Queues are in FIFO structure:
         * First item in
         * First item out
         */
        Queue<Vertex> queue = new LinkedList<Vertex>();
        root.setVisited(true);
        queue.add(root);  // starting root

        while(!queue.isEmpty()) {
            Vertex actualVertex = queue.remove();  // FIFO
            System.out.println("Actual Vertex: " + actualVertex.getData());

            for(Vertex neighbour: actualVertex.getNeighbours()) {
                if (!neighbour.isVisited()) {
                    neighbour.setVisited(true);
                    queue.add(neighbour);
                }
            }
        }
    }
}
