import java.util.*;

class Solution {
    
    static int result = 0;
    
    public int solution(int k, int[][] dungeons) {
       
        boolean[] visited = new boolean[dungeons.length];
        dfs(dungeons, visited, 0, k);
        
        return result;
    }
    
    public static void dfs(int[][] dungeons, boolean[] visited, int count, int k) {
        result = Math.max(result, count);

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= k) {
                // 던전 방문 처리
                visited[i] = true;
                dfs(dungeons, visited, count + 1, k - dungeons[i][1]);
                // 던전 방문 처리 해제
                visited[i] = false;
            }
        }
    }
}
