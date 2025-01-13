public class MinSwaps {
    public static void main(String[] args) {
        String[] seats = {"AC", "DD", "DD", "CA"};
        int result = minSwaps(seats);
        System.out.println("최소 교환 횟수: " + result);
    }

    public static int minSwaps(String[] seats) {
        String[] target = {"AA", "DD", "DD", "CC"}; // 목표 배열
        int swapCount = 0;

        // 현재 상태와 목표 상태 비교
        for (int i = 0; i < seats.length; i++) {
            while (!seats[i].equals(target[i])) {
                int targetIndex = findIndex(seats, target[i]);

                // 목표 인덱스가 유효한지 체크
                if (targetIndex == -1) {
                    System.out.println("Error: 목표 인덱스를 찾을 수 없습니다.");
                    return -1; // 오류 처리
                }

                // 인접한 자리에서 교환
                // 목표 인덱스가 현재 인덱스보다 클 경우
                while (targetIndex > i) {
                    swap(seats, targetIndex - 1, targetIndex);
                    targetIndex--;
                    swapCount++;
                }
                // 목표 인덱스가 현재 인덱스보다 작을 경우
                while (targetIndex < i) {
                    swap(seats, targetIndex, targetIndex + 1);
                    targetIndex++;
                    swapCount++;
                }
            }
        }

        return swapCount;
    }

    private static int findIndex(String[] seats, String value) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i].equals(value)) {
                return i;
            }
        }
        return -1; // 찾지 못한 경우
    }

    private static void swap(String[] seats, int i, int j) {
        // 자리 교환
        String temp = seats[i];
        seats[i] = seats[j];
        seats[j] = temp;
    }
}
