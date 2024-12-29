// don't place package name. 

import java.io.*;
import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class Main {
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) throws IOException { 

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Integer[] arr = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = gcd(result, arr[i]);
            
            if (result == 1){
                break;
            }
        }

        System.out.print(result);
    }
}