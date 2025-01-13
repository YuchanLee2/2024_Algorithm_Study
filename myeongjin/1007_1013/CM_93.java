import java.io.IOException;
import java.util.*;

public class CM_93{
    public static void main(String[] args) throws IOException { 

    //5
// 1 2 3 4 5
// 10
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 

        int monkey[] = new int[n];
        int mSum=0;

        for(int i=0; i<monkey.length; i++){
            monkey[i]=sc.nextInt();
            mSum+=monkey[i];
            
        } // 버림한 값과 비교 

        int banana=sc.nextInt();
        if (mSum <= banana) { 
            System.out.println(monkey[n - 1]);
            return; // 프로그램 종료
        }

        // 요청량을 정렬
        Arrays.sort(monkey);
        int result = 0;

        // 가능한 최대 도토리량을 찾기
        for (int i = 0; i < n; i++) {
            // 만약 현재 요청량이 banana를 n으로 나눈 값보다 작거나 같으면
            if (monkey[i] <= banana / n) {
                result = monkey[i];
            } else {
                break; // 그보다 크면 더 이상 볼 필요 없음
            }
        }
        System.out.println(result);

    }
}