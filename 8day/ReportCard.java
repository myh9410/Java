package modifierex;

public class ReportCard {
	private int bun;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public void setBun(int bun){
		this.bun = bun;	//this : �� �޼��带 �θ� ��ü��
						//					(�ؽ��ڵ�)	
		//�Ű������� �ν��Ͻ� ������ ��ĥ��,
		//this.�� �ٿ���
		
	}
	public void setName(String name){
		this.name = name;
	}
	public void setKor(int kor){
		//������ 0���� 100�����Ͻÿ��� ���� ������ ���ش�.
		if (0<= kor && kor <=100)
			this.kor = kor;
		else
			System.out.println("���� ���� �̻�!");
		//�ٽ� �Է½�ų ���� �ִ�!!!
	}
	public void setEng(int eng) {
		if (0<= eng && eng <=100)
			this.eng = eng;
		else
			System.out.println("���� ���� �̻�!");
	}
	public void setMath(int math) {
		if (0<= math && math <=100)
			this.math = math;
		else
			System.out.println("���� ���� �̻�!");
	}
	//alt + shift + s, r������ Generate Getters and Setters����.
	//Select Setters������ ������ �ʾҴ� ������ setter
	//setMath�� setEng�� �������.

	//���� �޼��� = �����Ͻ� �޼���(���Ǹ� ����)
	public void setScore(int b, String na, int k, int e, int m){
				//()���� ������ �Ű�����(�Ķ����) ��� �Ѵ�
				//class�� hak.setScore�� �������ִ� ���κ�����
		bun = b; name = na; kor = k; eng = e; math = m;

	}
	//��ü.������ �������ִ� �޼���()
	public int getTotal(){
		return kor + eng + math;
	}
	
	
	
	
}
