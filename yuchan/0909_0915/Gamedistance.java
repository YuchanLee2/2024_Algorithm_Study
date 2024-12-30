import java.util.*;

public class Gamedistance {
    int[][] maps;
    Queue<int[]> queue = new LinkedList<>();
    int n = 0, m = 0;
    int[][] visited;

    int bfs(int nx, int ny) {
        visited[nx][ny] = 1;
        queue.offer(new int[] {nx, ny});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            nx = current[0];
            ny = current[1];

            if (nx + 1 < n && maps[nx + 1][ny] != 0 && visited[nx + 1][ny] == 0) {
                queue.offer(new int[] {nx + 1, ny});
                visited[nx + 1][ny] = visited[nx][ny] + 1;
            }

            if (nx - 1 >= 0 && maps[nx - 1][ny] != 0 && visited[nx - 1][ny] == 0) {
                queue.offer(new int[] {nx - 1, ny});
                visited[nx - 1][ny] = visited[nx][ny] + 1;
            }

            if (ny + 1 < m && maps[nx][ny + 1] != 0 && visited[nx][ny + 1] == 0) {
                queue.offer(new int[] {nx, ny + 1});
                visited[nx][ny + 1] = visited[nx][ny] + 1;
            }

            if (ny - 1 >= 0 && maps[nx][ny - 1] != 0 && visited[nx][ny - 1] == 0) {
                queue.offer(new int[] {nx, ny - 1});
                visited[nx][ny - 1] = visited[nx][ny] + 1;
            }

            if (nx == n - 1 && ny == m - 1) {
                return visited[nx][ny];
            }
        }
        return -1;
    }

    public int solution(int[][] maps) {
        this.maps = maps;
        this.n = maps.length;
        this.m = maps[0].length;
        visited = new int[n][m];
        return bfs(0, 0);
    }
}
