// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class CM_49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int cur = 0, next = 1;
        int i = 0, ffibsum = 0;

        while (i < b) {
            int temp = next;
            next = cur + next;
            cur = temp;

            for (int j = 0; j < cur; j++) {
                i++;
                if (a <= i && i <= b) {
                    ffibsum += cur;
                }
            }
        }

        System.out.println(ffibsum);
    }
}