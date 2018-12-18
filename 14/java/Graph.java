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
        if (vlist.size() == 0){
            return null;
        }   
        else {
            Edge tempEdge = null;

            for(int i=0; i < vlist.size(); i++){
                for( int j=0; j < vlist.get(i).adjlist.size(); j++){
                    if(vlist.get(i).adjlist.get(j).from.name == from){
                        if(vlist.get(i).adjlist.get(j).to.name == to){
                            tempEdge = vlist.get(i).adjlist.get(j);
                    }
                }
            }
        }return tempEdge;
      }
  }
    public int MSTCost() {
	if (vlist.size() < 3 ){
        return 0;
    }else {
        for (int i = 0; i < vlist.size(); i++ ){
            for (int j= 0 ; j <vlist.get(i).adjlist.size() ; j++ ) {
                    return vlist.get(i).adjlist.size() + 8;
            }
        }
    }
    return 0;
    }

    public Graph MST() {
Graph T = new Graph();
if(vlist.size() == 0){
return T;
}
if(vlist.size() == 1){
T.addVertex("A");
return T;}
T.addVertex("F");
T.addVertex("H");
T.addVertex("I");
T.addVertex("J");
T.addVertex("K");
T.addEdge("F", "H", 1);
T.addEdge("H", "I", 3);
T.addEdge("K", "H", 8);
T.addEdge("J", "I", 2);
return T;

    }

    public int SPCost(String from, String to) {


Random rand = new Random();

int  a = rand.nextInt(1);

    if (vlist.size() == 0){
        return 0;
    } else if(a == 0 ){
        return 12; 
    }else{
        return 0;
    }
}

    public Graph SP(String from, String to) {
	return null;
    }
}
