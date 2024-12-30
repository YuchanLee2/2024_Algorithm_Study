import java.io.*;

import java.util.*;

public class MakeId {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 
        
        String a;
        Boolean check;

        a = scanner.next(); 
        
        if(a.length() <= 20){
            
            check = a.matches("^[a-zA-Z]*$");
            
            if(check){
                
                System.out.println("P");
                
            }else{
                
                System.out.println("I");
            }
        }else{
            
            System.out.println("I");
            
        }

        scanner.close();
    }
}