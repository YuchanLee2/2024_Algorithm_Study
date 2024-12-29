import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CM_47_v2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in); 
        BigDecimal result = new BigDecimal(sc.next()).divide(new BigDecimal(sc.next()), sc.nextInt(), RoundingMode.HALF_UP);
        System.out.println(result);
        }
}
