import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DFS {

    private static void addEdge(List<List<Integer>> adjList, int v, int u) {
        adjList.get(v).add(u);
        adjList.get(u).add(v);
    }

    private static void printAdjList(List<List<Integer>> adjList) {
        for (int i = 1; i < adjList.size(); i++) {
            System.out.println("Adjacency List for Vertex " + i + " : " + adjList.get(i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int noOfConnectedComponent = 0;

        List<Integer> dfs = new ArrayList<>();
        boolean vis[] = new boolean[v + 1];
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i <= v; i++) {
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList, 1, 2);
        addEdge(adjList, 2, 4);
        addEdge(adjList, 3, 5);
        addEdge(adjList, 5, 10);
        addEdge(adjList, 5, 6);
        addEdge(adjList, 9, 10);
        addEdge(adjList, 6, 7);
        addEdge(adjList, 9, 8);
        addEdge(adjList, 7, 8);
        addEdge(adjList, 8, 11);

        printAdjList(adjList);

        for (int i = 1; i <= v; i++) {
            if (!vis[i]) {
                Stack<Integer> stack = new Stack<>();
                stack.push(i);
                vis[i] = true;
                while (!stack.isEmpty()) {
                    Integer node = stack.pop();
                    dfs.add(node);
                    for (Integer it : adjList.get(node)) {
                        if (!vis[it]) {
                            stack.push(it);
                            vis[it] = true;
                        }
                    }
                }
                noOfConnectedComponent++;
            }
        }

        System.out.println(dfs);
        System.out.println(noOfConnectedComponent);

    }
    
}
