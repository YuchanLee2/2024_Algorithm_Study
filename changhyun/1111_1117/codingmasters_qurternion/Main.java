// don't place package name. 

import java.io.*;
import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class Main {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int a = scanner.nextInt(); 
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        scanner.nextLine();
        
        int w = scanner.nextInt(); 
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        
        int r = a * w - b * x - c * y - d * z;
        int i = a * x + b * w + c * z - d * y;
        int j = a * y - b * z + c * w + d * x;
        int k = a * z + b * y - c * x + d * w;
        
        System.out.printf("%d %d %d %d",r, i, j, k); 
    }
}