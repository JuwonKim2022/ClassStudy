package client;

import java.io.DataOutputStream;
import java.net.Socket;

public class ClientSocket {

	public static void main(String[] args) {
		
		try {
			Socket s = new Socket("localhost", 9999);
			
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.flush();
			dout.close();
			s.close();
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
