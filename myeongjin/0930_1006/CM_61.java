import java.io.*;

import java.util.*; 

public class CM_61 {
    static int n=0;
    static int [][]visit;
    static int [][]map;
        public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        n = scanner.nextInt(); 
        map= new int[n][n];
        visit = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(visit[i], 100000);
        }
        
        for(int i =0; i<n; i++){
            for (int j =0; j<n; j++){
                map[i][j]=scanner.nextInt();
            }
        }
        visit[0][0] = map[0][0]; // 첫 지점을 바꿔줘야함



        System.out.println(bfs(0,0)); 

    }

    private static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
    
        q.add(new int[]{x, y});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];
    
            int[][] direction = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};

            // if(curX==n-1&&curY==n-1){
            //    return visit[n - 1][n - 1];
            // }
            // 이거때문에 틀린 결과가 나왔음
            // 도착 해도 뒤에 더 작은 결과가 있을수도 있기때문에

            for (int i = 0; i < 4; i++) {
                int nextX = curX + direction[i][0];
                int nextY = curY + direction[i][1]; // 수정된 부분
    
                // 인덱스 범위 체크
                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n) {
                    int curResult = visit[curX][curY] + map[nextX][nextY]; // 우선 넣기 전에 비교
    
                    // 작으면 업데이트하고 큐에 추가 , math.min으로 대체 가능
                    if (curResult < visit[nextX][nextY]) {
                        visit[nextX][nextY] = curResult;
                        q.add(new int[]{nextX, nextY});
                    }
                }
            }
        }
        return visit[n-1][n-1];
    }
}
