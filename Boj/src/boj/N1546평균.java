package boj;

import java.util.Scanner;

public class N1546평균 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		// 과목 수
		int[] arr = new int[n];		// 원점수
		double max = arr[0];		// 최고점수
		double[] arr2 = new double[n];	// 수정점수
		double sum = 0;
		
		for(int i = 0; i < n; i++) {// 원점수 세팅
			arr[i] = sc.nextInt();
			if(arr[i] > max) { // 최고점수 세팅
				max = arr[i];
			}
		}
		
		for(int i = 0; i < n; i++) {
			arr2[i] = arr[i] / max * 100;
			sum += arr2[i];
		}
		System.out.println(sum / n);
	}
}
