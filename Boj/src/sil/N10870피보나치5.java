package sil;

import java.util.Scanner;

public class N10870피보나치5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		System.out.println(result(n));
	}
	
	static int result(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return result(n - 1) + result(n - 2);
	}

}
