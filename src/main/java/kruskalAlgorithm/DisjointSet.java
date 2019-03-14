package kruskalAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {

    private int nodeCount = 0;
    private int setCount = 0;
    private List<Node> rootNodes;                               // the representative node

    public DisjointSet(List<Vertex> vertexList) {
        this.rootNodes = new ArrayList<>(vertexList.size());
        makeSets(vertexList);
    }

    public int find(Node n) {
        Node currentNode = n;
        while (currentNode.getParent() != null) {
            currentNode = currentNode.getParent();
        }                                                       // while it is not the null then find the parent !

        Node rootNode = currentNode;                            // got the parent
        currentNode = n;

        while (currentNode != rootNode) {
            Node tempNode = currentNode.getParent();
            currentNode.setParent(rootNode);                    // reset the parent
                                                                // same as the previous while loop, instead this time
                                                                // we set the parent instead of a null
                                                                // this is the Path Compression !! :)
            currentNode = tempNode;
        }
        return rootNode.getId();
    }

    public void union(Node node1, Node node2) {
        int index1 = find(node1);
        int index2 = find(node2);

        if (index1 == index2) {
            return;                                             // cannot merge them because they are already in a set
        }

        Node root1 = this.rootNodes.get(index1);                // rootNodes List is not empty because when makingSets, this list is already populated
        Node root2 = this.rootNodes.get(index2);

        if (root1.getRank() < root2.getRank()) {
            root1.setParent(root2);
        } else if (root1.getRank() > root2.getRank()) {
            root2.setParent(root1);
        } else {
            root2.setParent(root1);                             // arbitrage choice
            root2.setRank(root1.getRank() + 1);
        }

        this.setCount --;                                       // -- because now 2 disjoint sets -> 1
    }

    private void makeSets(List<Vertex> vertexList) {
        for (Vertex v: vertexList) {
            makeSet(v);                                         // attribute all vertices to a node
        }
    }

    private void makeSet(Vertex vertex) {
        Node n = new Node(this.rootNodes.size(),0, null);
        vertex.setNode(n);                                      // this method attribute a vertex to a node
                                                                // that's why it is a null as parent
        this.rootNodes.add(n);
        this.setCount ++;
        this.nodeCount ++;
    }
}
