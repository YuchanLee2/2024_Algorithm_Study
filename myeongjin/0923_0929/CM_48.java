// don't place package name. 

import java.io.*;

import java.util.*; 

public class CM_48 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 
        String a = scanner.nextLine(); 
        int w1 = a.split("").length;
        int w2= a.replaceAll(" ","").length();
        // 공백 여러개일떄? 오류
        // 연속된 공백 -> 하나의 공백으로
        a=a.replaceAll("\\s+", " ");
        int word = a.split(" ").length;
        System.out.println(w1); 
        System.out.println(w2); 
        System.out.println(word); 

    }
}