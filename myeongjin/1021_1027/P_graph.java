import java.util.*;
import java.io.*;
public class P_graph {
// 문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/49189
    public static void main(String[] args) {
        
    }

    public static int solution(int n, int[][] edge) {
        int answer = 0;
        
 
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 
        for (int i = 0; i < edge.length; i++) {
            int x = edge[i][0];
            int y = edge[i][1];
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        // BFS 
        int[] dis = bfs(graph, 1, n);

        // 최대 거리를 찾고, 그 거리를 가진 노드 개수 계산
        int maxDist = 0;
        for (int d : dis) {
            if (d > maxDist) {
                maxDist = d;
                answer = 1;
            } else if (d == maxDist) {
                answer++;
            }
        }

        return answer;
    }

    private static int[] bfs(List<List<Integer>> graph, int start, int n) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        int[] dis = new int[n + 1];
        Arrays.fill(dis, -1);
        dis[start] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int i : graph.get(node)) {
                if (dis[i] == -1) { // 방문x노드
                    q.add(i);
                    dis[i] = dis[node] + 1;
                    System.out.println("현재 노드: " + node + ", 인접 노드: " + i + ", 거리: " + dis[i]);
                }
            }
        }

        return dis; 
    }
}
