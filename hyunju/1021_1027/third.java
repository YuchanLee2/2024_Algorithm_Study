// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.OutputStreamWriter;
// import java.util.Stack;

// public class third {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

// 		String[] sarr = br.readLine().split(" ");
// 		int N = Integer.parseInt(sarr[0]);
// 		int P = Integer.parseInt(sarr[1]);

// 		Stack<Integer>[] stack = new Stack[7];

// 		for (int i = 0; i <= 6; i++)
// 			stack[i] = new Stack<>();

// 		int cnt = 0;

// 		for (int i = 0; i < N; i++) {
// 			sarr = br.readLine().split(" ");
// 			int n = Integer.parseInt(sarr[0]);
// 			int m = Integer.parseInt(sarr[1]);

// 			while (!stack[n].isEmpty() && stack[n].peek() > m) {
// 				stack[n].pop();
// 				cnt++;
// 			}

// 			if (stack[n].empty() || (!stack[n].isEmpty() && stack[n].peek() < m)) {
// 				stack[n].push(m);
// 				cnt++;
// 			}
// 		}

// 		bw.write(cnt + "\n");
// 		bw.flush();
//     }

// }
