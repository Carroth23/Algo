package sil;

public class tmp {
	public static void main(String[] args) {
		int n = 0;
		for(int i = 1; i <= 10; i++) {
			if(i == 5)
				continue;
			n += i;
		}
		System.out.println(n);
	}
}
