package staticex;

import javax.swing.JOptionPane;

class GradeA{
	//A��
	String bName;
	int	bBunho;
	String bStname;	//alt shift s, o	-> constructor����
	
	public GradeA(String bName, int bBunho, String bStname) {
		//super();
		this.bName = bName;
		this.bBunho = bBunho;
		this.bStname = bStname;
	}
}

class GradeB{
	static String bName;	//�ν��Ͻ� ���� �̸� ����� ����!
	int	bBunho;
	String bStname;
	public GradeB(int bBunho, String bStname) {
		//super();
		this.bBunho = bBunho;
		this.bStname = bStname;
	}
	
	void printName(){ //GradeB hak1=new������(��); hak1.�̸�();
		System.out.println("�Ϲ� �ν��Ͻ� : "+bStname);
	}
	//GradeB.printBanName();
	static void printBanName(){
		System.out.println("static�޼��� : "+bName);
	}
	//�������� �μ� ����!
}

public class StaticClassName {
	
	public static void main(String[] args) {
		//System.out.println("�� �̸� : " + gradeA.������???????);
		GradeA bun1 = new GradeA("A��", 1, "ȫ�浿");
		GradeA bun2 = new GradeA("A��", 2, "�̼���");
		GradeA bun3 = new GradeA("A��", 3, "������");
		
		System.out.println("�� �̸� "+GradeB.bName);
		GradeB b1 = new GradeB(1, " ȫ�浿B");
		GradeB b2 = new GradeB(2, " �̼���B");
		GradeB b3 = new GradeB(3, " ������B");
		
		
		/*JOptionPane pane = new JOptionPane();
		pane.showInputDialog("");
		---------------------------------------- ������ �Ʒ��� �ξ� ���ϴ� �� : �Ϲ� �ν��Ͻ�, �Ʒ� : static
		static ���� : �ӵ����鿡�� �ſ� ������. 		���� : ���̴�... �׻� ������ �־�� �ϹǷ�(�޸𸮰� ���� �ҿ�)
		JOptionPane.showInputDialog("");*/
	}
}
