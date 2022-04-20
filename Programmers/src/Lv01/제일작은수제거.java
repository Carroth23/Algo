package Lv01;

import java.util.Arrays;

public class 제일작은수제거 {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] x = s.solution(new int[] {1, 2, 3, 4, 5});
		System.out.println(Arrays.toString(x));
	}
}

class Solution {
    public int[] solution(int[] arr) {
    	int[] answer = {};
    	if(arr.length == 0) {
    		answer = new int[1];
    		answer[0] = -1;
    	} else {
    		Arrays.sort(arr);
    		int min = arr[0];
    		int[] result = new int[arr.length - 1];
    		for(int i = 0; i < result.length; i++) {
    			if(arr[i] != min) {
    				result[i] = arr[i];
    			}
    		}
    		answer = result;
    	}
    	return answer;
    }
}
