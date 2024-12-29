import java.util.Stack;

class P12909 {
    boolean solution(String s) {


        Stack<String> stack = new Stack<>();

        for(int i =0; i<s.length(); i++) {

            if(s.charAt(i)=='(') {

                stack.add(s);

            }

            else if(s.charAt(i)==')') {
                if(stack.isEmpty()){

                    return false;

                }
                stack.pop();
            }


        }

        return stack.isEmpty();







    }
}