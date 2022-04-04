package js47_Network_Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		
		try {
			
			//���� ��ü ����(��������)
			Socket socket = new Socket("127.0.0.1", 33267);
			
			// ��Ʈ�� ����
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(os);
			
			// ������ �ۼ���
			String recData = dis.readUTF();
			dos.writeUTF("Ŭ���̾�Ʈ�� ���� �޼��� �Դϴ�.");
			System.out.println(recData);

			//���� ����
			socket.close();
			
			
			
		}catch(Exception e) {}
		
		

	}

}
