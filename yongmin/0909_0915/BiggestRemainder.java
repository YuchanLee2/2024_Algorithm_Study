// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class BiggestRemainder {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int a = scanner.nextInt(); 
        
        int five;
        int seven;
        
        five = a % 5;
        seven = a % 7;
        
        if(five > seven){
            System.out.println(five);
        }else{
            System.out.println(seven);
        }

        scanner.close();

    }
}