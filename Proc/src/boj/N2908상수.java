package boj;

import java.util.Scanner;

public class N2908상수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		String s = sc.nextLine();
		String[] a = new String[2];
		a = s.split(" ");
		sb.append(a[0]);
		sb1.append(a[1]);
		sb = sb.reverse();
		sb1 = sb1.reverse();
		int b = Integer.parseInt(sb.toString());
		int c = Integer.parseInt(sb1.toString());
		System.out.println(b > c ? b : c);
	}

}
