import java.util.*;
import java.io.*;
public class B_grid{
// 문제 링크 : https://www.acmicpc.net/problem/1946
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int tc = sc.nextInt(); // 테스트 케이스 수 2
		
		for(int i =0; i <tc ; i++) {
			
			int person =sc.nextInt(); // 사람 수 5
			
			int [] numArr= new int[person+1]; // 서류 , 면접 순위 배열 +1로 표현함
			
			for(int j=1; j <=person; j++) { // 3 2 //
				
				int docsScore = sc.nextInt();
				int interScore = sc.nextInt();
				
				numArr[docsScore] = interScore; // 배열 인덱스를 활용함
				
			}
			
			int count=1;
			
			int g=numArr[1];
			for(int x=2; x <=person; x++) { // 3 2 //1등은 통과처리
				
				
				if(numArr[x]<g) {//만약 [1]이 다음 [1]보다 작으면 합격 그리고 기준점이 바뀜. 기준점과 카운트 추가 클때는 다음 이동
					
					count++;
					g=numArr[x];
					
				}
			}

			System.out.println(count);
		}

	}

}
