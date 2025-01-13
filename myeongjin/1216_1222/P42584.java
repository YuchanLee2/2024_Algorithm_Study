import java.util.Stack;

class P42584 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Stack<int []> stack = new Stack<>();

        for(int i =0; i<prices.length; i++) {

            answer[i]=prices.length-i-1;

            int [] arr={i,prices[i]};

            while(!stack.isEmpty() && stack.peek()[1] >prices[i]) { // 가격이 떨어진 경우
                int [] price = stack.pop();

                answer[price[0]]=i-price[0];


            }

            stack.push(arr);
        }



        return answer;
    }

}