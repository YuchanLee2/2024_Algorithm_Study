class P42883 {
    public static String solution(String number, int k) {

        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int next = 0;

        for (int i = 0; i < number.length()-k; i++) {

            int max = 0;

            for (int j = idx; j <= i + k; j++) {
                int cur = number.charAt(j) - '0';

                // 최대값 갱신
                if (max < cur) {
                    max = cur;
                    next = j;
                }

            }

            sb.append(max);

            idx = next + 1;

        }

        return sb.toString();
    }
}