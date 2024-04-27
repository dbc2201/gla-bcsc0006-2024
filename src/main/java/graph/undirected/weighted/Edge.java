package graph.undirected.weighted;

import java.util.Objects;

public class Edge {
	private final Vertex toVertex;
	private final double weight;
	
	public Vertex getToVertex() {
		return toVertex;
	}
	
	public Edge(Vertex toVertex, double weight) {
		this.toVertex = toVertex;
		this.weight = weight;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Edge edge)) return false;
		return Double.compare(weight, edge.weight) == 0 &&
				Objects.equals(toVertex, edge.toVertex);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(toVertex, weight);
	}
	
	@Override
	public String toString() {
		return toVertex + "(" + weight + ")";
	}
}
