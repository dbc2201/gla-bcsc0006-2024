package graph.undirected.unweighted;

import java.util.*;

public class Graph {
	Map<Vertex, List<Vertex>> adjacencyList;
	
	public Graph() {
		adjacencyList = new HashMap<>();
	}
	
	public void addVertex(String label) {
		adjacencyList.putIfAbsent(new Vertex(label), new LinkedList<>());
	}
	
	public void addEdge(String label1, String label2) {
		Vertex vertex1 = new Vertex(label1);
		Vertex vertex2 = new Vertex(label2);
		adjacencyList.get(vertex1).add(vertex2);
		adjacencyList.get(vertex2).add(vertex1);
	}
}
