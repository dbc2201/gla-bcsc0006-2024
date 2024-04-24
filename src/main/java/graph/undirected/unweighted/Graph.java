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
}
