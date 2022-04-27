package sil;

<<<<<<< HEAD
import java.util.Arrays;
=======
>>>>>>> 56a6036f6ba21141bd043868013f67d7a5e5f136
import java.util.Scanner;

public class N2775부녀회장이될테야 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[15][15];
<<<<<<< HEAD
		for(int i = 0; i < arr.length; i++) {
			arr[i][0] = 1;
			arr[14][i] = i + 1;
			System.out.println(Arrays.deepToString(arr));
		}
	}
=======
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
>>>>>>> 56a6036f6ba21141bd043868013f67d7a5e5f136

}
