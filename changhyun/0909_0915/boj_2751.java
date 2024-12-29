import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] numbers = new int[n];

    for (int i = 0; i < n; i++) {
      numbers[i] = Integer.parseInt(br.readLine());
    }

    // java 내장 sorting method
    Arrays.sort(numbers);

    for (int number : numbers) {
      System.out.println(number);
    }
  }
}
