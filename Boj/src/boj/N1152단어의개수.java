package boj;

import java.util.Scanner;

public class N1152단어의개수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine().trim();
		if(tmp.equals("")) {
			System.out.println(0);
		} else {
			String[] strArr = tmp.split(" ");
			System.out.println(strArr.length);
		}
	}

}
