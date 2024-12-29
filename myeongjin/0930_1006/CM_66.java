import java.util.*;

public class CM_66 {
    static int n, k;
    static Map<Pair, Integer> rel = new HashMap<>();
    static int maxA = Integer.MIN_VALUE;

    static class Pair {
        int a, b;

        Pair(int a, int b) {
            if (a < b) {
                this.a = a;
                this.b = b;
            } else {
                this.a = b;
                this.b = a;
            }
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair pair = (Pair) o;
            return a == pair.a && b == pair.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }

    static void placeInSeat(List<Integer> stus, List<Pair> pairs) {
        if (!stus.isEmpty()) {
            for (int i = 1; i < stus.size(); i++) {
                int stu = stus.remove(i);
                List<Pair> newPairs = new ArrayList<>(pairs);
                newPairs.add(new Pair(stus.get(0), stu));
                placeInSeat(stus.subList(1, stus.size()), newPairs);
                stus.add(i, stu);
            }
        } 
        else {
            int atmosphere = pairs.stream().mapToInt(pair -> rel.getOrDefault(pair, 0)).sum();
            maxA = Math.max(maxA, atmosphere);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            rel.put(new Pair(b, c), a == 1 ? 1 : -1);
            sc.nextLine(); 
        }

        List<Integer> stus = new ArrayList<>();
        for (int i = 1; i <= n * 2; i++) {
            stus.add(i);
        }

        placeInSeat(stus, new ArrayList<>());
        System.out.println(maxA);
        sc.close();
    }
}
