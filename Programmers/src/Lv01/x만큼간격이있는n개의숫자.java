package Lv01;

import java.util.Arrays;
import java.util.Scanner;

public class x만큼간격이있는n개의숫자 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(Arrays.toString(solution(x, n)));
	}

	public static long[] solution(long x, int n) {
		long[] answer = new long[n];
		for (int i = 0; i < n; i++) {
			answer[i] = (x * (i + 1));
		}
		return answer;
	}

}
