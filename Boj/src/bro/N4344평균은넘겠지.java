package bro;

import java.util.Scanner;

public class N4344평균은넘겠지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tCase = sc.nextInt(); // 테스트케이스
		for (int i = 0; i < tCase; i++) {
			int n = sc.nextInt(); // 학생 수
			double m = 0; // 평균을 넘는 학생수
			int[] arr = new int[n];

			int sum = 0; // 한줄 총점
			double avg = 0; // 한줄 평균
			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt(); // 애들 점수
				sum += arr[j];
			}
			avg = (double) sum / n;
			for (int j = 0; j < n; j++) {
				if (arr[j] > avg) {
					m++;
				}
			}
			System.out.printf("%.3f%%\n", (m / n) * 100);
		}
	}

}
