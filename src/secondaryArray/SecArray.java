package secondaryArray;

public class SecArray {

	public static void main(String[] args) {
		
		int arr[][] = new int[3][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = j;
			}
		}
			
		System.out.println();
	}

}
