import java.io.IOException;
import java.util.*;

public class CM_32 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        long r=1;
        for (int i=0; i<b; i++){
            r*=(a-i);
            r/=(i+1);
        }
        System.out.println(r);
    }
}