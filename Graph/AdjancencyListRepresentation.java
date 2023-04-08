import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdjancencyListRepresentation {


    private static void addEdge(List<List<Integer>> adjList, int v, int u) {
        adjList.get(v).add(u);
        adjList.get(u).add(v);
    }

    private static void printAdjList(List<List<Integer>> adjList) {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.println("Adjacency List for Vertex " + i + " : " + adjList.get(i));
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
        
        addEdge(adjList, 0, 2);
        addEdge(adjList, 2, 4);
        addEdge(adjList, 3, 1);
        addEdge(adjList, 5, 3);

        printAdjList(adjList);

    }   
}
