import java.util.Arrays;
import java.util.Scanner;

public class CM_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] inputs = new String[3];
        for (int i = 0; i < 3; i++) {
            inputs[i] = sc.nextLine();
        }
        String r =(inputs[1].charAt(1) == '0')?"possible":"impossible";
        System.out.println(r);
    }
}