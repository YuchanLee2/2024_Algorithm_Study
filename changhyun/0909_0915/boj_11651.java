import java.io.*;
import java.util.*;

/*
Comparator : 자바에서 두 객체를 비교하기 위해 사용되는 인터페이스
커스텀 정렬 기준을 쓰고 싶을때 쓰면 됨.
*/ 

public class Main {
    public static void qsort(int[] a, int[] b, int left, int right, Comparator<int[]> compare) {
        int pl = left;
        int pr = right;
        int mid = (left + right) / 2;
        int pivotA = a[mid];
        int pivotB = b[mid];

        while (pl <= pr) {
            while (compare.compare(new int[]{a[pl], b[pl]}, new int[]{pivotA, pivotB}) < 0)
                pl++;
            while (compare.compare(new int[]{a[pr], b[pr]}, new int[]{pivotA, pivotB}) > 0)
                pr--;
            
            if (pl <= pr) {
                int tempA = a[pl];
                a[pl] = a[pr];
                a[pr] = tempA;

                int tempB = b[pl];
                b[pl] = b[pr];
                b[pr] = tempB;

                pl++;
                pr--;
            }
        }

        if (left < pr) 
            qsort(a, b, left, pr, compare);
        
        if (pl < right)
            qsort(a, b, pl, right, compare);
    }

    public static void quickSort(int[] a, int[] b, Comparator<int[]> compare) {
        qsort(a, b, 0, a.length - 1, compare);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            x[i] = Integer.parseInt(input[0]);
            y[i] = Integer.parseInt(input[1]);
        }

        Comparator<int[]> compare = (p1, p2) -> {
            if (p1[1] != p2[1]) {
                return p1[1] - p2[1];
            } else {
                return p1[0] - p2[0];
            }
        };

        quickSort(x, y, compare);

        for (int i = 0; i < n; i++) {
            System.out.println(x[i] + " " + y[i]);
        }
    }
}
