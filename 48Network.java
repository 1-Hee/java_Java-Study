package js47_Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(33267);
			//사용자 접속 대기
			System.out.println("사용자 접속 대기");
			Socket socket = server.accept();
			
			//스트림 추출
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(os);
			
			// 데이터 송수신
			dos.writeUTF("서버의 메시지 입니다");
			String recData = dis.readUTF();
			System.out.println(recData);
			
			// 접속 종료
			socket.close();
			
			//서버 종료
			server.close();
			
			
			
		}catch (Exception e) {}
		

	}

}
