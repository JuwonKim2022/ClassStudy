package sec05.exam07;

public class FloatDoubleEx {

	public static void main(String[] args) {
		
		float var1 = 3.14F;		//기본적으로 double 타입이라 오류나므로 float는 뒤에 F 넣
		double var2 = 3.14;
		
		System.out.println(var1);
		System.out.println(var2);
		
		float var3 = 0.1234567890123456789f;
		double var4 = 0.1234567890123456789;
		
		System.out.println(var3);
		System.out.println(var4);
		
		double var5 = 3e6;
		float var6 = 3e6f;
		double var7 = 2e-3;
		
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);

	}

}
