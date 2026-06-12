import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int node, edge;

        System.out.print("Enter the number of nodes: ");
        node = sc.nextInt();

        System.out.print("Enter the number of edges: ");
        edge = sc.nextInt();

        int graph[][] = new int[node][node];

        System.out.println("Enter the " + edge + " edges (u v):");
        int u, v;
        for (int i = 0; i < edge; i++) {
            u = sc.nextInt();
            v = sc.nextInt();
            graph[u][v] = graph[v][u] = 1;
        }

        int visit[] = new int[node];
        int distance[] = new int[node];
        int parent[] = new int[node];

        System.out.print("Enter source node: ");
        int src = sc.nextInt();


        System.out.print("Enter destination node: ");
        int dest = sc.nextInt();


        enq(src);
        visit[src] = 1;
        distance[src] = 0;
        parent[src] = -1;

        System.out.println("The BFS traversal:");
        while (front <= rear) {
            int x = deq();
            System.out.print(x + " ");
            for (int i = 0; i < node; i++) {
                if (graph[x][i] == 1 && visit[i] == 0) {
                    visit[i] = 1;
                    distance[i] = distance[x] + 1;
                    parent[i] = x;
                    enq(i);
                }
            }
            visit[x] = 2;
        }

        System.out.println("\nShortest distance from " + src + " to " + dest + " is: " + distance[dest]);
        printPath(src, dest, parent);

    }

    static int queue[] = new int[100];
    static int front = -1, rear = -1;

    static void enq(int n) {
        if (rear == -1) {
            front = 0;
        }
        queue[++rear] = n;
    }

    static int deq() {
        return queue[front++];
    }

    static void printPath(int src, int dest, int[] parent) {
        if (dest == -1) {
            System.out.println("No path exists.");
            return;
        }

        if (src == dest) {
            System.out.print(src);
             } else {
              printPath(src, parent[dest], parent);
              System.out.print(" -> " + dest);
        }

    }
}