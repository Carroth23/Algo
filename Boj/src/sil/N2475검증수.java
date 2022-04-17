package sil;

import java.util.Scanner;

public class N2475검증수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			sum += (num * num);
		}
		System.out.println(sum % 10);
	}

}
