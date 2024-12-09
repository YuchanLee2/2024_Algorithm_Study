import java.util.*;
import java.io.*;
public class P_truck{
// 문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42583
    public static void main(String[] args) {
        
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
		
    	Queue< Integer> q  = new LinkedList<>();
    	
    	int sum=0;
    	int time=0;
    	
    	for(int i =0; i<truck_weights.length; i++) {
    		
    		int truck=truck_weights[i];
    		
    		while(true) {
    			
    			if(q.isEmpty()) { //큐가 비어있을 떄
    				q.add(truck);
    				sum+=truck;
    				time++;
    				break;
    				
    			}
    			else if(q.size()==bridge_length) { //다리에 트럭이 다 찬 경우
    				
    				sum-= q.poll();
    			}
    			else { //아직 다리가 다 차지 않았을때
    				
    				if(sum+truck <=weight) { //다리의 무게를 넘지 않는 선에서 추가
    					q.add(truck);
    					sum+=truck;
    					time++;
    					break;
    				}
    				else {
    				// 넘는다면 0을 넣어 큐에 넣는 트럭이 다리를 건너게 만듬.
    					q.add(0);
    					time++;
    				}
    				
    				
                }		
    			
    		}
		
    	}
    		
    	
    	return time+bridge_length;

    	
    	
    }
}
