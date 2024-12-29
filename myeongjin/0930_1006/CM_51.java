import java.io.*;
import java.util.*;

public class CM_51 {    
    static int[] root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        List<int[]> edge = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            edge.add(new int[]{a, b, c});
        }
        
        // 간선 비용 기준으로 정렬
        edge.sort(Comparator.comparingInt(e -> e[2]));

        root = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            root[i] = i;
        }

        int mst = 0, visited = 0;
        for (int[] e : edge) {
            int a = e[0], b = e[1], c = e[2];
            if (visited == n - 1) break;
            if (find(a) != find(b)) {
                root[find(b)] = find(a);
                mst += c;
                visited++;
            }
        }
        System.out.println(mst);
    }

    static int find(int v) {
        if (root[v] != v) {
            root[v] = find(root[v]);
        }
        return root[v];
    }
}
