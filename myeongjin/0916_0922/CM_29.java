import java.io.*;
import java.util.*; 
public class CM_29 {
    public static void main(String[] args) throws IOException { 
        Scanner scanner = new Scanner(System.in); 
        int a = scanner.nextInt(); 
        int b = scanner.nextInt(); 
        int t = b-a;
        int count=0;
        while(t%3!=0){
            t++;
            count++;
        }
        System.out.println(t/3+count); 

    }
}