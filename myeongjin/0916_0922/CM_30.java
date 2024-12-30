// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class CM_30 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int [ ] a0={0,1,0,1,0,1,0,1};
        
        int [ ] a1={1,0,1,0,1,0,1,0};
        int count=0;
        for(int i =0; i<8; i++){
            String a = scanner.next();
            for(int j =0; j<8; j++){
                if(i%2==0){// 짝수 행인 경우
                    if(a.charAt(j)=='F'){ // 두더지 존재
                        if(a0[j]==0){//올라올 수 있는 칸 일때
                            count++; // 카운트 추가
                         }
                   }   
                }
                else{// 홀수 행인 경우
                    if(a.charAt(j)=='F'){ // 두더지 존재
                        if(a1[j]==0){//올라올 수 있는 칸 일때
                            count++; // 카운트 추가
                        }   
                     }
                }       
            }
        }     
        System.out.println(count); 
      }
}