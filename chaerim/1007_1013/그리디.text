import java.io.*;
import java.util.*;    
class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int totalPicks = picks[0] + picks[1] + picks[2];
        int maxMinerals = totalPicks * 5;
        
        // 광물을 최대 채굴 가능 수로 제한
        if (minerals.length > maxMinerals) {
            minerals = java.util.Arrays.copyOf(minerals, maxMinerals);
        }
        
        List<Group> groups = checkValue(minerals);
        
        groups.sort(Comparator.comparingInt(Group::getValue).reversed());
 
        for (Group group : groups) {
            if (picks[0] > 0) { 
                answer += group.getDiamondCount() + group.getIronCount() + group.getStoneCount();
                picks[0]--;
            } else if (picks[1] > 0) { 
                answer += group.getDiamondCount() * 5 + group.getIronCount() + group.getStoneCount();
                picks[1]--;
            } else if (picks[2] > 0) {
                answer += group.getDiamondCount() * 25 + group.getIronCount() * 5 + group.getStoneCount();
                picks[2]--;
            } else {
                break; // 모든 곡괭이를 다 사용한 경우 종료
            }
        }
        return answer;
    }
 
    public List<Group> checkValue(String[] minerals) {
        int mineralsGroups = (minerals.length + 4) / 5;  // 5개씩 나눌 그룹 수 계산
        List<Group> groupsValue = new ArrayList<>();
 
        for (int i = 0; i < minerals.length; i += 5) {
            int groupValue = 0;
            int diamondCount = 0;
            int ironCount = 0;
            int stoneCount = 0;
            for (int j = 0; j < 5 && i + j < minerals.length; j++) {
                String type = minerals[i + j];
                switch (type) {
                    case "diamond" -> {
                        groupValue += 25;
                        diamondCount++;
                    }
                    case "iron" -> {
                        groupValue += 5;
                        ironCount++;
                    }
                    case "stone" -> {
                        groupValue += 1;
                        stoneCount++;
                    }
                }
            }
            groupsValue.add(new Group(groupValue, diamondCount, ironCount, stoneCount));
        }
        return groupsValue;
    }
 
    class Group {
        private final int value;
        private final int diamondCount;
        private final int ironCount;
        private final int stoneCount;
 
        public Group(int value, int diamondCount, int ironCount, int stoneCount) {
            this.value = value;
            this.diamondCount = diamondCount;
            this.ironCount = ironCount;
            this.stoneCount = stoneCount;
        }
 
        public int getValue() {
            return value;
        }
 
        public int getDiamondCount() {
            return diamondCount;
        }
 
        public int getIronCount() {
            return ironCount;
        }
 
        public int getStoneCount() {
            return stoneCount;
        }
    }
}
