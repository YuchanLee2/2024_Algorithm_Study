public class ChickenCoupon {
    public static int solution(int chicken) {
        int answer = 0;  // 총 먹은 추가 치킨 수
        int coupon = chicken;  // 초기 쿠폰 수

        // 쿠폰이 10장 이상일 때만 반복
        while (coupon >= 10) {
            // 쿠폰으로 얻은 추가 치킨 수
            int eaten = coupon / 10;
            answer += eaten;  // 먹은 치킨 추가

            // 남은 쿠폰 = 사용 후 남은 쿠폰 + 새로 얻은 쿠폰
            coupon = (coupon % 10) + eaten;
        }

        return answer;
    }

    public static void main(String[] args) {
        // 예시로 100마리 치킨을 입력했을 때 출력
        int chicken = 100;
        System.out.println(solution(chicken));  // 출력: 11
    }
}