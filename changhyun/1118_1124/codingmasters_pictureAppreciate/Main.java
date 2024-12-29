import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] grid = new char[4][4];

        for (int i = 0; i < 4; i++) {
            String line = br.readLine();
            grid[i] = line.toCharArray();
        }

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                int oCount = 0;

                for (int x = i; x <= i + 1; x++) {
                    for (int y = j; y <= j + 1; y++) {
                        if (grid[x][y] == 'O') {
                            oCount++;
                        }
                    }
                }

                if (oCount <= 1) {
                    System.out.println("yes");
                    return;
                }
            }
        }

        System.out.print("no");
    }
}
