
// don't place package name. 

import java.io.*;
import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class fangram {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        String sentence = scanner.nextLine(); // 문장을 입력
        // 알파벳을 replaceAll을 사용하여 a-z A-Z모두 빈 공백으로 바꾸고
        // 해당 길이가 0이라면 팬그램 문장이고 길이가 존재하면 팬그램 문장이 아니다

        // 자바에서는 무조건 ""를 기준으로 정규표현식을 사용해야함.
        String sentence_len = sentence.toUpperCase(); //모두 대문자로
        Set <Character> alpha = new HashSet<>();

        for(char c : sentence_len.toCharArray()){
            alpha.add(c); // set 구조에 알파벳 추가
        }
        

        if(alpha.size() == 26){System.out.println("YES");}
        else {System.out.println("NO");}
        scanner.close();

    }
}
