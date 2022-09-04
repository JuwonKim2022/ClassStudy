package sec06.exam01;

public class CastingEx1 {

	public static void main(String[] args) {
		
		/*
		 Casting : 작은범위 이름 = (작은범위) 이름
		 */
		
		int intVal = 44032;
		char charVal = (char)intVal;
		System.out.println(charVal);
		
		System.out.println();
		
		long longVal = 500;
		int intVal2 = (int)longVal;
		System.out.println(intVal2);

		System.out.println();
		
		double doubleVal = 3.14;
		int intVal3 = (int)doubleVal;
		System.out.println(intVal3);

	}

}
