import java.util.Scanner;

public class CM_74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine().trim());
        
        String[] times = scanner.nextLine().trim().split(" ");
        
        long corner = 4, side = 4, center = 1;
        final long MOD = 1000000007;
        
        for (int i = 0; i < N - 1; i++) {
            int time = Integer.parseInt(times[i]);
            if (time == 1) {
            } else if (time == 2) {
                long newCorner = 2 * side + 4 * center;
                long newSide = 2 * corner + 2 * side + 4 * center;
                long newCenter = corner + side;
                
                corner = newCorner % MOD;
                side = newSide % MOD;
                center = newCenter % MOD;
            } else if (time == 3) {
                long newCorner = 3 * corner + 2 * side;
                long newSide = 2 * corner + side;
                long newCenter = 0;
                
                corner = newCorner % MOD;
                side = newSide % MOD;
                center = newCenter % MOD;
            }
        }
        long result = (corner + side + center) % MOD;
        System.out.println(result);
        scanner.close();
    }
}
