package listex;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/*
	String <--- �˻�	:	contains(),	indexOf
		   <--- ����	:	substring(A,B)

	ArrayList (*)
 */
public class ArrayListTest {
	
	public static void main(String[] args) {
		ArrayList<Integer> listA = new ArrayList<Integer>();	//������
		listA.add(10);	//0��
		listA.add(20);	//1��
		listA.add(30);
		listA.add(40);
		listA.add(50);	//4��
		listA.add(60);	//5��
		System.out.println(listA);
		
		//listB�� listA���� 20,30,40�� ������ ���� �ʱ�ȭ �ҰŴ�!
		//List<Integer> ls = listA.subList(1,4);//�� �Ҽ�
//		List<Integer> ls = listA.subList(listA.indexOf(20), listA.indexOf(40)+1);//����� �ҽ�
//		ArrayList<Integer> listB = new ArrayList<Integer>(ls);	//������
//		System.out.println(listB);
		
		//����Ʈ�� ���Ƽ� ��Ұ� �ִ��� ������ ��������� ������ ���� ��....
		int searchA = Integer.parseInt(JOptionPane.showInputDialog("����Է�"));
		int searchB = Integer.parseInt(JOptionPane.showInputDialog("����Է�"));//searchA���� searchB���� ã�� ���� �Է¹ޱ�
		if (listA.contains(searchA) && listA.contains(searchB)){
			List<Integer> ls = listA.subList(listA.indexOf(20), listA.indexOf(40)+1);//����� �ҽ�
			System.out.println(ls);
			
			ArrayList<Integer> listB = new ArrayList<Integer>(ls);	//������
			System.out.println(listB);
		}else{
			System.out.println("ã������ ��Ұ� �����~");
		}
		
		
		
		
		
		
		
	}
}
