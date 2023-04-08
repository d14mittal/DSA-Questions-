import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

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
        int noOfConnectedComponent = 0;

        List<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[v + 1];
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList, 0, 2);
        addEdge(adjList, 2, 4);
        addEdge(adjList, 3, 1);
        addEdge(adjList, 5, 3);

        printAdjList(adjList);
        
        
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(i);
                vis[i] = true;
                while (!queue.isEmpty()) {
                    Integer node = queue.poll();
                    bfs.add(node);
                    for (Integer it : adjList.get(node)) {
                        if (!vis[it]) {
                            queue.offer(it);
                            vis[it] = true;
                        }
                    }
                }
                noOfConnectedComponent++;
            }
        }

        System.out.println(bfs);
        System.out.println(noOfConnectedComponent);

    }
    
}
