class Solution {
    public int[] solution(String s) {
        int count = 0, removedZeros = 0;

        while (!s.equals("1")) {
            int onesCount = 0;

            
            for (char ch : s.toCharArray()) {
                if (ch == '1') {
                    onesCount++;
                }
            }

            removedZeros += s.length() - onesCount; // 제거된 0의 개수 추가
            s = Integer.toBinaryString(onesCount); // 1의 개수로 새 문자열 생성
            count++;
        }

        return new int[]{count, removedZeros};
    }
}
