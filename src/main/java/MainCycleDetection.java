import cycleDetectionDFS.CycleDetection;
import cycleDetectionDFS.Vertex;

import java.util.ArrayList;
import java.util.List;

public class MainCycleDetection {

    public static void main(String[] args) {

        /**
         * Cycle Detection
         */
        CycleDetection cycleDetection = new CycleDetection();
        Vertex vertex1 = new Vertex("1");
        Vertex vertex2 = new Vertex("2");
        Vertex vertex3 = new Vertex("3");
        Vertex vertex4 = new Vertex("4");
        Vertex vertex5 = new Vertex("5");
        Vertex vertex6 = new Vertex("6");

        vertex1.addNeightbour(vertex2);
        vertex2.addNeightbour(vertex3);
        vertex4.addNeightbour(vertex1);
        vertex4.addNeightbour(vertex5);
        vertex5.addNeightbour(vertex6);
        vertex6.addNeightbour(vertex4);

        List<Vertex> graph = new ArrayList<>();
        graph.add(vertex1);
        graph.add(vertex2);
        graph.add(vertex3);
        graph.add(vertex4);
        graph.add(vertex5);
        graph.add(vertex6);

        cycleDetection.detectCycle(graph);

    }
}
