package sec07.exam02;

public class QStopEx {

	public static void main(String[] args) throws Exception {
		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {
				break; //while종료
			}
		}
		System.out.println("종료");

	}

}
