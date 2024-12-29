// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        Set<Character> uniqueChars = new HashSet<>();

        // Set에 넣어 unique만 확인
        for (char c : input.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                uniqueChars.add(c);
            }
        }

        // 알파벳은 26개
        if (uniqueChars.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
