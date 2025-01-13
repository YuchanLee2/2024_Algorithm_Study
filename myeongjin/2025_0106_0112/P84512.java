import java.util.ArrayList;
class P84512 {
    static String[] arr;

    static ArrayList<String> list;

    public int solution(String word) {
        int answer = 0;

        list = new ArrayList<>();
        arr = new String[]{"A", "E", "I", "O", "U"};

        dfs("", 0);

        return list.indexOf(word);
    }

    private void dfs(String str, int dep) {
        // TODO Auto-generated method stub

        list.add(str);

        if(dep==5) {
            return;
        }

        for(int i =0; i<arr.length; i++) {

            dfs(str+arr[i],dep+1);


        }



    }
}