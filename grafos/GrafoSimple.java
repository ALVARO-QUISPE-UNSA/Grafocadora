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
  private HashMap <String, Integer> vtxKey = new HashMap <String, Integer>();


  /*
   * Lista de métodos:
   *  add
   *  remove
   *
   */
  private void addNewVert(String v) {
    for (int i = 0; i < vtxKey.size(); i++) {
      adjMatrix.add( new ArrayList <Integer>() );
      for (int j = 0; j < vtxKey.size(); j++)
        adjMatrix.get(i).add(DEF_WEIGHT);
    }
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

    adjMatrix.get( vtxKey.get(v1) ).set( vtxKey.get(v2), w );
    adjMatrix.get( vtxKey.get(v2) ).set( vtxKey.get(v1), w );
  }
  public void print () {
    System.out.print("V" + '\t');
    for (String j : vtxKey.keySet()) 
      System.out.print(j + '\t');
    System.out.print('\n');
    for (String i : vtxKey.keySet()) {
      System.out.print(i + '\t');
      for (int j = 0; j < vtxKey.size(); j++)
        System.out.print(adjMatrix.get( vtxKey.get(i) ).get(j));
      System.out.print('\n');
    }
  }
}
