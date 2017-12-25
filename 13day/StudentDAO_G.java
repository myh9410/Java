package daoex;
/*
 �(control) : �� ���ۿ� ����
 		�޼������ ���ռ�
 	������ ����� ArrayList�� ����� ����
 	������� �䱸(����/����/����/���)��
 	���������� �ش� �޼��带 ȣ���� ���ֵ���
 	������ ����!
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import javax.swing.JOptionPane;

import modelex.StudentDTO;

public class StudentDAO {
	private ArrayList<StudentDTO> list = 
			new ArrayList<>();

	public StudentDAO() {
		StudentDTO s1 = new StudentDTO("��ö��", 10, 11, 13);
		StudentDTO s2 = new StudentDTO("��ö��", 10, 15, 19);
		StudentDTO s3 = new StudentDTO("��μ�", 11, 16, 17);
		StudentDTO s4 = new StudentDTO("�����", 12, 17, 14);
		StudentDTO s5 = new StudentDTO("��α�", 13, 18, 13);
		StudentDTO s6 = new StudentDTO("���ȣ", 14, 19, 12);
		StudentDTO s7 = new StudentDTO("��ö��", 99, 99, 99);
		StudentDTO s8 = new StudentDTO("��ö��", 30, 30, 30);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8);
	}
	
	
	public void print(){
		System.out.println("\t=========�л� ���� ���=========");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		if(list.size()==0){
			System.out.println("\n------------------------------------------");
			System.out.println("  �� ����� �л� ������ �����");
			System.out.println("------------------------------------------\n");
		}else{
			for(StudentDTO tmp : list){
				System.out.println(tmp);
			}
		}
	}
	public void insert(){
		System.out.println("\t=========�л� ���� �Է�=========");
		String name=JOptionPane.showInputDialog("�̸� �Է�");
		int kor= Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		int eng= Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		int math= Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		
		//list.add(name, kor, eng, math);
		
		
		list.add( new StudentDTO(name, kor, eng, math)  );

	}
	public void update(){
		System.out.println("\t=========�л� ���� ���� ��=========");
		print();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("������ �л� �̸� �Է� : ");
			String schName = sc.nextLine();
	
			
			ArrayList<String> listName = new ArrayList<String>();
			for(StudentDTO dto : list){
				listName.add(dto.getName());
			}
			if(listName.contains(schName)){
				//����, ����, ���������� �����ϵ��� ����
				for(StudentDTO dto : list){
					if(dto.getName().equals(schName)){
						System.out.println("\n--------------------------------");
						System.out.println(dto);
						System.out.println("--------------------------------\n");
						
						
						System.out.print("�л� ������ �½��ϱ�?  1.��  2.��Ӱ˻�  3. ��� >>> ");
						int sBun = sc.nextInt();
						
						
						//���������� �����Ҷ�  ������ ����������.   ������ ���������� �ݺ��ϴٰ� �����ؼ� ������!
						if(sBun == 1){
							System.out.print(" � ���� ����? 1. ���� 2.���� 3.���� 4.��� >>> ");
							int item=sc.nextInt();
							if(item==1){ 
								System.out.print(dto.getKor()+"���ε� ������ ������ �Է��ϼ��� : ");
								int score = sc.nextInt();
								dto.setKor(score);
							}else if(item==2){ 
								System.out.print(dto.getEng()+"���ε� ������ ������ �Է��ϼ��� : ");
								int score = sc.nextInt();
								dto.setEng(score);
							}else if(item==3){ 
								System.out.print(dto.getMath()+"���ε� ������ ������ �Է��ϼ��� : ");
								int score = sc.nextInt();
								dto.setMath(score);
							} //������ �׸� �Է� �Ϸ�!!!
							
							//print();
							System.out.println("\n-------------���� ����---------------");
							System.out.println(dto);
							System.out.println("--------------------------------\n");
							break;
							
						}else if(sBun == 2){
							// �� ���� �ݺ��� ��� �����ؾ��Ѵ�.
							continue;
						
						}else if(sBun == 3){
							//�׳� ����������.
							break;
						}
					}
				}

				break;
			}else{
				System.out.println("����!");
				//��� �˻����� ������ �����!
			}
		}
		//System.out.println("\t=========�л� ���� ���� ����=========");
	}
	public void delete(){
		System.out.println("\t=========�л� ���� ����=========");
		

	}
}
