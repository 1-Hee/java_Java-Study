package js47_Network_Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		
		try {
			
			//소켓 객체 생성(서버접속)
			Socket socket = new Socket("127.0.0.1", 33267);
			
			// 스트림 추출
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(os);
			
			// 데이터 송수신
			String recData = dis.readUTF();
			dos.writeUTF("클라이언트가 보낸 메세지 입니다.");
			System.out.println(recData);

			//접속 종료
			socket.close();
			
			
			
		}catch(Exception e) {}
		
		

	}

}
