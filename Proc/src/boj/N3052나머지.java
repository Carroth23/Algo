package boj;

import java.util.Scanner;

public class N3052나머지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[42];
		
		for(int i = 0; i < 10; i++) {
			arr[sc.nextInt() % 42] = true; // 중복허용x
		}
		int count = 0;
		for(boolean i : arr) {
			if(i) {
				count++;
			}
		}
		System.out.println(count);
	}
}
