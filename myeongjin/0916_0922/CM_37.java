import java.io.*;
import java.util.*; 
public class CM_37 {
        public static void main(String[] args) throws IOException { 
        Scanner scanner = new Scanner(System.in); 
        int h = scanner.nextInt(); 
        int m = scanner.nextInt(); 
        m-=30;
        if(m<0){ //30분 뺀게 0이하라면?
            h-=1;
            if(h-1<0){//시에서 1 뺸게 0이하라면?
                h=23;
            }
            m=60-Math.abs(m);
        }
        System.out.println(h +" "+ m); 
    }
}
