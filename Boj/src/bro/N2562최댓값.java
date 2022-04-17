package bro;

import java.util.Scanner;

public class N2562최댓값 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		int count = 0;
		int max = 0;
		int number = 0;
		for(int i : num) {
			count++;
			if(i > max) {
				number = count;
				max = i;
			}
		}
		System.out.println(max + " " + number);
	}

}
