import java.util.LinkedList;
import java.util.Queue;

class P86971 {
    static int map[][];

    static boolean check[];

    static int result, n;

    public static int solution(int n, int[][] wires) {

        map = new int[n + 1][n + 1];

        check = new boolean[n + 1];

        for (int i = 0; i < wires.length; i++) {
            int a = wires[i][0];
            int b = wires[i][1];

            map[a][b] = 1;
            map[b][a] = 1;

        }

        result = Integer.MAX_VALUE;

        for (int i = 0; i < wires.length; i++) {

            int a = wires[i][0];
            int b = wires[i][1];

            map[a][b] = 0;
            map[b][a] = 0;

            check = new boolean[n + 1];

            result = Math.min(result, bfs(a, n));

            map[a][b] = 1;
            map[b][a] = 1;

        }

        return result;

    }

    private static int bfs(int start, int n) {
        // TODO Auto-generated method stub
        Queue<Integer> q = new LinkedList<>();

        check[start] = true;

        int count = 0;

        q.add(start);

        while (!q.isEmpty()) {

            int node = q.poll();

            count++;

            for (int i = 1; i <= n; i++) {
                if (map[node][i] == 1 && !check[i]) {
                    q.add(i);

                    check[i] = true;
                }
            }

        }

        return Math.abs(n - 2 * count);
    }

}