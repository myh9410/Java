package listex;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/*
	ArrayList (*)
	
		"ö��" 10 20 30
		"ö��" 11 24 37
		"öȣ" 12 25 38
		"ö��" 13 26 39
 */
//Ŭ���� �� : ��!!
class Score{
	String name;	int kor;	int eng;	int math;
	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	private int getTot(){
		return kor+eng+math;
	}
	private String getAvg(){
		//System.out.printf("%.1f\n",getTot()/3.0);	//��հ��� ������ ����� ""������ ���ڿ��� ����!
		
		return String.format("%.1f",getTot()/3.0);
		//return getTot()/3.0;
	}
	@Override
	public String toString() {
		return name+" "+kor+" "+eng+" "+math+" "+getTot()+" "+getAvg();
	}
}
public class ArrayListTest2 {
	
	public static void main(String[] args) {
		//ArrayList<String, Integer, Integer, Integer> list = new ArrayList<>();
		//���ʸ��� �ϳ��ۿ� ���޴µ�... String Integer Integer Intger�� �޾ƾ���...
		ArrayList<Score> list = new ArrayList<>();
		
		Score cs = new Score("ö��", 10, 20, 30);
		Score cm = new Score("ö��", 11, 24, 37);
		Score ch = new Score("öȣ", 12, 25, 38);
		Score cy = new Score("ö��", 13, 26, 39);
		
		list.add(cs);
		list.add(cm);
		list.add(ch);
		list.add(cy);
		
		
		System.out.println(cs.toString());	//toString������ �ּҰ��� ����..
		System.out.println(cm);
		System.out.println(ch);
		System.out.println(cy);
		System.out.println(list);
		
		
		
	}
}
