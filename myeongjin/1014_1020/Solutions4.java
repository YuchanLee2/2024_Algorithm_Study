import java.util.*;
import java.io.*;
public class Solutions4 {
    public static void main(String[] args) {
        String[] seats = {"AC", "DD", "DD", "CA"};
        int result = minSwaps(seats);
        System.out.println("최소 교환 횟수: " + result);
    }

    public static int minSwaps(String[] seats) {
        int n = seats.length;
        int swapCount = 0;

        // 목표 상태
        String[] target = {"AA", "DD", "DD", "CC"};

        // 현재 배열과 목표 배열을 비교하여 교환 진행
        for (int i = 0; i < n; i++) {
            while (!seats[i].equals(target[i])) {
                // 목표 상태에서 현재 값의 위치 찾기
                int targetIndex = findIndex(seats, target[i]);
                // 인접한 자리와 교환
                if (targetIndex > i) {
                    swap(seats, i, targetIndex);
                    swapCount++;
                } else {
                    // targetIndex가 i보다 작으면 위쪽으로 교환
                    if (targetIndex > 0) {
                        swap(seats, targetIndex - 1, targetIndex);
                        swapCount++;
                    }
                }
            }
        }

        return swapCount;
    }

    private static int findIndex(String[] seats, String value) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i].equals(value)) {
                return i;
            }
        }
        return -1; // 찾지 못한 경우
    }

    private static void swap(String[] seats, int i, int j) {
        // 자리 교환
        String temp = seats[i];
        seats[i] = seats[j];
        seats[j] = temp;
    }
}