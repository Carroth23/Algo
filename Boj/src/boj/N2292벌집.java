package boj;

import java.util.Scanner;

public class N2292벌집 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int where = sc.nextInt(); // 8
		int sum = 1;
		int there = 2;
		if (where == sum) {
			System.out.println(sum);
		} else {
			while(there <= where) { // 8
				there += (6 * sum);
				sum++;
			}
			System.out.println(sum);
		}
	}

}
