package grafos;
import java.util.*;
/*
  Necesito que el grafo esté:
    Con los su lista de adyacencia
      matriz de adyacencia

    
 */
public class GrafoSimple {
  public static int DEF_WEIGHT = 1;
  private ArrayList<ArrayList <Integer> > adjMatrix = new ArrayList< ArrayList<Integer> > ();
  private ArrayList<ArrayList <String> > adjList = new ArrayList< ArrayList<String> > ();
  private HashMap <String, Integer> vtxKey = new HashMap <String, Integer>();


  /*
   * Lista de métodos:
   *  add
   *  remove
   *
   */
  private void addNewVert(String v) {
    adjList.add ( new ArrayList <String>() );
    adjMatrix.add( new ArrayList <Integer>() );
    for (int i = 0; i < vtxKey.size() - 1; i++) {
      adjMatrix.get(i).add(DEF_WEIGHT);
    }
    
    for (int j = 0; j < vtxKey.size() - 1; j++)
      adjMatrix.get(vtxKey.size() - 1).add(DEF_WEIGHT);
    adjMatrix.get(vtxKey.size() - 1).add(0);
  }


  public void put (String v1, Integer w, String v2) {
    //Add new vertex if it does not exit.
    if (!vtxKey.containsKey(v1)) {
      vtxKey.put(v1, vtxKey.size());  //Se pone en la LA
      addNewVert(v1);
    }
    if (!vtxKey.containsKey(v2)) {
      vtxKey.put(v2, vtxKey.size());
      addNewVert(v1);
    }
    //To add adjacency matrix
    adjMatrix.get( vtxKey.get(v1) ).set( vtxKey.get(v2), w );
    adjMatrix.get( vtxKey.get(v2) ).set( vtxKey.get(v1), w );
    //To add adjacency list
    if (w != 0) {
      adjList.get ( vtxKey.get(v1) ).add( v2 );
      adjList.get ( vtxKey.get(v2) ).add( v1 );
    } else {
      adjList.get ( vtxKey.get(v1) ).remove((Object) v2 );
      adjList.get ( vtxKey.get(v2) ).remove((Object) v1 );
    }
  }

  public void print () {
    System.out.print("V" + '\t');
    for (String j : vtxKey.keySet()) 
      System.out.print(j + '\t');
    System.out.print('\n');
    for (String i : vtxKey.keySet()) {
      System.out.print(i + '\t');
      for (int j = 0; j < vtxKey.size(); j++)
        System.out.print(adjMatrix.get( vtxKey.get(i) ).get(j) + "\t");
      System.out.print('\n');
    }
  }
  public void printAdjList () {
    for (String i : vtxKey.keySet()) {
      System.out.println(i + "\t" + adjList.get( vtxKey.get(i) ));
    }
  }
  public String toString() {
    this.print();
    return "";
  }
  public void dijkstra (GrafoSimple g) {
    
  }
}
