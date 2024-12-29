// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class FindPassword {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        String input_alphabet = scanner.nextLine(); 
        
        // 방법 1
        // int c_index = input_alphabet.indexOf("c");
        
        // String result = input_alphabet.Slice(0, c_index + 1);
        
        // 방법 2
        String[] pre_c = input_alphabet.split("c");
        String c = "c";
        String result = pre_c[0] +  c;

        System.out.println(result); 

    }
}