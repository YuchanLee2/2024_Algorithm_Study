import java.util.*;

public class CM_08 {
    public static void main(String[] args){ 
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        System.out.println((int)Math.ceil((double)((c*10)*b)/(b*a))); 
    }
}
