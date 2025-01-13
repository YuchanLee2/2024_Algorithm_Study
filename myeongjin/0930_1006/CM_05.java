import java.io.*;
import java.util.*; 
public class CM_05 {
    public static void main(String[] args) throws IOException { 
        Scanner s = new Scanner(System.in); 
        String a = s.next();
        System.out.println(a.length()>20?"I":"P"); 
    }
}