package graph.undirected.unweighted;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
	
	public void printGraph() {
		adjacencyList.forEach(
				((vertex, verticesList) -> System.out.println("{" + vertex + ", " + verticesList + "}"))
		);
	}
	
	public void removeVertex(String label) {
		Vertex vertex = new Vertex(label);
		adjacencyList.remove(vertex);
		adjacencyList.forEach((currentVertex, verticesList) -> verticesList.remove(vertex));
	}
}
