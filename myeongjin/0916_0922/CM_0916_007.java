import java.io.*;
import java.util.*; 

public class CM_0916_007 {
    public static void main(String[] args) throws IOException { 
        Scanner scanner = new Scanner(System.in); 

        int a = scanner.nextInt(); 
        if (a>=200){
            System.out.println("A");
        }
        else if(a>=180){
            System.out.println("B"); 
            
        }
        else if(a>=150){
           System.out.println("C"); 
            
        }
        else{
            System.out.println("D"); 
        }

    }
}