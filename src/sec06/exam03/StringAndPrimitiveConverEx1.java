package sec06.exam03;

public class StringAndPrimitiveConverEx1 {

	public static void main(String[] args) {
		
		String str1 = "10";
		int val1 = Integer.parseInt(str1);
		System.out.println(val1);
		
		double val2 = Double.parseDouble("3.14");
		System.out.println(val2);
		
		boolean val3 = Boolean.parseBoolean("true");
		System.out.println(val3);
		
		int val4 = 10;
		String str2 = String.valueOf(val4);
		System.out.println(str2);
		
		String str3 = String.valueOf(3.14);
		System.out.println(str3);
		
		String str4 = String.valueOf(true);
		System.out.println(str4);

	}

}
