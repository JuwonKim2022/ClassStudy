package sec07.exam02;

import java.io.IOException;

public class ContinueKeyCodeEx {

	public static void main(String[] args) throws Exception {
		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		}

	}

}
