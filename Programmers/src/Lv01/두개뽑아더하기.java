package Lv01;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class 두개뽑아더하기 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] arr = {2, 1, 3, 4, 1};
	}
}

class Solution2 {
    public int[] solution(int[] numbers) {
    	TreeSet<Integer> ts = new TreeSet<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                ts.add(numbers[i]+numbers[j]);
            }
        }
        
        int[] answer = new int[ts.size()];
        int cnt=0;
        Iterator<Integer> it= ts.iterator();
        while(it.hasNext()){
            answer[cnt++]=it.next();
        }
        
        return answer;
    }
}