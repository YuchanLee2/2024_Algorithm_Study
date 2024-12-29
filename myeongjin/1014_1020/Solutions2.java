// import java.util.*;
// import java.io.*;
// public class Solutions2 {

//     public int solution(int[] diffs, int[] times, long limit) {
//         int answer = 0;
//         int left = 1;
//         int right = 100000;


//         while(left<=right) { //이진탐색
//             int level = (left+right)/2; //mid
//             long totalTime = getTime(diffs, times, level); // 총 소요시간

//             if(totalTime<=limit) { // 제한시간 이내
//                 answer = level;
//                 right = level-1; //중간값 탐색
//             }
//             else {
//                 left = level+1; 
//             }

//         }

//         return answer;
//     }
//     private long getTime(int[]diffs, int[]times, int level){
//         long sum = 0; // 총 소요시간

//         for(int i=0; i<diffs.length; i++){ //난이도 개수만큼
//             int solve = diffs[i]-level;

//             if(solve <= 0) { //난이도 <= 숙련도
//                 sum += times[i]; // 현재 소요시간
//                 continue;
//             }
//             if (i==0){
//                  sum += (long)times[i] * solve + times[i];
//             }
//             else {
//                 sum += (long)(times[i]+times[i-1]) * solve + times[i];
//             } 

//             return sum;
//         }
//     }
// }
// class Solution {
//     public int solution(int[] diffs, int[] times, long limit) {
//         int answer = 0;
//         int left = 1;
//         int right = 100000;


//         while(left<=right) { //이진탐색
//             int level = (left+right)/2; //mid
//             long totalTime = getTime(diffs, times, level); // 총 소요시간

//             if(totalTime<=limit) { // 제한시간 이내
//                 answer = level;
//                 right = level-1; //중간값 탐색
//             }
//             else {
//                 left = level+1; 
//             }

//         }

//         return answer;
//     }
//     private long getTime(int[]diffs, int[]times, int level){
//         long sum = 0; // 총 소요시간

//         for(int i=0; i<diffs.length; i++){ //난이도 개수만큼
//             int solve = diffs[i]-level;

//             if(solve <= 0) { //난이도 <= 숙련도
//                 sum += times[i]; // 현재 소요시간
//                 continue;
//             }
//             if (i==0){
//                  sum += (long)times[i] * solve + times[i];
//             }
//             else {
//                 sum += (long)(times[i]+times[i-1]) * solve + times[i];
//             } 


//         return sum;
//     }
// }