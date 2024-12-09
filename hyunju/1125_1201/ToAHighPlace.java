// 조건 1. 이전 기둥보다 더 높은 번호로
// 조건 2. 이전 기둥의 높이 보다 더 높은 기둥으로
// 조건 3. 더 이상 갈 곳이 없다면 종료
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.io.*;

public class ToAHighPlace {

    public static void main(String[] args) {
        
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 기둥의 개수
        sc.nextLine();  // 다음 줄로 넘어가기 위한 빈 줄 소비
        /* 
        Map<Integer, Integer> pillar = new HashMap<>();
       // 기둥 높이 입력하기 ..아 근데 1000개 까지던데
        int i = 0;
        while (i < N) {
            pillar.put(i, sc.nextInt());
        }*/
       
        int countkey = 0; // jump 할 최대 개수 1번 비교 값
        int countvalue = 0; //jump 할 최대 개수 2번 비교 값
        String pillarH = sc.nextLine();
        String [] split = pillarH.split(" ");

        Map<Integer, Integer> pillarhigh = new HashMap<>();

        for (int i = 0; i < split.length; i++) {
            pillarhigh.put(i, Integer.parseInt(split[i]));
        }

        //1. key 번호 순서대로 정렬한 후 -> 만약 value 값이 이전 값보다 작은 값은 띄어넘기
        for (int j = 0; j < pillarhigh.size(); j++) {
            int min1 = 0;
            int next1 = pillarhigh.get(j);
        
            if(min1 < next1){
                min1 = next1;
                countkey++;
            } else continue;

        }
        //2. value를 오름 차순 정렬한 후 -> 만약 이전 key의 값이 이전 값보다 작은 값은 띄어넘기
        
        List<Map.Entry<Integer, Integer>> sortedEntries = pillarhigh.entrySet().stream()
        .sorted(Map.Entry.comparingByValue()) // value를 기준으로 오름차순
        .collect(Collectors.toList()); // 결과를 List로 반환 -> List반환 이유는 List는 정렬이 가능하고, Map은 정렬이 불가능 하기 때문에
        
        
        for (int k = 0; k < sortedEntries.size(); k++) {
            int min2 = 0;
            int next2 = sortedEntries.get(k).getKey();

            if(min2 < next2){
                min2 = next2;
                countvalue++;
            } else continue;
        }

        
        answer = (countkey > countvalue) ? countkey : countvalue;

        System.out.println(answer);
        
        sc.close();
    }
}