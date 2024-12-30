// don't place package name. 

import java.io.*;
import java.util.*;

public class Pungsujiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        scanner.nextLine();

        // 2차원 배열로 만들기
        char[][] square = new char[row][col];
        for (int i = 0; i < row; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < col; j++) {
                square[i][j] = line.charAt(j);
            }
        }

        int maxCount = 1; // 최소 직사각형 크기

        // 가능한 모든 직사각형 조합 확인
        // combination을 쓰면 될텐디.. 모르겄다..
        for (int top = 0; top < row; top++) {
            for (int bottom = top; bottom < row; bottom++) {
                for (int left = 0; left < col; left++) {
                    for (int right = left; right < col; right++) {

                        char base = square[top][left];
                        boolean allSame = true;
                        int count = 0;

                        for (int i = top; i <= bottom; i++) {
                            for (int j = left; j <= right; j++) {
                                if (square[i][j] != base) {
                                    allSame = false;
                                    break;
                                }
                                count++;
                            }
                            if (!allSame) break;
                        }

                        if (allSame && count > maxCount) {
                            maxCount = count;
                        }
                    }
                }
            }
        }

        // 결과 출력
        System.out.println(maxCount);
    }
}