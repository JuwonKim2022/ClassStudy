package sec06.exam01;

public class PromotionEx1 {

	public static void main(String[] args) {
		
		byte byteVal = 10;
		int intVal = byteVal;
		System.out.println("intValue: " + intVal);
		
		char charVal = '가';
		intVal = charVal;
		System.out.println("intValue: " + intVal);
		
		intVal = 30;
		long longVal = intVal;
		System.out.println("longValue: " + longVal);
		
		longVal = 100;
		float floatVal = longVal;
		System.out.println("floatValue: " + floatVal);
		
		floatVal = 100.5f;
		float doubleVal = floatVal;
		System.out.println("doubleValue: " + doubleVal);
		
	}

}
