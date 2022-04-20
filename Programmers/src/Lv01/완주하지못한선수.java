package Lv01;

import java.util.Arrays;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		Solution3 sol3 = new Solution3();
		String[] tmp1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] tmp2 = {"josipa", "filipa", "marina", "nikola"};
		String tmp = sol3.solution(tmp1, tmp2);
		System.out.println(tmp);
	}

}

class Solution3 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i = 0;
        for(i = 0; i < completion.length; i++) {
        	if(!participant[i].equals(completion[i])) {
        		break;
        	}
        }
        return participant[i];
    }
}