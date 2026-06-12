import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int node, edge;

        System.out.print("Enter the number of nodes: ");
        node = sc.nextInt();

        System.out.print("Enter the number of edges: ");
        edge = sc.nextInt();

        int[][] graph = new int[node][node];

        System.out.println("Enter the " + edge + " edges (u v):");
        for (int i = 0; i < edge; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
                graph[u][v] = 1;
            }

        System.out.println("Topological Sort:");
        topologicalSort(graph, node);
    }

    static void topologicalSort(int[][] graph, int node) {
        boolean[] visited = new boolean[node];
        int[] result = new int[node];
        int[] index = {node - 1};

        for (int i = 0; i < node; i++) {
            if (!visited[i]) {
                dfs(graph, i, visited, result, index);
            }
        }

        for (int i = 0; i < node; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    static void dfs(int[][] graph, int v, boolean visited[], int result[], int index[]) {
        visited[v] = true;

        for (int i = 0; i < graph.length; i++) {
            if (graph[v][i] == 1 && !visited[i]) {
                dfs(graph, i, visited, result, index);
            }
        }

        result[index[0]] = v;
        index[0]--;
    }
}
