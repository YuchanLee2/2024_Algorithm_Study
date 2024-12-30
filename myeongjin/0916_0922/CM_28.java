import java.io.*;
import java.util.*; 
public class CM_28 {
    public static void main(String[] args) throws IOException { 
        Scanner scanner = new Scanner(System.in); 
        int[] arr= new int[5];
        for(int i=0; i<5; i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[2]); 
    }
}