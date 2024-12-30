// don't place package name. 

import java.io.*;

import java.util.*; 
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Mukjipa {
    
    // 가위바위보 결과 비교
    public static int compareRsp(int a, int b) {
        if (a == b) {
            return 0;
        }
        int diff = a - b;
        if (diff == 1 || diff == -2) {
            return 1;
        }
        return -1;
    }

    // 묵찌빠 게임을 실행 메서드
    public static int playMugjjipa(List<Integer> aList, List<Integer> bList) {
        int lenA = aList.size();
        int lenB = bList.size();
        int aIdx = 0, bIdx = 0;
        
        // 초기 가위바위보로 선공 결정
        int cycle = lenA * lenB;
        int result = 0;
        for (int i = 0; i < cycle; i++) {
            result = compareRsp(aList.get(aIdx), bList.get(bIdx));
            if (result != 0) {  // 승부가 났다면
                break;
            }
            aIdx = (aIdx + 1) % lenA;
            bIdx = (bIdx + 1) % lenB;
        }
        
        if (result == 0) {  // 승부가 나지 않은 경우
            return 0;
        }
        
        // 선공 후공 설정
        if (result == -1) {
            // 후공이 선공이 된다
            List<Integer> temp = aList;
            aList = bList;
            bList = temp;
            aIdx = bIdx;
            bIdx = aIdx;
            lenA = bList.size();
            lenB = aList.size();
            result = 2;
        } else {
            result = 1;
        }
        
        // 묵찌빠 진행
        for (int i = 0; i < cycle * 2; i++) {
            int aHand = aList.get(aIdx);
            int bHand = bList.get(bIdx);
            
            if (aHand == bHand) {  // 같은 패면 선공 승
                return result;
            }
            
            if (compareRsp(aHand, bHand) == -1) {  // 공수 교대
                List<Integer> temp = aList;
                aList = bList;
                bList = temp;
                aIdx = bIdx;
                bIdx = aIdx;
                lenA = bList.size();
                lenB = aList.size();
                result = 3 - result;  // 1->2 또는 2->1
            }
            
            aIdx = (aIdx + 1) % lenA;
            bIdx = (bIdx + 1) % lenB;
        }
        
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        // 첫 번째 봇
        List<Integer> bot1 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            bot1.add(scanner.nextInt());
        }
        
        // 두 번째 봇
        List<Integer> bot2 = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            bot2.add(scanner.nextInt());
        }

        int result = playMugjjipa(bot1, bot2);
        System.out.println(result);
        
        scanner.close();
    }
}
