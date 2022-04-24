package sil;

import java.util.Scanner;

public class N2775부녀회장이될테야 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[15][15];
		int t = sc.nextInt();
		for(int i = 0; i < arr.length; i++) {
			arr[i][1] = 1;
			arr[0][i] = i;
		}
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 2; j < arr.length; j++) {
				arr[i][j] = arr[i][j-1] + arr[i-1][j];
			}
		}
		for(int i = 0; i < t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(arr[k][n]);
		}
	} 

}
