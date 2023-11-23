import grafos.*;
public class Tests {
  public static void main(String args []) {
    GrafoSimple grafo = new GrafoSimple();
    grafo.readInput("input/grafo.txt");
    System.out.println("Lista de adyacencia"); 
    grafo.printAdjList();
    grafo.print();
    System.out.println("------------");
    grafo.dijkstra("a", "c");

  }
}
