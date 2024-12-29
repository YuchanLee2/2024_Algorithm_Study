// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 


public class FloorConstruction1 {
    public static int comb(int n, int k) {
        // n! / k! (n-k)!
        int n_f = 1;
        int k_f = 1;
        int nk_f = 1;
        
        for (int i = n; i > 0; i--){
            n_f = n_f * i;
        }
        
        for (int i = k; i > 0; i--){
            k_f = k_f * i;
        }
        
        for (int i = n-k; i > 0; i--){
            nk_f = nk_f * i;
        }
        
        return n_f / (k_f * nk_f);
    }
    
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 
        
        int length = scanner.nextInt(); 
        int result = 0;
        int n = length;
        
        for (int i = length; i >= -1; i = i - 2) {
            
            int nCk = 1;
            
            nCk = comb(n, i);
            
            result = result + nCk;
            n = n - 1;
        }

        System.out.println(result % 796796); 

    }
}