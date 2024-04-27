package graph.undirected.weighted;

import java.util.Objects;

public class Vertex {
	private final String label;
	
	public Vertex(String label) {
		this.label = label;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Vertex vertex)) return false;
		return Objects.equals(label, vertex.label);
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(label);
	}
	
	@Override
	public String toString() {
		return label;
	}
}
