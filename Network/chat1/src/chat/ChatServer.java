package chat;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer{

	private ArrayList<ChatThread> chatThreadList = new ArrayList<ChatThread>();
	private int port = 4101;

	public void service() {//��Ʈ �����ϰ�, client�� �Է��� ��ٸ�
		
		try (ServerSocket ss = new ServerSocket(port);) {

			System.out.println("ChatServer �� �غ�Ǿ����ϴ�. ���� ��Ʈ�� " + port + " �Դϴ�.");

			while (true) {

				// �ڵ带 �Բ� �ۼ��� ���ô�.
				Socket s = ss.accept();
				System.out.println("ChatClient �� �����߽��ϴ�.");
				
				ChatThread t = new ChatThread(s);
				chatThreadList.add(t);
				t.start();
				//
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void broadcast( String message ) {//client�鿡�� ��������ϴ� �޽����� �ϰ������� ��ü�� ���� list�� chatthread�鿡�� ����
		// �ڵ带 �Բ� �ۼ��� ���ô�.
		for (ChatThread t : chatThreadList) {
			try {
				t.sendMessage(message);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//
	}

	public static void main(String[] args) 	{
		new ChatServer().service();
	}

	class ChatThread extends Thread {

		private Socket socket;
		private ObjectInputStream ois; // �޽��� �Է¹���
		private ObjectOutputStream oos;
		private boolean isExit = false;
		
		public ChatThread(Socket socket) throws Exception {
			this.socket = socket;
			this.ois = new ObjectInputStream(socket.getInputStream());
			this.oos = new ObjectOutputStream(socket.getOutputStream());
		}

		public void run() {
			try {
				while ( ! isExit ) {
					
					// �ڵ带 �Բ� �ۼ��� ���ô�.
					String msg = (String) ois.readObject();
					
					if ("^".equals(msg)) {
						chatThreadList.remove(this);
						isExit = true;
					} else {
						broadcast(msg);
					}
					//
				}
			} catch (Exception e) {
				e.printStackTrace();
				chatThreadList.remove(this);
			}
		}

		public void sendMessage(String message) throws Exception {
			// �ڵ带 �Բ� �ۼ��� ���ô�.
			oos.writeObject(message);
			//
		}
	}
}
