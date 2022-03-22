package Lv01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 평균구하기 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		IntStream stream = Arrays.stream(arr);
		int sum = stream.sum();
		stream = Arrays.stream(arr);
		long cnt = stream.count();
		System.out.println((double)sum / cnt);
	}

}
