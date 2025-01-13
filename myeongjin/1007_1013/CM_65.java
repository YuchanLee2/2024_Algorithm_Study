import java.io.IOException;
import java.util.*;

public class CM_65 {
    static String[][] star, empty;
    static String[][] fullStar;

    public static void main(String[] args) {
        // n 입력받기
        int n = new java.util.Scanner(System.in).nextInt();
        
        // 기본 패턴 설정
        star = new String[][]{
            {"*", " ", "*"},
            {" ", "*", " "},
            {"*", " ", "*"}
        };
        empty = new String[][]{
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
        };

        // 전체 크기 초기화
        int size = (int) Math.pow(3, n - 1);
        fullStar = new String[size][size];
        for (String[] row : fullStar) {
            Arrays.fill(row, " ");  // 초기화
        }

        // 별 모양 그리기
        draw(0, 0, size, star);

        // 결과 출력
        for (String[] line : fullStar) {
            System.out.println(String.join("", line));
        }
    }

    // 재귀적으로 별 모양 그리기
    static void draw(int x, int y, int size, String[][] pixels) {
        if (size == 1) {
            fullStar[x][y] = pixels[0][0];
        } else {
            for (int i = 0; i < pixels.length; i++) {
                for (int j = 0; j < pixels[i].length; j++) {
                    draw(x + (size / 3) * i, y + (size / 3) * j, size / 3, pixels[i][j].equals("*") ? star : empty);
                }
            }
        }
    }
}