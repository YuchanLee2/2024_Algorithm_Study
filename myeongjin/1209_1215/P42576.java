import java.util.HashMap;

class P42576 {
    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> hash = new HashMap<>();

        for(int i =0; i<completion.length; i++) {

            hash.put(completion[i], hash.getOrDefault(completion[i], 0)+1);
        }


        for(int i =0; i<participant.length; i++) {



            if(!hash.containsKey(participant[i])||hash.get(participant[i])==0) {
                // 키가 존재하지 않거나, 이미 존재한 사람이 출입함
                return participant[i]; //그 사람은 마라톤 실패한사람.
            }

            hash.put(participant[i],hash.get(participant[i])-1); // 통과한 사람은 -1 해줌
        }




        return null;
    }
}