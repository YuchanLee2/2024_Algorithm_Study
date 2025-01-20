import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        for(int n = 0; n < commands.length; n++){
            int i = commands[n][0] -1;
            int j = commands[n][1];
            int k = commands[n][2]-1;
        
            int [] subArray = Arrays.copyOfRange(array, i, j);
            Arrays.sort(subArray);
            answer[n] = subArray[k];
        }
        return answer;
        
        // int[] answer = new int[commands.length];
        // int[] newArr = {};
        // int idx1 = 0, idx2 = 0;
        // // 배열의 n번째 를 구하는 법이 다 첫시작이 0이 아니라 1번째 부터 시작한다는 점을 주의하자
        // for (int i = 0; i < commands.length; i++) {
        //     newArr = new int[commands[i][1]-commands[i][0] + 1]; // 5-2+1 새로운 배열길이
        //     idx1 = 0;
        //     for (int j = commands[i][0]; j <= commands[i][1] ; j++) { // 2 ~ 5
        //         newArr[idx1++] += array[j-1]; //새로운 배열에 2~5까지 숫자 담기
        //     }
        //     Arrays.sort(newArr);
        //     answer[idx2++] += newArr[commands[i][2] - 1]; // k 번째에해당하는 값 answer에 넣기
        // }
        // return answer;
    }
}