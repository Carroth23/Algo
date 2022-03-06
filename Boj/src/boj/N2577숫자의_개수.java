package boj;

import java.util.Scanner;

public class N2577숫자의_개수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		int[] arr = new int[10];
		
		while(sum!=0) {
			arr[sum%10]++; // 10으로 나눈 나머지가 0이면 0번이 1이 되고 나머지가 3이되면 3번에 +1이 됨
			sum /= 10; // 위에서 저장 했으니까 하나씩 줄여버리고
		}
		for(int i : arr) {
			System.out.println(i); 
		}
	}

}
