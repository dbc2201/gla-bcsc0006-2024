package graph.undirected.weighted;

import java.util.Objects;

public class Edge {
	private final Vertex fromVertex;
	private final Vertex toVertex;
	private final double weight;
	
	public Edge(Vertex fromVertex, Vertex toVertex, double weight) {
		this.fromVertex = fromVertex;
		this.toVertex = toVertex;
		this.weight = weight;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Edge edge)) return false;
		return Double.compare(weight, edge.weight) == 0 &&
				Objects.equals(fromVertex, edge.fromVertex) &&
				Objects.equals(toVertex, edge.toVertex);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(fromVertex, toVertex, weight);
	}
	
	@Override
	public String toString() {
		return fromVertex + " -- (" + weight + ") -- " + toVertex;
	}
}
