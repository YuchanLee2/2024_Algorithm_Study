// import java.util.*;

// public class third {
//     public int[] solution(String[] id_list, String[] report, int k) {
// // 각 유저의 신고 당한 횟수
//         Map<String, Integer> reportCount = new HashMap<>();
//         // 각 유저가 신고한 유저 목록
//         Map<String, Set<String>> userReports = new HashMap<>();

//         // 초기화
//         for (String id : id_list) {
//             reportCount.put(id, 0);
//             userReports.put(id, new HashSet<>());
//         }

//         // 신고 정보 처리
//         for (String r : report) {
//             String[] parts = r.split(" ");
//             String reporter = parts[0];
//             String reported = parts[1];

//             // 신고한 유저의 신고 내역에 신고한 유저 추가
//             if (userReports.get(reporter).add(reported)) { // Set에 추가 성공 시에만
//                 // 신고 당한 횟수 증가
//                 reportCount.put(reported, reportCount.get(reported) + 1);
//             }
//         }

//         // 결과를 저장할 배열
//         int[] result = new int[id_list.length];

//         // 기준 이상 신고 당한 유저 찾기
//         for (int i = 0; i < id_list.length; i++) {
//             String id = id_list[i];
//             // 해당 유저가 신고한 유저 목록을 가져온다
//             Set<String> reports = userReports.get(id);
//             for (String reportedId : reports) {
//                 // 신고당한 횟수가 k 이상이면
//                 if (reportCount.get(reportedId) >= k) {
//                     result[i]++; // 신고한 유저에게 메일 수 증가
//                 }
//             }
//         }

//         return result;

//         }
//         public static void main(String[] args) {
//             fangram solution = new fangram();
        
//         String[] id_list = {"con", "ryan"};
//         String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
//         int k = 3;
        
//         int[] result = solution.solution(id_list, report, k);
//         System.out.println(Arrays.toString(result)); // 예상 출력: [0, 0]
//     }
// }

