import java.util.Stack;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[] {0, 0}); 

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int currentValue = current[0];
            int currentIndex = current[1];

           
            if (currentIndex == numbers.length) {
                if (currentValue == target) {
                    answer++;
                }
            } else {
                
                stack.push(new int[] {currentValue + numbers[currentIndex], currentIndex + 1});
                stack.push(new int[] {currentValue - numbers[currentIndex], currentIndex + 1});
            }
        }

        return answer;
    }
}


