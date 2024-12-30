import java.util.*;
import java.io.*;
public class BJ_2512 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int N = sc.nextInt();

        int []arr= new int[N];
		int right = -1;
		int left=0;
        for (int i =0; i<N; i++){
            arr[i]=sc.nextInt();
			right=Math.max(right, arr[i]);
        }
		int M=sc.nextInt();
		while (left<=right) {
			int mid=(left+right)/2;
			long b=0;
			for (int i =0; i<N; i++){
				if(arr[i]>mid) b+=mid;
				else b+=arr[i];
			}
			if(b<=M){
				left =mid+1;
			}
			else{
				right=mid-1;
			}			
		}
		System.out.println(right);
    }


}
