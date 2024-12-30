class Solution {
	static int count=0;
    public static int solution(int[] numbers, int target) {
        // 주어진 배열 , 목표 숫자 들어옴
        int answer = 0;      
        dfs(target,0,numbers,0);
        // 1. 타겟넘버, 2. 현재 깊이
        // 3. 입력받은 배열 4.현재 값

        answer=count; // 함수를 빠져 나온 카운트 값을 전달
        return answer;
    }
	private static void dfs(int target, int depth, int[] numbers, int result) {
        // 0, 0 , [1,1,1,1,1], 0 : 초기값
        //target : 타겟변수(고정)
        //depth: depth는 더할 인덱스(탐색중인 인덱스),아래 numbers[depth]에서 활용
        // numbers : 입력받은 배열 (고정)
        //result:차곡차곡 쌓을 변수(배열의 인덱스를 거치며 값이 누적됨)

		if(depth==numbers.length) {  //1. 현재 함수의 깊이 == 입력받은 배열의 길이가 일치
			if(result==target) { // 1-2.깊이만큼 함수를 완료했고, 타겟 넘버와 일치할때
				count++; // 1-3.카운트를 추가함
			}
			return; // 2.리턴해줌. <-다시 돌아감 (백트래킹) 해가 될 수 없다고 판단
		}

		int p=result+numbers[depth]; //현재 숫자를 더함
		int m=result-numbers[depth]; //현재 숫자를 뺌

		dfs(target,depth+1,numbers,p);// 더한 값에 대해서 재귀실행 (depth+1)
        // 만약 초과or조건을 만족했다면 위의 if함수에서 리턴시킴
		dfs(target,depth+1,numbers,m);// 뺀 값에 대해서 재귀실행 (depth+1)
	}
}


// +++++ 
// ++++- 
// +++-+ 
// +++-- 
// ++-++ 
// ++-+- 
// ++--+ 
// ++---