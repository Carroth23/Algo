package bro;

import java.util.Scanner;

public class N2914저작권 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// (창영이 앨범에 수록된 곡에 포함되어 있는 저작권이 있는 멜로디의 개수) / (앨범에 수록된 곡의 개수) = 평균값
		int a = sc.nextInt(); // 앨범에 수록된 곡의 개수
		int b = sc.nextInt(); // 평균값
		System.out.println(a * (b-1) + 1);
	}
}
