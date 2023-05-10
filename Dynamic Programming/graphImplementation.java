import java.util.*;


class Graph<T>{
    private Map<T, List<T> > map = new HashMap<>();
    
    //add vertex to the graph
    public void addVertex(T vertex){
        map.put(vertex, new LinkedList<T>());
    }

    //adds edge between source and destination
    public void addEdge(T source, T destination, boolean direction){
        
    }
}

public class graphImplementation {
    public static void main(String[] args){

    }
}
