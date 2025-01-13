import java.io.*;

import java.util.*; 

public class a0923 {

        public void main(String[] args) {
            
            
            
        }

        public int solution(int[][] maps) {
            Queue<int[]>q = new LinkedList<>();

            
            int n =maps.length;
            int m= maps[0].length;
            int [][] check = new int[n][m];
            check[0][0]=1;
            q.add(new int[]{0,0}); // 처음 시작 좌표 큐에 담기
            int [][] move = {{-1,0},{1,0},{0,-1},{0,1}}; // 상하좌우 이동 좌표

            while(!q.isEmpty()){
                int []cur=q.poll();
                int curX=cur[0];
                int curY=cur[1];

                if(curX==n-1&&curY==m-1){ // 도착지점 확인
                    return check[curX][curY]; // 도착지점의 걸음 수 리턴
                }

                for (int i =0; i<4; i++){ // 0~3 = 4방향 확인
                    int nextX=curX+move[i][0];
                    int nextY=curY+move[i][1];

                    if (nextX >= 0 && nextX < n && nextY >= 0&& nextY < m // 좌표 초과 확인
                        && maps[nextX][nextY] == 1 && check[nextX][nextY] == 0){ // 벽 충돌 확인 & 아직 방문하지 않은 칸 (체크 배열 =0)
                        
                        q.add(new int[]{nextX,nextY}); // 다음에 갈 좌표를 큐에 추가함
                        
                        check[nextX][nextY]=check[curX][curY]+1;  // 현재 좌표칸에는 이전 칸의 걸음수 +1
                    }
                }
            }
            return -1;
        }
        



    
}
