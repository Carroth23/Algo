package Lv01;

public class 하샤드수 {

	public static void main(String[] args) {
		int x = 345;
		int sum = 0;
		while(x > 0) {
			sum += x % 10;
			x /= 10;
		}
		System.out.println(sum);
		
	}

}
