import java.io.IOException;
import java.util.*;

public class CM_91{
    static int n, m;
    static int[][] zoo;
    static List<int[]> tigers = new ArrayList<>();
    static List<int[]> fields = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        zoo = new int[n][m];

        // 동물원 상태 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                zoo[i][j] = scanner.nextInt();
                if (zoo[i][j] == 2) {
                    tigers.add(new int[]{i, j}); // 재규어 위치 저장
                } else if (zoo[i][j] == 0) {
                    fields.add(new int[]{i, j}); // 빈 칸 저장
                }
            }
        }

        List<Integer> tigerMovedLens = new ArrayList<>();
        // 3개의 여분 울타리를 설치할 조합 생성
        for (int i = 0; i < fields.size(); i++) {
            for (int j = i + 1; j < fields.size(); j++) {
                for (int k = j + 1; k < fields.size(); k++) {
                    int[][] tempZoo = new int[n][m];
                    for (int a = 0; a < n; a++) {
                        tempZoo[a] = zoo[a].clone(); // 깊은 복사
                    }
                    
                    // 울타리 설치
                    tempZoo[fields.get(i)[0]][fields.get(i)[1]] = 1;
                    tempZoo[fields.get(j)[0]][fields.get(j)[1]] = 1;
                    tempZoo[fields.get(k)[0]][fields.get(k)[1]] = 1;

                    // 재규어가 도달할 수 있는 빈 칸 계산
                    tigerMovedLens.add(releaseTiger(tempZoo));
                }
            }
        }
        
        // 재규어가 도달할 수 없는 빈 칸의 수 계산
        int minTigerMoved = Collections.min(tigerMovedLens);
        System.out.println(fields.size() - minTigerMoved - 3);
    }

    // 재규어가 이동할 수 있는 빈 칸의 수 계산
    public static int releaseTiger(int[][] zoo) {
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>(tigers);
        int count = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!q.isEmpty()) {
            int[] pos = q.poll();
            int x = pos[0], y = pos[1];

            for (int[] dir : directions) {
                int mx = x + dir[0], my = y + dir[1];
                if (mx >= 0 && mx < n && my >= 0 && my < m && zoo[mx][my] == 0 && !visited[mx][my]) {
                    zoo[mx][my] = 2; // 재규어가 이동
                    visited[mx][my] = true; // 방문 표시
                    count++;
                    q.add(new int[]{mx, my});
                }
            }
        }
        return count;
    }
}