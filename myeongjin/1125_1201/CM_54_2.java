import java.util.*;

public class CM_54_2 {
    static List<List<Edge>> edges = new ArrayList<>();
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정점 수
        int m = sc.nextInt(); // 간선 수
        int k = sc.nextInt(); // 특정 정점

        // 인접 리스트 초기화
        for (int i = 0; i <= n; i++) {
            edges.add(new ArrayList<>());
        }

        // 간선 입력 받기
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            edges.get(u).add(new Edge(w, v));
        }

        // 다익스트라 알고리즘 실행
        int distToK = dijkstra(1, k);
        int distToN = dijkstra(k, n);

        System.out.println(distToK + distToN);
        sc.close(); // Scanner 닫기
    }

    public static int dijkstra(int start, int target) {
        int[] dist = new int[edges.size()];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        PriorityQueue<Edge> heap = new PriorityQueue<>();
        heap.offer(new Edge(0, start));

        while (!heap.isEmpty()) {
            Edge current = heap.poll();
            int wVia = current.w;
            int via = current.v;

            if (wVia > dist[via]) {
                continue;
            }

            for (Edge nei : edges.get(via)) {
                int wDest = nei.w;
                int dest = nei.v;

                if (dist[dest] > wVia + wDest) {
                    dist[dest] = wVia + wDest;
                    heap.offer(new Edge(dist[dest], dest));
                }
            }
        }

        return dist[target];
    }
    static class Edge implements Comparable<Edge> {
        int w;
        int v;

        Edge(int weight, int vertex) {
            this.w = weight;
            this.v = vertex;
        }
        @Override
        public int compareTo(Edge other) {
            return Integer.compare(this.w, other.w);
        }
    }
}
