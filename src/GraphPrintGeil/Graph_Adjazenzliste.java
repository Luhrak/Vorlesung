package GraphPrintGeil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph_Adjazenzliste {
	private Map<Integer, List<Integer>> adjacencyList;

	/* Klassen Konstruktor */
	public Graph_Adjazenzliste() {
		this.adjacencyList = new HashMap<>();
	}

	/* Methode zum Knoten hinzufuegen */
	public void addVertex(int vertex) {
		adjacencyList.put(vertex, new ArrayList<Integer>());
	}

	/* Methode zum Kanten hinzufuegen */
	public void addEdge(int source, int destination) {

		List<Integer> contacts = adjacencyList.get(source); 
		contacts.add(destination); 
		
	}

	/* Methode zum Ausgeben des Graphen auf der Konsole */
	public void printGraph() {
		
	// Insane Bucket TM code format for https://dreampuf.github.io/GraphvizOnline/
		System.out.println("digraph {");
		adjacencyList.forEach((Integer key, List<Integer> value) -> {
			
			for (int i : value) {
				System.out.println(key + " -> " + i + ";");
			}
		}); 
		System.out.println("}");
	}
	

	/**** Main Methode - muss nicht veraendert werden ****/
	public static void main(String[] args) {
		Graph_Adjazenzliste graph = new Graph_Adjazenzliste();

		graph.addVertex(0);
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addVertex(4);

		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);

		graph.printGraph();
	}
}
