package boj;

import java.util.Scanner;

public class N1978소수찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			if(tmp == 1)
				continue;
			
			for(int j = 2; j < tmp; j++) {
				if(tmp % j == 0) {
					cnt--;
					break;
				}
			}
			cnt++;
		}
		System.out.println(cnt);
	}

}
