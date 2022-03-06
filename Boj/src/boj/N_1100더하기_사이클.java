package boj;

import java.io.IOException;
import java.util.Scanner;

public class N_1100더하기_사이클 {

	public static void main(String[] args) throws IOException {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int tmp = n; // 입력받은거 복사해두고
		int count = 0; // 카운트용
		sc.close();
		while(true) {
			count++;
			// 오른쪽꺼 십의자리 (n % 10) * 10
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
			if(n == tmp) {
				break;
			}
		}
		System.out.println(count);
	}

}
