package sec05.exam03;

public class LongEx1 {

	public static void main(String[] args) {
		
		long var1 = 10;
		long var2 = 2000000000;
//		long var3 = 20000000000;	전수 리터터럴은 기본적으로 int로 판단
		long var3 = 20000000000L;	
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);

	}

}
