package boj;

import java.util.Scanner;

public class N8958OX퀴즈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < cnt; i++) {
			int point = 0;
			int tmpPoint = 0;
			String tmp = sc.nextLine();
			for(int j = 0; j < tmp.length(); j++) {
				char ch = tmp.charAt(j);
				if(ch == 'O') {
					tmpPoint++;
					point += tmpPoint;
				} else {
					tmpPoint = 0;
				}
			}
			System.out.println(point);
		}
	}

}
