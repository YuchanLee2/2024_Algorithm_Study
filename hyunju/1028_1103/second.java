// import java.util.*;
// public class second {
//     public int[] solution(String today, String[] terms, String[] privacies) {
//   // 오늘 날짜 처리
//         String[] todayParts = today.split("\\.");
//         int todayYear = Integer.parseInt(todayParts[0]);
//         int todayMonth = Integer.parseInt(todayParts[1]);
//         int todayDay = Integer.parseInt(todayParts[2]);

//         // 약관 유효기간을 담을 맵 생성
//         Map<String, Integer> termValidity = new HashMap<>();
//         for (String term : terms) {
//             String[] parts = term.split(" ");
//             String termType = parts[0];
//             int validity = Integer.parseInt(parts[1]);
//             termValidity.put(termType, validity);
//         }

//         List<Integer> expiredIndexes = new ArrayList<>();

//         // 개인정보 확인
//         for (int i = 0; i < privacies.length; i++) {
//             String[] privacyParts = privacies[i].split(" ");
//             String[] dateParts = privacyParts[0].split("\\.");
//             int collectedYear = Integer.parseInt(dateParts[0]);
//             int collectedMonth = Integer.parseInt(dateParts[1]);
//             int collectedDay = Integer.parseInt(dateParts[2]);
//             String termType = privacyParts[1];

//             // 유효기간 계산
//             int validity = termValidity.get(termType);
//             int expirationYear = collectedYear;
//             int expirationMonth = collectedMonth + validity;

//             // 월이 12를 넘으면 연도를 증가시킴
//             if (expirationMonth > 12) {
//                 expirationYear += expirationMonth / 12;
//                 expirationMonth = expirationMonth % 12;
//                 if (expirationMonth == 0) {
//                     expirationMonth = 12;
//                     expirationYear--;
//                 }
//             }

//             // 만료일 계산
//             int expirationDay = collectedDay - 1; // 파기 날짜는 유효기간 마지막 날의 다음 날

//             // 만료 여부 확인
//             if (expirationYear < todayYear || 
//                 (expirationYear == todayYear && expirationMonth < todayMonth) || 
//                 (expirationYear == todayYear && expirationMonth == todayMonth && expirationDay < todayDay)) {
//                 expiredIndexes.add(i + 1); // 1-indexed
//             }
//         }

//         // 결과를 정수 배열로 변환
//         return expiredIndexes.stream().mapToInt(i -> i).toArray();
//     }
// }