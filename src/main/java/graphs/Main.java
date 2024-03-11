package graphs;

public class Main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");
        myGraph.addEdge("A","B");
        myGraph.addEdge("A","D");
        myGraph.addEdge("B","C");
        myGraph.addEdge("C","D");
        myGraph.printGraph();
        System.out.println();

        System.out.println("Remove Edge:");
        myGraph.removeEdge("A", "D");
        myGraph.printGraph();
        System.out.println();

        System.out.println("Remove Vertex:");
        myGraph.removeVertex("D");
        myGraph.printGraph();
        System.out.println();
    }
}
