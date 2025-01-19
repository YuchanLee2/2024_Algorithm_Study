class P42860 {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();

        int index;
        int move = length - 1;

        // 상하 알파벳을 변경
        for (int i = 0; i < length; i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            index = i + 1;
            // 연속 되는 A의 개수
            while (index < length && name.charAt(index) == 'A') {
                index++;
            }

            // 좌우 커서 변경
            // 이동 거리 계산
            move = Math.min(move, i + length - index); // 오른쪽으로 이동
            move = Math.min(move, (length - index) + i); // 왼쪽으로 돌아오는 경우
        }

        return answer + move;
    }
}