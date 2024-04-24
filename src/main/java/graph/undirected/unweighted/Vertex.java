package graph.undirected.unweighted;

import java.util.Objects;

public class Vertex {
	private String label;
	
	public Vertex(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Vertex vertex)) return false;
		return Objects.equals(getLabel(), vertex.getLabel());
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(getLabel());
	}
	
	@Override
	public String toString() {
		return label;
	}
}
