public class Triangle2 {
    public static int solution(int[] sides) {
        // 가장 긴 변이 sides 배열에 포함된 경우
        int longest = Math.max(sides[0], sides[1]); 
        int shortest = longest - Math.min(sides[0], sides[1]);
        int answer1 = longest - shortest;

        // 가장 긴 변이 없는 경우
        longest = sides[0] + sides[1];
        shortest = Math.max(sides[0], sides[1]);
        int answer2 = longest - shortest - 1;

        return answer1 + answer2;
    }
}