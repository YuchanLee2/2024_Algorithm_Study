// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class cogWheel {
    public static void main(String[] args) throws IOException { 

    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt(); // a톱니 바퀴수 - 대희
    int b = scanner.nextInt(); // b톱니 바퀴수
    int c = scanner.nextInt(); // c톱니 바퀴수

    int cRotate = 10;
    int aRotate = 0;

    // 근데 만약 나누기 했을 때 딱 떨어지지 않고 나머지가 존재한다면 회전수 +1
    int remain = (c * cRotate) % a;
    aRotate = (c * cRotate) / a;
    if(remain > 0) aRotate +=1;

    System.out.println(aRotate);
    scanner.close();

    }
}
