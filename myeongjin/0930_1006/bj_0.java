import java.io.*;
import java.util.*;
/*현재 사람이 stack 안의 사람보다
1. 클 경우 - 앞에 사람들이 현재 사람들에게 가려져 보이지 않기 때문에 모두 pop 해줌
2. 같을 경우 - 앞에 있는 사람과 같을 경우
    - 같은 사람의 키 samecount를 1증가 시킴
    - 현재 사람이 볼 수 있는 경우의 수가 자신 제외 같은 사람의 키를 가진 사람만큼의 경우의 수가 생기기 때문에
    - 이전 해당 키를 가지고 있는 사람의 수만큼 count 해줌
3. 작을 경우 - 바로 앞의 한 사람만 볼 수 있음.

*/
public class bj_0 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());  // 사람의 수
        Stack<int[]> stack = new Stack<>();       // 키와 같은 키의 등장 횟수를 저장하는 스택
        long count = 0;                           // 볼 수 있는 쌍의 수

        for (int i = 0; i < N; i++) {
            int height = Integer.parseInt(br.readLine());  // 현재 사람의 키
            int sameHeightCount = 1;  // 현재 키와 같은 키의 등장 횟수 (기본값은 1)
                // 스택에 있는 사람 중 현재 사람보다 키가 작은 사람은 뒤에 오는 사람을 볼 수 없으므로 제거
                // 현재 사람은 stack 안에 있는 모든 사람을 볼 수 있음.
                // 현재 사람의 키가 클 경우 계속 pop을 하기 때문에
                // 맨 마지막 사람이 가장 큰 사람이 됨.

                // 큰 애가 나왔으면 나보다 큰 애가 나오기 전까지 다 빼고?
                // 나 자신을 스택에 넣음

                //1.  현재 사람의 키가 stack 안의 키보다 클 경우
                while (!stack.isEmpty() && stack.peek()[0] < height) { // 현재 사람의 키가
                    count += stack.pop()[1];
                }

                //2.  스택에 있는 사람이 현재 사람과 같은 키일 때
                if (!stack.isEmpty() && stack.peek()[0] == height) { 
                    int[] top = stack.pop();
                    sameHeightCount = top[1] + 1;  // 같은 키의 사람 수를 증가시킴
                    count += top[1];  // 현재 들어온 사람이 stack 안에 사람을 볼 수 있는 수 = 같은 키를 가진 사람의 수
                }

                //3. 현재 사람이 스택 안의 키보다 작을 경우 - 앞에 한 사람만 볼 수 있음
                if (!stack.isEmpty()) {
                    count++;
                }

                // stack에 현재 사람을 추가
                stack.push(new int[]{height, sameHeightCount});
        }
        // 결과 출력
        System.out.println(count);
    }
}