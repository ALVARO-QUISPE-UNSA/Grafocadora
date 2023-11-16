import grafos.*;
public class Main {
  public static void main(String args []) {
    GrafoSimple grafo = new GrafoSimple();
    grafo.put("A", 3, "B");
    grafo.put("A", 2, "C");
    grafo.put("B", 4, "C");
    grafo.print();
  }
}
