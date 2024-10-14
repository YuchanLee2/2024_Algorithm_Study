// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class Median {
    public static void main(String[] args) throws IOException { 

        // 공백으로 구분된 숫자 입력받기
        Scanner sc = new Scanner(System.in);
        
        String[] input = sc.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        
        // 문자열 배열을 정수 리스트로 변환
        for (String num : input) {
            numbers.add(Integer.parseInt(num));
        }
        
        // 정렬
        Collections.sort(numbers);
        
        // 중간 인덱스 계산
        int idx = numbers.size() / 2;
        
        // 중간값 출력
        System.out.println(numbers.get(idx));
        
        sc.close();

    }
}