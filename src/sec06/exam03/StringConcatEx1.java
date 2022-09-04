package sec06.exam03;

public class StringConcatEx1 {

	public static void main(String[] args) {
		
		int val = 10 + 2 + 8;
		System.out.println(val);
		
		String str1 = 10 + 2 + "8";
		System.out.println(str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println(str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println(str3);
		
		String str4 = "10" + (2 + 8);
		System.out.println(str4);

	}

}
