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
			//����� ���� ���
			System.out.println("����� ���� ���");
			Socket socket = server.accept();
			
			//��Ʈ�� ����
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(os);
			
			// ������ �ۼ���
			dos.writeUTF("������ �޽��� �Դϴ�");
			String recData = dis.readUTF();
			System.out.println(recData);
			
			// ���� ����
			socket.close();
			
			//���� ����
			server.close();
			
			
			
		}catch (Exception e) {}
		

	}

}
