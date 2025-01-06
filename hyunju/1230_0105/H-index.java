// n편 중 h번 이상 인용된 논문이 h편이상 이고 나머지 논문이 h 번이하일때
// 6,5,3,1,0
// i = 0 h = 5 -> 5 편중 5번 이상 인용된 논문이 5편이상이고 나머지 논문이 5번 이하 인용되었을 때 -> x
// i = 1 h = 4 -> 5 편중 4번 이상 인용된 논문이 4편이상이고 나머지 논문이 4번 이하 인용되었을 때 -> x
// i = 2 h = 3 -> 5 편중 3번 이상 인용된 논문이 3편이상이고 나머지 논문이 3번 이하 인용되었을 때 -> 0
import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        
        for(int i = 0; i < citations.length; i++){
            int h = citations.length - i;
            
            if(citations[i] >= h){
                answer = h;
                break;
            }
        }
        return answer;
    }
}