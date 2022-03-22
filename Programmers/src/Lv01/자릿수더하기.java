package Lv01;

public class 자릿수더하기 {
	public static void main(String[] args) {
		int answer = 0;
		int n = 3231;
		String tmp = String.valueOf(n);
		int[] intArr = new int[tmp.length()];
		for(int i = 0; i < tmp.length(); i++) {
			intArr[i] = tmp.charAt(i) - '0';
			answer += intArr[i];
		}
		System.out.println(answer);
	}
}
