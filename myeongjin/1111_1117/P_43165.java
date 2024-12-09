import java.util.*; 
public class P_43165 {

    static int count=0;
    public static void main(String[] args){ 

    }
    public static int solution(int[] numbers, int target) {
        int answer = 0;
        
        
        dfs(target,0,numbers,0);
        answer=count;
        
        
        return answer;
    }
	

	private static void dfs(int target, int depth, int[] numbers, int result) {
		if(depth==numbers.length) { 
			if(result==target) {
				
				count++;
			}
			return;
		}
		
		int p=result+numbers[depth];
		int m=result-numbers[depth];

		dfs(target,depth+1,numbers,p);
		dfs(target,depth+1,numbers,m);
		
	}
}