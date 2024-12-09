import java.util.Arrays;
import java.util.Scanner;

public class CM_69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input =sc.nextLine().replace(" ", "");
        String r =(input.equals("RGB")||input.equals("GBR")||input.equals("BRG"))?"possible":"impossible";
        System.out.println(r);
    }
}