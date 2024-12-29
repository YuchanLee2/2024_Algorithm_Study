import java.io.*;
import java.util.*; 

public class CM_89{
    static char[][] bp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            bp = new char[10][20];
            for (int j = 0; j < 10; j++) {
                bp[j] = sc.nextLine().toCharArray();
            }
            int sat = 0;

            // 첫 번째 조건 확인
            int cnt = 0;
            for (int x = 0; x < 10; x++) {
                for (int y = 0; y < 20; y++) {
                    if (bp[x][y] == '.') {
                        dfs(x, y, '.', 'v');
                        cnt++;
                    }
                }
            }
            if (cnt == 1) {
                sat += 1; // 첫 번째 조건 만족
            }

            // 두 번째 조건 확인
            dfs(0, 0, '#', 'w'); // '#'을 'w'로 변경

            cnt = 0;
            for (int x = 0; x < 10; x++) {
                for (int y = 0; y < 20; y++) {
                    if (bp[x][y] == '#') {
                        int pillars = dfs(x, y, '#', 'v');

                        if (pillars >= 6) {
                            cnt++;
                        }
                    }
                }
            }
            if (cnt >= 1) {
                sat += 2; // 두 번째 조건 만족
            }

            System.out.println(sat);
        }
        sc.close();
    }

    static int dfs(int x, int y, char target, char changed) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{x, y});
        int count = 0;
        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!stack.isEmpty()) {
            int[] pos = stack.pop();
            x = pos[0];
            y = pos[1];

            for (int[] d : dir) {
                int mx = x + d[0];
                int my = y + d[1];
                if (mx >= 0 && mx < 10 && my >= 0 && my < 20 && bp[mx][my] == target) {
                    bp[mx][my] = changed;
                    count++;
                    stack.push(new int[]{mx, my});
                }
            }
        }
        return count; // 현재 위치는 포함하지 않음
    }

}
