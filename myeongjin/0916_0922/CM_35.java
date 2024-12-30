// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class CM_35 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        n=Math.max(n,m);
        int count=0;
        String a = scanner.nextLine(); 
        for(int i=0; i<n; i++){
            a = scanner.nextLine(); 
            if(!a.contains("0")){
                count++;
            }           
        }
        System.out.println(count); 

    }
}