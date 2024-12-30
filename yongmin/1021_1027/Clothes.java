import java.util.HashMap;

public class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> closet = new HashMap<>();
        int answer = 1;
        
        // 옷장 초기화, 및 종류별로 개수 세기
        // 옷장에 어떤 옷이 있는지는 중요하지 않기 때문
        for (String[] cloth : clothes) {
            String category = cloth[1]; 
            closet.put(category, closet.getOrDefault(category, 0) + 1);
            //찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
        }
        
        // 경우의 수
        for (int count : closet.values()) {
            answer *= (count + 1); //각 종류별로 선택하지 않는 경우 추가 (n+1)(m+1)
        }
        
        return answer - 1; // 아무것도 선택하지 않는 경우 제거
    }
}