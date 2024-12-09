import java.util.*;

public class groupId {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 

        // 입력 받기
               int N = scanner.nextInt(); // 사람의 수 (정점 수)
               int M = scanner.nextInt(); // 친구 관계 수 (간선 수)
       
               // 그래프 초기화
               List<List<Integer>> graph = new ArrayList<>();
               for (int i = 0; i <= N; i++) {
                   graph.add(new ArrayList<>());
               }
       
               // 간선 정보 입력
               for (int i = 0; i < M; i++) {
                   int u = scanner.nextInt();
                   int v = scanner.nextInt();
                   graph.get(u).add(v);
                   graph.get(v).add(u);
               }
       
               // 방문 여부 배열
               boolean[] visited = new boolean[N + 1];
               int largestGroupSize = 0;
               int largestGroupId = Integer.MAX_VALUE;
       
               // 연결 요소 탐색
               for (int i = 1; i <= N; i++) {
                   if (!visited[i]) {
                       List<Integer> group = new ArrayList<>();
                       dfs(i, graph, visited, group);
       
                       // 그룹 크기와 ID 갱신
                       if (group.size() > largestGroupSize ||
                           (group.size() == largestGroupSize && group.get(0) < largestGroupId)) {
                           largestGroupSize = group.size();
                           largestGroupId = group.get(0);
                       }
                   }
               }
    
               
               // 결과 출력
               System.out.println(largestGroupId);
           }
       
           // DFS 함수
           private static void dfs(int node, List<List<Integer>> graph, boolean[] visited, List<Integer> group) {
               visited[node] = true;
               group.add(node);
       
               for (int neighbor : graph.get(node)) {
                   if (!visited[neighbor]) {
                       dfs(neighbor, graph, visited, group);
                   }
               }
    }    
}
