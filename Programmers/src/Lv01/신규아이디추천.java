package Lv01;

public class 신규아이디추천 {

	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		new_id = new_id.toLowerCase();
		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
		while(new_id.contains("..")) {
			new_id = new_id.replace("..", ".");
		}
		if(new_id.charAt(0) == '.') {
			new_id = new_id.substring(1, new_id.length());
		}
		if(new_id.charAt(new_id.length() - 1) == '.') {
			new_id = new_id.substring(new_id.length()-1, new_id.length());
		}
		if(new_id == "") {
			new_id = "a";
		}
		System.out.println(new_id);
	}

}
