import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int[][] snail = new int[N][N];


            int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

            int x = 0, y = 0, direction = 0;
            for (int num = 1; num <= N * N; num++) {
                snail[x][y] = num;


                int nx = x + directions[direction][0];
                int ny = y + directions[direction][1];


                if (nx < 0 || ny < 0 || nx >= N || ny >= N || snail[nx][ny] != 0) {
                    direction = (direction + 1) % 4; // 방향 전환
                    nx = x + directions[direction][0];
                    ny = y + directions[direction][1];
                }

                
                x = nx;
                y = ny;
            }

            
            System.out.println("#" + t);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(snail[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
