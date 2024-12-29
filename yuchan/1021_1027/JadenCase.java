class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean capitalize = true;

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                answer.append(ch);
                capitalize = true;
            } else if (capitalize) {
                answer.append(Character.toUpperCase(ch));
                capitalize = false;
            } else {
                answer.append(Character.toLowerCase(ch));
            }
        }
        
        return answer.toString();
    }
}
