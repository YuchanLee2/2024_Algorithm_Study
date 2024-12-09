import java.io.IOException;
import java.util.Scanner;

// don't change 'Main' class name and  'public' accessor.

public class CM_53_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        arr[0] =sc.nextInt();
        int r=arr[0];
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
            arr[i]+=Math.max(arr[i-1],0);
            if(arr[i]>r){
                r=arr[i];
            }
        }
        System.out.println(r);
    }
}