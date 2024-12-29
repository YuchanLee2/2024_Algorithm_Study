import java.io.*;
import java.util.*;

public class Main_6 {
    static int n, m;
    static List<Integer>[] edges;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();

        edges = new ArrayList[n + 1];
        for (int i=1; i<=n; i++) {
            edges[i]=new ArrayList<>();
        }

        for (int i=0; i<m; i++) {
            int s=sc.nextInt();
            int e=sc.nextInt();
            edges[s].add(e);
        }

        System.out.println(isCircle() ? "YES" : "NO");
    }

    public static boolean isCircle() {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); 

        boolean[] visited = new boolean[n + 1];
        visited[1]=true;

        while (!q.isEmpty()) {
            int node=q.poll();

            for (int neighbor : edges[node]) {
                if (!visited[neighbor]) {
                    q.add(neighbor);
                    visited[neighbor]=true; 
                }
                if (neighbor==1) { 
                    return true;
                }
            }
        }
        return false; 
    }
}
