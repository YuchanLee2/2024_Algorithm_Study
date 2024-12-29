import java.io.*;

import java.util.*; 
public class CM_37_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] time = sc.nextLine().split(":");
        int hh=Integer.parseInt(time[0]);
        int mm=Integer.parseInt(time[1]);
        int N=sc.nextInt()-1;
        int totalMinutes = N * (N - 1) / 2;
        mm += totalMinutes;
        hh+=mm/60;
        hh%=24;
        mm%=60;
        
        System.out.printf("%02d:%02d\n",hh,mm);
    }
}