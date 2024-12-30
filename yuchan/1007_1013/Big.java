import java.util.*;

class Big {
    public String solution(int[] numbers) {
        // 숫자를 문자열로 변환
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        // 커스텀 비교기 작성
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 두 문자열을 붙여서 비교
                String order1 = o1 + o2;
                String order2 = o2 + o1;
                // 내림차순 정렬
                return order2.compareTo(order1);
            }
        });

        // 모든 숫자가 0인 경우를 처리
        if (strNumbers[0].equals("0")) {
            return "0";
        }

        // 결과 문자열로 합치기
        StringBuilder answer = new StringBuilder();
        for (String num : strNumbers) {
            answer.append(num);
        }

        return answer.toString();
    }

}
