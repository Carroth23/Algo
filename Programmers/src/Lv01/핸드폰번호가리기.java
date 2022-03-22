package Lv01;

import java.util.Scanner;

public class 핸드폰번호가리기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String phone_number = sc.nextLine();
        String t = phone_number.substring(phone_number.length()-4, phone_number.length());
        String answer = phone_number.substring(0, phone_number.length()-4).replaceAll("\\d", "*") + t;
//        return phone_number;
	}

}
