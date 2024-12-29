// import java.util.HashMap;

// public class players {
//     public String[] solution(String[] players, String[] callings) {
//         // 선수 이름과 인덱스를 매핑할 HashMap 생성
//         HashMap<String, Integer> playerIndex = new HashMap<>();

//         // 초기 선수 인덱스 매핑
//         for (int i = 0; i < players.length; i++) {
//             playerIndex.put(players[i], i);
//         }

//         // 호출된 선수 이름에 따라 순위 업데이트
//         for (String calling : callings) {
//             int idx = playerIndex.get(calling);  // 호출된 선수의 현재 인덱스
//             if (idx > 0) {  // 첫 번째 선수는 추월할 수 없음
//                 // 현재 선수의 이름과 바로 앞 선수의 이름을 교환
//                 String frontPlayer = players[idx - 1];
                
//                 // 선수들의 순위를 교환
//                 players[idx] = frontPlayer;       // 현재 선수의 인덱스를 앞 선수로 업데이트
//                 players[idx - 1] = calling;       // 앞 선수의 인덱스를 현재 선수로 업데이트

//                 // 인덱스 업데이트
//                 playerIndex.put(calling, idx - 1); // 현재 선수의 인덱스 업데이트
//                 playerIndex.put(frontPlayer, idx);  // 앞 선수의 인덱스 업데이트
//             }
//         }
// /* 
//         //호출된 선수의 순위 업데이트
//         for (String calling : callings) {
//             // 호출된 선수의 인덱스 찾기
//             int idx = -1;
//             for(int i =0; i<players.length; i++) {
//                 if(players [i].equals(calling)){
//                     idx = i;
//                     break;
//                 }
//             }
//             // 현재 idx가 0보다 크면, 즉 일등이 아닌 경우 앞 선수와 이름을 바꿈
//             if(idx > 0) {
//                 String front = players[idx-1];
//                 players[idx] = front;
//                 players[idx -1 ] = calling;
//             }
//         }
//         return players;
// */
//    return players;
// }

//     public static void main(String[] args) {
//         first race = new first();
        
//         String[] players = {"mumu", "soe", "poe", "kai", "mine"};
//         String[] callings = {"kai", "kai", "mine", "mine"};
        
//         String[] result = race.solution(players, callings);
//         for (String player : result) {
//             System.out.print(player + " ");
//         }
//         // 예상 출력: ["mumu", "kai", "mine", "soe", "poe"]
//     }
// }
