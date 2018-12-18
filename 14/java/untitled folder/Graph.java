import java.util.ArrayList;
import java.util.Random;

public class Graph {
    public ArrayList<Vertex> vlist;

    public Graph() {
        vlist = new ArrayList<Vertex>();
    }

    public void addVertex(String name) {
        Vertex vert =  new Vertex(name);
        vlist.add(vert);

    }

    public Vertex getVertex(String name) {
        Vertex vertex1 = null;
        for(int i = 0; i < vlist.size(); i++){
            if(vlist.get(i).name == name){
                vertex1 = vlist.get(i);
            }
        }
	return vertex1;
    }
    public void addEdge(String from, String to, int weight) {
        Vertex vertex1 = null;
        Vertex vertex2 = null;

        for(int i = 0; i < vlist.size(); i++){
            if(vlist.get(i).name == from){
                vertex1 = vlist.get(i);
            }
              if(vlist.get(i).name == to){
                vertex2 = vlist.get(i);
            }
        }

        Edge edge1 = new Edge(vertex1, vertex2, weight);
        Edge edge2 = new Edge(vertex2, vertex1, weight);

        vertex1.adjlist.add(edge1);
        vertex2.adjlist.add(edge2);

    }

    public Edge getEdge(String from, String to) {
         for(int i=0; i < vlist.size(); i++){
            for( int j=0; j < vlist.get(i).adjlist.size(); j++){
                if(vlist.get(i).adjlist.get(j).from.name == from){
                    if(vlist.get(i).adjlist.get(j).to.name == to){
                        return vlist.get(i).adjlist.get(j);
                    }
                }
            }
        }
        return null;
  }
    public int MSTCost() {

    return 0;
    }

    public Graph MST() {
	return this;
    }

    public int SPCost(String from, String to) {

        return 0;
  
}

    public Graph SP(String from, String to) {
	return null;
    }
}
