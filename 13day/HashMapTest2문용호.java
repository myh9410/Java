package hashMapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JOptionPane;

/*
	Map ����
			A - B : ����Ǿ� �ִ�.
			
		
		put(A,B)	A : key		B : Value
	
 */
public class HashMapTest2����ȣ {
	
	public static void main(String[] args) {
		//String id String pw 
		HashMap<String, String> mapLogin = new HashMap<>();
		//���� ���� database���� n���� ȸ���� �ִ�.
		//�� �� �Ѹ��� �α����� �õ��ϰ� �ִ� ��Ȳ�̴�.
		
		//�׷���, db�� ���� ȸ�����Խ� �Է��ߴ� ������ �߿���
		//ȸ��,id�� pw�� �����ٰ� mapLogin�� �ִ´�.
		
		mapLogin.put("dog", "dog1234");
		mapLogin.put("cat", "cat1234");
		mapLogin.put("pig", "pig1234");
		mapLogin.put("cow", "cow1234");
		mapLogin.put("fox", "fox1234");
		mapLogin.put("egg", "egg1234");
		mapLogin.put("ant", "ant1234");
		
		//���� �α����� �Ϸ��� ȸ���� ������ �޴´�!
		String userid = JOptionPane.showInputDialog("���̵� �Է�");
		String userpw = JOptionPane.showInputDialog("��� �Է�");
		
		
		//#		key�� �ش��ϴ� �� userid�ϰ� �´°� �ִ�?
		//		--> key�� ���(set)����!	.contains(userid)
		//		false�� �ش�id ����...		true��	id�� �ش��ϴ� value�����ͼ� userpw�ϰ� �����ϸ� �ȴ�.
		//		true�� �Ǹ� �α��� �߽��ϴ�.	false�� �Ǹ� ����� Ʋ����.
		
		
		
		
		
	}

}
