package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N2869달팽이는올라가고싶다 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			String[] arr = br.readLine().split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int v = Integer.parseInt(arr[2]);
			
//			int day = v / (a - b);
			int day = (v - b) / (a - b);
			if((v - b) % (a - b) != 0) {
				day++;
			}
			bw.append(String.valueOf(day));
			
//			응 시간초과
//			int result = 0;
//			int ctn = 0;
//			while(true) {
//				result += a;
//				ctn++;
//				if(result >= v)
//					break;
//				result -= b;
//			}
//			bw.append(String.valueOf(ctn));
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
