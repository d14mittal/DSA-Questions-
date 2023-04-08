import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class BipartiteDFS {
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

        for (int i = 0; i <= v; i++) {
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList, 1, 2);
        addEdge(adjList, 2, 3);
        addEdge(adjList, 3, 4);
        // addEdge(adjList, 4, 5);
        addEdge(adjList, 9, 4);
        addEdge(adjList, 5, 9);

        addEdge(adjList, 5, 6);
        addEdge(adjList, 6, 7);
        addEdge(adjList, 2, 8);
        addEdge(adjList, 8, 5);

        printAdjList(adjList);

        if (checkBipartite(adjList, v)) {
            System.out.println("Yes Bipartite");
        } else {
            System.out.print("Not Bipartite");
        }

    }

    private static boolean checkBipartite(List<List<Integer>> adjList, int v) {
        int color[] = new int[v + 1];
        Arrays.fill(color, -1);

        for (int i = 1; i <= v; i++) {
            if (color[i] == -1) {
                Stack<Integer> stack = new Stack<>();
                stack.push(i);
                color[i] = 0;
                while (!stack.isEmpty()) {
                    Integer nde = stack.pop();
                    for (Integer it : adjList.get(nde)) {
                        if (color[it] == -1) {
                            color[it] = 1 - color[nde];
                            stack.push(it);
                        } else if (color[it] == color[nde]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;

    }
}
