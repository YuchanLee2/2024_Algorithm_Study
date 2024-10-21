import java.io.*;
import java.util.*;

class Node {
    List<Integer> edge;

    public Node() {
        edge = new ArrayList<>();
    }
}

public class Main {

    static void tsortPrint(Node[] graph, int[] indegree, int n) {
        Queue<Integer> que = new LinkedList<>();
        int[] result = new int[n];
        int idx = 0;

        for (int i = 1; i <= n; i++) {
            if (indegree[i] == 0) {
                que.add(i);
            }
        }

        boolean possible = true;

        for (int i = 0; i < n; i++) {
            if (que.isEmpty()) {
                possible = false;
                break;
            }

            int now = que.poll();
            result[idx++] = now;

            for (int dest : graph[now].edge) {
                indegree[dest]--;
                if (indegree[dest] == 0) {
                    que.add(dest);
                }
            }
        }

        if (!possible || idx < n) {
            System.out.println("IMPOSSIBLE");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int change;
            int a, b;
            int[] beforeRank = new int[n + 1];
            int[] indegree = new int[n + 1];
            Node[] rankGraph = new Node[n + 1];

            for (int i = 1; i <= n; i++) {
                rankGraph[i] = new Node();
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                beforeRank[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    int u = beforeRank[i];
                    int v = beforeRank[j];
                    rankGraph[u].edge.add(v);
                    indegree[v]++;
                }
            }

            change = Integer.parseInt(br.readLine());

            while (change-- > 0) {
                st = new StringTokenizer(br.readLine());
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());

                boolean changed = false;

                if (rankGraph[a].edge.remove((Integer) b)) {
                    rankGraph[b].edge.add(a);
                    indegree[b]--;
                    indegree[a]++;
                    changed = true;
                }

                if (!changed && rankGraph[b].edge.remove((Integer) a)) {
                    rankGraph[a].edge.add(b);
                    indegree[a]--;
                    indegree[b]++;
                }
            }

            tsortPrint(rankGraph, indegree, n);
        }
    }
}
