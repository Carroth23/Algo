package boj;

import java.util.Scanner;

public class N10809알파벳찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*스트링값을 받고 char배열에 각각 넣어서
		 * forEach돌리면서 문자열 찾고?*/
		int[] en = new int[26]; // 알파벳방
		for(int i = 0; i < en.length; i++) {
			en[i] = -1;
		}
		
		// abc라고 가정
		String s = sc.nextLine();
		for(int i = 0; i < s.length(); i++) {
			char tmp = s.charAt(i);	// a
									// b
									// c
			if(en[tmp - 'a'] == -1) {
				en[tmp - 'a'] = i;
			}
		}
		
		for(int a : en) {
			System.out.print(a + " ");
		}
		
	}
}
