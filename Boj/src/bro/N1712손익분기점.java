package bro;

import java.util.Scanner;

public class N1712손익분기점 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long total = sc.nextInt();
		long trans = sc.nextInt();
		long tex = sc.nextInt();
		if(tex <= trans) {
			System.out.println(-1);
		}else {
			System.out.println((total / (tex - trans)) + 1);
		}
	}

}
