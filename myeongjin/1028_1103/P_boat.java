import java.util.*;
import java.io.*;
public class P_boat{
// 문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42885
    public static void main(String[] args) {
        
    }

    public static int solution(int[] people, int limit) {	
    	Arrays.sort(people);   	
    	int cur=0;   	
    	int count=0;
    	for(int i =0; i<people.length; i++) {
    		
    		if(limit>cur) {
    			cur+=people[i];
    		}
    		else {
    			count++;
    			cur=people[i];
    		}	
    	}
    	return count;
    }
}
