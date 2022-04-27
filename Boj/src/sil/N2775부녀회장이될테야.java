package sil;

import java.util.Arrays;
import java.util.Scanner;

public class N2775부녀회장이될테야 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[15][15];
		for(int i = 0; i < arr.length; i++) {
			arr[i][0] = 1;
			arr[14][i] = i + 1;
			System.out.println(Arrays.deepToString(arr));
		}
	}

}
