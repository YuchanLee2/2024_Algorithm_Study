import java.util.*;

public class CM_12_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<int[]> positions = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            positions.add(new int[]{a, b});
        }

        for (int i = 0; i < N - 1; i++) {
            int pre_a = positions.get(i)[0];
            int pre_b = positions.get(i)[1];
            int cur_a = positions.get(i + 1)[0];
            int cur_b = positions.get(i + 1)[1];

            int direction;
            if (pre_a < cur_a) {
                direction = 1;
            } else if (pre_b < cur_b) {
                direction = 2;
            } else if (pre_a > cur_a) {
                direction = 3;
            } else {
                direction = 4;
            }

            int distance = Math.abs(cur_a - pre_a) + Math.abs(cur_b - pre_b);
            System.out.println(direction + " " + distance);
        }
    }
}
