package bro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class N10828스택 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack stack = new Stack();
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String cmd = st.nextToken();
			if(st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				stack.push(num);
			}
			switch(cmd) {
			case "top":
				bw.write(stack.isEmpty() ? -1 + "\n" : stack.peek() + "\n");
				break;
			case "empty":
				bw.write(stack.isEmpty() ? 1 + "\n" : 0 + "\n");
				break;
			case "size":
				bw.write(stack.size() + "\n");
				break;
			case "pop":
				bw.write(stack.isEmpty() ? -1 + "\n" : stack.pop() + "\n");
			}
		}
		bw.flush();
	}

}
