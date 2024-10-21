// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class MakeDictionary {
    public static void main(String[] args) throws IOException { 

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();  // 개행 문자 처리
        
        Set<String> words = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            String word = sc.nextLine();
            words.add(word);  // Set으로 중복 제거
        }
        
        List<String> wordList = new ArrayList<>(words);
        
        // 사전순 정렬
        Collections.sort(wordList);
        // 길이에 따른 정렬
        wordList.sort(Comparator.comparingInt(String::length));
        // Comparator는 정렬을 위해 사용되는 객체
        
        for (String w : wordList) {
            System.out.println(w);
        }
        
        sc.close();

    }
}