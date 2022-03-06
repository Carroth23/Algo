package boj;

import java.util.Arrays;
import java.util.Scanner;

public class N10818최소_최대 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] numbers = new int[n];
		
		for(int i = 0;i < n; i++) {
			numbers[i] = sc.nextInt();
		}
		Arrays.sort(numbers);
		System.out.println(numbers[0] + " " + numbers[n - 1]);
	}

}
