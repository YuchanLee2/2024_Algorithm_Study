import java.util.*;

public class Solutions5 {

    public static void main(String[] args) {
        int queries[][] = {{2,10},{7,1},{2,5},{2,9},{7,32}};
        int result = solution(queries);
        System.out.println(result);
    }

    public static int solution(int[][] queries) {
        int answer = 0;
        int[] qCheck = new int[1000];
        int[] qDp = new int[1000]; // 2의 거듭제곱 기록

        for (int i = 0; i < queries.length; i++) {
            int qCur = queries[i][0]; // 현재 인덱스
            int addX = queries[i][1]; 

            // 현재 인덱스에 아무것도 없을 경우
            if (qCheck[qCur] == 0) {
                qCheck[qCur] = addX; // 과일 수 기록
                int two = 1; 
                while (two < qCheck[qCur]) { // 근접한 2의 제곱수 찾기
                    two *= 2;
                }
                qDp[qCur] = two; // 해당 인덱스에 맞는 2의 제곱수 기록
            } else { // 기존에 있는 경우
                int total = qCheck[qCur] + addX; // 새로운 수 계산
                if (total > qDp[qCur]) { // 총 수가 2의 거듭제곱을 초과할 경우
                    answer += qCheck[qCur]; // 기존 수를 더함
                    qCheck[qCur] = total; // 현재 인덱스 수 업데이트
                    
                    int two = 1; // 2제곱
                    while (two < qCheck[qCur]) { // 새로운 2의 제곱
                        two *= 2;
                    }
                    qDp[qCur] = two; // 해당 인덱스에 맞는 new 2의 제곱 기록
                } else {
                    qCheck[qCur] += addX;
                }
            }
        }
        return answer; 
    }
}
