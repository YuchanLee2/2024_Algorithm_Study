import java.util.Scanner;

public class CM_68 {
    static int n = 0, m = 5;
    static char[][] cells = new char[m][m];
    static int[][] direction = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    static int countCell(int x, int y) {
        int count = 0;
        for (int[] d : direction) {
            int nx = x + d[0];
            int ny = y + d[1];
            if (nx >= 0 && nx < m && ny >= 0 && ny < m && cells[nx][ny] == '1') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < m; i++) {
            cells[i] = sc.nextLine().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            boolean[][] next = new boolean[m][m];

            for (int x = 0; x < m; x++) {
                for (int y = 0; y < m; y++) {
                    int alive = countCell(x, y);
                    if ((cells[x][y] == '1' && (alive >= 2 && alive <= 3)) || 
                        (cells[x][y] == '0' && alive == 3)) {
                        next[x][y] = true;
                    }
                }
            }

            for (int x = 0; x < m; x++) {
                for (int y = 0; y < m; y++) {
                    cells[x][y] = next[x][y] ? '1' : '0';
                }
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.println(cells[i]);
        }

        sc.close();
    }
}
