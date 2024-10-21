import java.util.*;
import java.io.*;
public class BJ_12015 { 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int N = sc.nextInt();

        int []arr= new int[N];
        int []target= new int[N];

        for (int i =0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        target[0]=arr[0];
        int result=1;

		for (int i = 1; i < N; i++) {
 
			int key = arr[i];
			
			//key가 target의 마지막 값보다 클 경우
			if (target[result - 1] < key) {
				result++;
				target[result - 1] = key;
			} 
			else {
				//이분탐색
				int lo = 0;
				int hi = result;
				while (lo < hi) {
					int mid = (lo + hi) / 2;	
					if(target[mid] < key) {
						lo = mid + 1;
					}
					else {
						hi = mid;	}
 
				}
				target[lo] = key;
			
			}
			
		}
		//target 길이 출력
		System.out.println(result);

    }


}
