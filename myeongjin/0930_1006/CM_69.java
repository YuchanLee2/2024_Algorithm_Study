import java.io.*;
import java.util.*;

public class CM_69 {
    static int bugX, bugY;
    public static void main(String[] args) throws IOException { 
        Scanner s = new Scanner(System.in);
        
        char [][]map = new char[10][10];

        for (int i = 0; i < 10; i++) {
            String mapStr = s.nextLine();
            for (int j = 0; j < 10; j++) {
                map[i][j] = mapStr.charAt(j);
                if (map[i][j] == '2') {
                    bugX = i;
                    bugY = j;
                }
            }
        }
       // '2' 위치를 '0'으로 변경
       map[bugX][bugY] = '0';

       // 이동 방향 설정
       int[][] move = {{-1, 0}, {0, -1}};
       int sw = 0;
       int mx = move[sw][0], my = move[sw][1];

       // 이동 반복
       while (true) {
           int nx = bugX + mx;
           int ny = bugY + my;

           // 경계 조건 확인
           if (0 <= nx && nx < 10 && 0 <= ny && ny < 10) {
               if (map[nx][ny] == '0') {
                   // 이동 가능한 경우
                   bugX = nx;
                   bugY = ny;
               } else if (map[nx][ny] == '1') {
                   // 벽에 부딪힌 경우
                   map[nx][ny] = '4';
                   sw ^= 1; // 방향 전환
                   mx = move[sw][0];
                   my = move[sw][1];
               } else if (map[nx][ny] == '4') {
                   // 이미 방문한 경우
                   System.out.println("no");
                   break;
               }
           } else {
               // 경계 밖으로 나간 경우
               System.out.println("yes");
               break;
           }
       }
    }
}
