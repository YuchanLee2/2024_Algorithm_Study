// import java.util.Scanner;
// import java.util.Stack;

// public class second {
//     public static void main(String[] args) {
//         int answer = 0;
//         // String inputs = "55-50+40";
//         // 또는 입력값을 scanner로 받아야하나?

//         Scanner scanner = new Scanner(System.in);
//         String inputs = scanner.nextLine(); // 입력 받기

//         String []input = inputs.split("-"); // 뺄셈을 기준으로 다 나눔
        
//         for(String part: input[0].split("\\+")) { //첫번 째 부분의 합계 ex)50+30
//             answer += Integer.parseInt(part);
//         }
//         // 처음을 제외한 나머지 값들
//         for (int i = 1; i < input.length; i++) {
//             int subsum = 0;
//             for(String part: input[i].split("\\+")){
//                 subsum += Integer.parseInt(part); // 나머지 뒷부분의 각 합계
//             }
//             answer -= subsum; // 처음에서 나머지 부분의 합 빼기
//         }
//         System.out.println(answer); // 최종 결과 출력
//     }
// }
