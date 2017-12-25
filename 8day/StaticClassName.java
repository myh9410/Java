package staticex;

import javax.swing.JOptionPane;

class GradeA{
	//A반
	String bName;
	int	bBunho;
	String bStname;	//alt shift s, o	-> constructor만듬
	
	public GradeA(String bName, int bBunho, String bStname) {
		//super();
		this.bName = bName;
		this.bBunho = bBunho;
		this.bStname = bStname;
	}
}

class GradeB{
	static String bName;	//인스턴스 전에 미리 만들어 놓자!
	int	bBunho;
	String bStname;
	public GradeB(int bBunho, String bStname) {
		//super();
		this.bBunho = bBunho;
		this.bStname = bStname;
	}
	
	void printName(){ //GradeB hak1=new생성자(데); hak1.이름();
		System.out.println("일반 인스턴스 : "+bStname);
	}
	//GradeB.printBanName();
	static void printBanName(){
		System.out.println("static메서드 : "+bName);
	}
	//생성자의 인수 갯수!
}

public class StaticClassName {
	
	public static void main(String[] args) {
		//System.out.println("반 이름 : " + gradeA.반정보???????);
		GradeA bun1 = new GradeA("A반", 1, "홍길동");
		GradeA bun2 = new GradeA("A반", 2, "이순신");
		GradeA bun3 = new GradeA("A반", 3, "김유신");
		
		System.out.println("반 이름 "+GradeB.bName);
		GradeB b1 = new GradeB(1, " 홍길동B");
		GradeB b2 = new GradeB(2, " 이순신B");
		GradeB b3 = new GradeB(3, " 김유신B");
		
		
		/*JOptionPane pane = new JOptionPane();
		pane.showInputDialog("");
		---------------------------------------- 위보다 아래가 훨씬 편리하다 위 : 일반 인스턴스, 아래 : static
		static 장점 : 속도측면에서 매우 빠르다. 		단점 : 무겁다... 항상 가지고 있어야 하므로(메모리가 많이 소요)
		JOptionPane.showInputDialog("");*/
	}
}
