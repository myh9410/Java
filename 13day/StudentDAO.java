package daoex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import javax.swing.JOptionPane;

import modelex.StudentDTO;
import studentMain.StudnetMain;

/*
 	�(control) : �� ���ۿ� ���� �޼������ ���ռ�
 	������ ����� ArrayList�� ����� ����
 	������� �䱸(����/����/����/����)�� ���� ������
 	�ش� �޼��带 ȣ���� �� �ֵ��� ������ ����!
 */
public class StudentDAO {
	private ArrayList<StudentDTO> list = new ArrayList<>();

	public StudentDAO() {
		StudentDTO s1 = new StudentDTO("��ö��", 10, 20, 30);
		StudentDTO s2 = new StudentDTO("��ö��", 10, 23, 34);
		StudentDTO s3 = new StudentDTO("��μ�", 11, 24, 36);
		StudentDTO s4 = new StudentDTO("��ȣ��", 12, 25, 38);
		StudentDTO s5 = new StudentDTO("���ȣ", 13, 26, 32);
		StudentDTO s6 = new StudentDTO("���ö", 14, 27, 32);
		StudentDTO s7 = new StudentDTO("��ö��", 80, 80, 81);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);

	}

	public void print() { // �л����� ����ϴ�
		System.out.println("\t=========�л� ���� ���=========");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		if (list.size() == 0) {
			System.out.println("\n-------------------------------------------------");
			System.out.println("�� ����� �л� ������ �����");
			System.out.println("-------------------------------------------------\n");
		} else {
			for (StudentDTO tmp : list) {
				System.out.println(tmp); // tmp�� ���� .toString������ �ؽ��ڵ常 ����
											// - DTO���� .toString ������
			}
		}
	}

	public void insert() {
		System.out.println("\t=========�л� ���� �Է�=========");
		String name = JOptionPane.showInputDialog("�̸� �Է�");
		int kor = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		int eng = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		int math = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		/*
		 * list.add(name, kor, eng, math); ->�Ұ��� �� ����: ���׸��� �ϳ��ۿ� ����. StringŸ�԰�
		 * intŸ���� ���� �ִ�.
		 */
		list.add(new StudentDTO(name, kor, eng, math));
		// �Է¹��� ������ �л� ������ �־��ְ� ����ϸ� �����ؼ� ��µ�.
	}

	public void delete() {
		System.out.println("\t=========�л� ���� ����=========");

	}

	public void update() {
		System.out.println("\t=========�л� ���� ���� ��=========");
		// 1.���� - �л� ������ �ѹ� �����ְ�...
		print();
		Scanner sc = new Scanner(System.in);
		while (true) {
		// 2.������ ������ ����..�̸��� ���ؼ� - � �л��� ������ �������� ���ϰ� ��.
			System.out.println("������ �л� �̸� �Է� : ");
			String schName = sc.nextLine(); // schName : ��ġ ����.
		// 3.�л� �ִ��� ������ Ȯ���ϰ� - �л� �̸� ��ġ�� ��쵵 �����ϱ� �´� �л����� �ٸ� �л�����..
			// for (int i=0;i<list.size();i++)
			// list.get(i).getName().contains(schName);
			/////////////////////////////////////////////////////////////////
			/*
			 * for (StudentDTO tmp : list){ tmp.getName().contains(schName); }
			 */
			/////////////////////////////////////////////////////////////////
			/*
			 * HashSet<String> setName = new HashSet<>(); for (StudentDTO tmp :
			 * list){ setName.add(tmp.getName()); }
			 */
			/////////////////////////////////////////////////////////////////
			ArrayList<String> listName = new ArrayList<String>();
			for (StudentDTO dto : list) {//listname���� �л� �̸� ���� Ȯ��
				listName.add(dto.getName());
			}
			if (listName.contains(schName)) {
				System.out.println("�̸� ����");
				// 4.�л� ������ � ���� ��������. .������
				for(StudentDTO dto : list){
					if(dto.getName().equals(schName)){
						System.out.println("\n---------------------------------------");
						System.out.println(dto);	//�л����� ���
						System.out.println("\n---------------------------------------");
						//listName���� ������ �л� ������ �³�?1.�� 2.�ƴϿ� - ��Ӱ˻� 3.���
						System.out.println("�л� ������ �½��ϱ�?1.�� 2.�ƴϿ� - ��Ӱ˻� 3.��� >>> ");
						int sBun = sc.nextInt();	//1,2,3 �ޱ����� ��ȣ
						
						
						//���� ������ ������ �� ������ ������ ����... ������ ���� ������ �ݺ��ϴٰ� �����ؼ� ������!
						if (sBun == 1){	//�л����� 1.��
							//� ���� ����? 1.�� 2.�� 3.�� 4.���
							System.out.print("� ���� ����? 1.�� 2.�� 3.�� 4.��� >>>");
							int item = sc.nextInt();
							if (item==1){//���� ����
								System.out.println(dto.getKor()+"��... ������ ������ �Է��ϼ��� : ");
								int score = sc.nextInt();
								dto.setKor(score);
								//���� �����ϸ� ���θ޴��� ������...									����
							}else if (item==2){//���� ����
								System.out.println(dto.getEng()+"��... ������ ������ �Է��ϼ��� : ");
								int score = sc.nextInt();
								dto.setEng(score);
							}else if (item==3){//���� ����
								System.out.println(dto.getMath()+"��... ������ ������ �Է��ϼ��� : ");
								int score = sc.nextInt();
								dto.setMath(score);
							}//������ �׸� �Է� �Ϸ�!! end
							//print
							System.out.println("\n-----------------���� ����----------------");
							System.out.println(dto);	//�л����� ���
							System.out.println("\n---------------------------------------");
							
							
						}else if (sBun == 2){//�л����� 2.�ƴϿ� - ��Ӱ˻�
							//�� ���� �ݺ��� ��� ����
							continue;
						}else if (sBun == 3){//�л����� 3.���
							//���� ������.
							break;
						}
					}
				}
				
				//1. ��
				//2.��� �˻� �ٽ� for������ ��� �˻�
				//3. break;�� ������.
				break;
			} else {
				System.out.println("�̸� ����");
				//��� �˻����� ������ �����!
			}
		}
		// 5.�����ϵ��� �ϰ�, �����ϰ��� �л� ���� ��� �����ְ�... �ٽ� ���� �޴���
		System.out.println("\t=========�л� ���� ���� ����=========");
	}
}
