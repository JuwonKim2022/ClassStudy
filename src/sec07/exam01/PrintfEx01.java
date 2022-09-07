package sec07.exam01;

public class PrintfEx01 {

	public static void main(String[] args) {
		
		int val = 123;
		System.out.printf("상품의 가격 : %d원\n", val);
		System.out.println();
		System.out.printf("상품의 가격 : %6d원\n", val);
		System.out.printf("상품의 가격 : %-6d원\n", val);
		System.out.println();
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %1$d인 원의 넓이 : %2$10.2f\n", 10, area);
		System.out.println();
		
		String name = "Kim Juwon";
		String job = "Biologist";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}
