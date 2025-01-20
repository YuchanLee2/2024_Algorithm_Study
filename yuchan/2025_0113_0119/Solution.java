import java.util.*;

class Solution {
    public int solution(String n) {
        int answer = 0;

        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<n.length(); i++){
            if(i != 0 && n.charAt(i) !='A'){ 
                al.add(i);
            }
            answer += Math.min(91-(int)n.charAt(i), (int)n.charAt(i)-65);
        }
        int east = al.get(0);
        int west = al.get(al.size()-1);
        int westi = n.length()-west;
        answer += east<westi? east+west-east : westi+west-east;


        return answer;
    }
}
