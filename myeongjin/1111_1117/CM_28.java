import java.util.*;

public class CM_28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double result = Math.ceil((Math.sqrt(8 * n - 7) - 1) / 2);
        System.out.print((int) result);
    }
}
