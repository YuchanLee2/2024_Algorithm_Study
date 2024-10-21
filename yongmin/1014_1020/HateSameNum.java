import java.util.ArrayList;

public class HateSameNum {
    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 첫 번째 요소를 결과 리스트에 추가
        answer.add(arr[0]);
        int now = arr[0];  // 현재 값 저장

        // 중복 제거
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != now) {
                answer.add(arr[i]);  // 중복이 아니면 추가
                now = arr[i];  // 현재 값 업데이트
            }
        }

        return answer;
    }
}