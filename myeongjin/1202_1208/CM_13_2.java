import java.util.Scanner;

public class CM_13_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] cups = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            cups[i] = i;
        }
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            // 스왑
            int temp = cups[A];
            cups[A] = cups[B];
            cups[B] = temp;
        }
        int K = sc.nextInt();
        for (int i = 0; i <= N; i++) {
            if (cups[i] == K) {
                System.out.println(i);
                break;
            }
        }
    }
}
