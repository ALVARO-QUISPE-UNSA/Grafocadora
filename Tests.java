import grafos.*;
public class Tests {
  public static void main(String args []) {
    GrafoSimple grafo = new GrafoSimple();
    grafo.put("A", 1, "B");
    grafo.put("A", 2, "D");
    grafo.put("C", 3, "B");
    grafo.put("D", 3, "F");
    System.out.println("Lista de adyacencia");
    grafo.printAdjList();
    System.out.println("------------");
    grafo.dijkstra("A", "F");

  }
}
