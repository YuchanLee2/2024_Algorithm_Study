// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class CM_57 {
    public static void main(String[] args) throws IOException { 
        Scanner scanner = new Scanner(System.in); 
        long n = scanner.nextLong(); 
        long hit = scanner.nextLong(); 
        long l=0;
        long r=1_000_000_000;
        long result=-1;
        while(l<=r){
            long m=(l+r)/2; // 이진 탐색을 위한 mid
            // 타율 계산
            long newHit =(hit+m); // mid 를 더함
            long newN=(n+m); // midf를 더함
            // 이진 탐색을 위한 밑작업
            // 정확한 수 비교를 위한 정수 처리 (*100)
            long curHit100 = (100 *hit)/n; // 현재 타석 100배해서 비교 
            long newHit100 = (100*newHit)/newN; // 이진탐색 밑작업 더한 변수도 비교
            if(newHit100 > curHit100){ // 새로 계산한 타율이 현재 타율보다 크면?
                result = m; // 저장
                r= m-1; // 더 작은 x가 있을수 있으니 축소

            }
            else{
                l=m+1; // 새로운 타율이 안오르니까 범위 확대함
            }  
        }   
        // 결과 출력
        System.out.println(result); 
    }
}