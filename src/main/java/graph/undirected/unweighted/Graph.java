package graph.undirected.unweighted;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	Map<Vertex, List<Vertex>> adjacencyList;
	
	public Graph() {
		adjacencyList = new HashMap<>();
	}
}
