package graph.undirected.weighted;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WeightedGraph {
	private final Map<Vertex, List<Edge>> adjacencyList;
	
	public WeightedGraph() {
		adjacencyList = new HashMap<>();
	}
	
	public void addVertex(String label) {
		Vertex vertex = new Vertex(label);
		adjacencyList.putIfAbsent(vertex, new LinkedList<>());
	}
	
	public void addEdge(String fromVertex, String toVertex, double weight) {
		Vertex vertex1 = new Vertex(fromVertex);
		Vertex vertex2 = new Vertex(toVertex);
		adjacencyList.get(vertex1).add(new Edge(vertex2, weight));
		adjacencyList.get(vertex2).add(new Edge(vertex1, weight));
	}
	
	public void printGraph() {
		adjacencyList.forEach((vertex, edges) -> {
			System.out.print("[");
			System.out.print(vertex + ", ");
			System.out.print("{" + edges + "}");
			System.out.println("]");
		});
	}
	
	public void removeVertex(String label) {
		Vertex vertex = new Vertex(label);
		adjacencyList.remove(vertex);
		adjacencyList.forEach(
				(currentVertex, edges) ->
						edges.removeIf(
								edge -> edge.getToVertex().equals(vertex)
						)
		);
	}
	
	public void removeEdge(String fromVertex, String toVertex) {
		Vertex vertex1 = new Vertex(fromVertex);
		Vertex vertex2 = new Vertex(toVertex);
		adjacencyList.get(vertex1).removeIf(
				currentEdge -> currentEdge.getToVertex().equals(vertex2)
		);
		adjacencyList.get(vertex2).removeIf(
				currentEdge -> currentEdge.getToVertex().equals(vertex1)
		);
	}
}
