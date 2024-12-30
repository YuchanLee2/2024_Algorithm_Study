// don't place package name. 

import java.io.*;
import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class Main {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int n = scanner.nextInt();

        int count = 0;
        while(n>1){
            if(n%2 == 0)
                n/=2;
            else if(n%3 == 0){
                n/=3;
                n*=2;
            }else if(n%5 == 0){
                n/=5;
                n*=4;
            }else{
                System.out.println(-1);
                return;
            }
            count++;
        }
        System.out.println(count);
    }
}