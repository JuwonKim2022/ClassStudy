package sec08.exam01;

public class IncreDecreEx1 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------");
		x++;
		++x;
		System.out.println(x);
		
		System.out.println("---------------");
		y--;
		--y;
		System.out.println(y);
		
		System.out.println("---------------");
		z = x++;
		System.out.println(z);
		System.out.println(x);
		
		System.out.println("---------------");
		z = ++x;
		System.out.println(z);
		System.out.println(x);
		
		System.out.println("---------------");
		z = ++x + y++;
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);

	}

}
