class Solution {
    public int solution(String name) {
        int answer = 0; 
        int length = name.length();
        
        int index;
        int move = length-1;
        // 상하 알파벳을 변경
        for(int i = 0; i<name.length(); i++){
            answer += Math.min(name.charAt(i) -'A', 'Z'- name.charAt(i) + 1); 
            
            index = i+1;
            //연속 되는 A의 개수
            while(index < length && name.charAt(index) =='A'){
                index++;
            }
             // 좌우 커서 변경
            //ABCD -> 처음부터 오른쪽으로 쭉 이동
            //CBAAAAAZYY -> 두번째 B까지 갔다가 다시 C -> ZYY
            //CSDAAAAAY -> C-Y로 갔다가 그 다음 돌아와서 CSD
            move = Math.min(move, i*2 + length - index);
            move = Math.min(move, (length - index)*2 + i);
            
        
        }
         return answer+move;
    }
        
    }
