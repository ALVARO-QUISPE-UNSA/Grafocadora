import grafos.*;
public class Main {
  public static void main(String args []) {
    GrafoSimple grafo = new GrafoSimple();
    grafo.DEF_WEIGHT = 0;
    grafo.put("H", 578, "A");
    grafo.put("A", 818, "R");
    grafo.put("R", 1060, "M");
    grafo.put("M", 1380, "N");
    grafo.put("N", 966, "O");
    grafo.put("R", 1270, "K");
    grafo.put("L", 310, "K");
    grafo.put("L", 1100, "N");
    grafo.put("F", 578, "L");
    grafo.put("F", 948, "O");
    grafo.put("O", 325, "Z");
    grafo.put("Z", 889, "E");
    grafo.put("E", 628,"D");
    grafo.put("D", 361, "F");
    grafo.put("K", 620, "F");
    grafo.put("D", 3130, "H");
    grafo.print();
    /*
    System.out.println("Arista A - A");
    System.out.println(grafo.getW("A", "A"));
    */
    System.out.println("Lista de adyacencia");
    grafo.printAdjList();
    System.out.println("Dijkstra");
    grafo.dijkstra("A", "Z");
  }
}
