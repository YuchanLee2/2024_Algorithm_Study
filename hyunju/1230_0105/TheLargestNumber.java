import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        
        // 숫자를 문자열로 변환하여 리스트에 추가
        for (int i = 0; i < numbers.length; i++) {
            list.add(String.valueOf(numbers[i]));  // 숫자를 문자열로 변환하여 리스트에 추가
        }
        
        // 문자열 리스트를 자릿수에 맞게 내림차순 정렬
        Collections.sort(list, (a, b) -> (b + a).compareTo(a + b));
        
        // 정렬된 리스트를 하나의 문자열로 합침
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str);
        }
        
        // 결과가 "0"만 있을 경우 "0"을 반환
        answer = sb.toString().equals("0".repeat(sb.length())) ? "0" : sb.toString();
        
        return answer;
    }
}
