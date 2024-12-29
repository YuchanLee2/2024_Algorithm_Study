import java.io.*;
import java.util.*;

public class CM_62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // n과 m 입력 받기
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int cur = 1, rotate = 0;
        List<Integer> eat = new ArrayList<>();

        // 사탕 입력 받기
        for (int i = 0; i < m; i++) {
            int candy = scanner.nextInt();
            int x, y;

            // enter와 candy의 값에 따라 x와 y 설정
            if (cur < candy) {
                x = cur;
                y = candy;
            } else {
                x = candy;
                y = cur;
            }

            // 왼쪽과 오른쪽 계산
            int left = y - x - (int) eat.stream().filter(c -> x <= c && c < y).count();
            int right = (x + n - y) % n - (int) eat.stream().filter(c -> c < x || y <= c).count();
            // eaten 리스트에 추가
            eat.add(candy);
            rotate += Math.min(left, right);
            cur = candy; // enter 업데이트
        }

        // 결과 출력
        System.out.println(rotate);
    }
}
