package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class N1157단어공부 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			String a = br.readLine().toUpperCase();
			int[] arr = new int[26];
			for(int i = 0; i < a.length(); i++) {
				arr[a.charAt(i) - 'A']++;
			}
			int max = -1;
			char maxc = ' ';
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] > max) {
					max = arr[i];
					maxc = (char) (i + 65); // 순서로 해야함
				} else if (arr[i] == max) {
					maxc = '?';
				}
			}
			bw.append(maxc);
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
