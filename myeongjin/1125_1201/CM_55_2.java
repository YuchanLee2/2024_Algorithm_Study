import java.util.Arrays;
import java.util.Scanner;

public class CM_55_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 일수
        int k = sc.nextInt(); // 배우 수

        int[] schedule = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            schedule[i] = sc.nextInt();
        }

        int[] actor = new int[k + 1];
        Arrays.fill(actor, Integer.MAX_VALUE);
        int p = Integer.MAX_VALUE;

        for (int day = 1; day <= n; day++) {
            actor[schedule[day]] = day;

            boolean check = true;
            for (int i = 1; i <= k; i++) {
                if (actor[i] == Integer.MAX_VALUE) {
                    check = false;
                    break;
                }
            }

            if (check) {
                int minDay = Integer.MAX_VALUE;
                for (int i = 1; i <= k; i++) {
                    minDay = Math.min(minDay, actor[i]);
                }
                p = Math.min(day - minDay + 1, p);
            }
        }

        System.out.println(p == Integer.MAX_VALUE?0:p);
        sc.close();
    }
}
