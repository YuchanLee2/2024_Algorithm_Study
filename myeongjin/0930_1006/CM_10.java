import java.io.IOException;
import java.util.Scanner;
public class CM_10{
    public static void main(String[] args) throws IOException { 
        Scanner s = new Scanner(System.in); 
        int a = s.nextInt(); 
        int b = s.nextInt(); 
        int n = s.nextInt();
        System.out.println(n-a==0?1:((n-a)+(a-b))/(a-b)+1); 
    }
 

}
