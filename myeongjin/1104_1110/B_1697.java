import java.util.*;
import java.io.*;
public class B_1697{
// 문제 링크 : https://www.acmicpc.net/problem/1697
	static int N,K,count;

	static boolean check[];
	static int time[];
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		N  = sc.nextInt();
		K  = sc.nextInt();

		check= new boolean [100001];
		time= new int [100001];
		bfs(N);
		
		
		
	}

	private static void bfs(int n) {
		Queue<Integer> q= new LinkedList<>();
		
		q.add(N);
		
		check[N]=true;
		time[N]=0;
		
		while(!q.isEmpty()) {
			int currentQ=q.poll();
			
			if(currentQ==K) {
				
				System.out.println(time[currentQ]); //현재까지 누적된 걸음 수 출력
				break;
			}
			//  갈수 있는 위치를 배열로 만들기
			
			int [] move = {currentQ-1,currentQ+1,currentQ*2 };
			
			for(int i =0; i<move.length; i++) {
				int movePosition=move[i];
				
				//다음 위치가 유효한 범위 내에 있고 아직 방문하지 않았다면
				if(movePosition>=0 && movePosition<=100000 && !check[movePosition]) {
					q.add(movePosition);
					check[movePosition]= true;
					time[movePosition]= time[currentQ] +1;  // 현재까지누적된 걸음 수에서 +1을 해줌
					
					
				}
				
				
			}
			
			
		}

	}
	
		
}
