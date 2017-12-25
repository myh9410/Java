package listex;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/*
	ArrayList (*)
	
		"Ã¶¼ö" 10 20 30
		"Ã¶¹Î" 11 24 37
		"Ã¶È£" 12 25 38
		"Ã¶¿µ" 13 26 39
 */
//Å¬·¡½º ¸ðµ¨ : ¸ðµ¨!!
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
		//System.out.printf("%.1f\n",getTot()/3.0);	//Æò±Õ°ªÀÌ ³ª¿À´Â °á°ú°¡ ""¶§¹®¿¡ ¹®ÀÚ¿­·Î ³ª¿È!
		
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
		//Á¦³Ê¸¯Àº ÇÏ³ª¹Û¿¡ ¸ø¹Þ´Âµ¥... String Integer Integer Intger¸¦ ¹Þ¾Æ¾ßÇÔ...
		ArrayList<Score> list = new ArrayList<>();
		
		Score cs = new Score("Ã¶¼ö", 10, 20, 30);
		Score cm = new Score("Ã¶¹Î", 11, 24, 37);
		Score ch = new Score("Ã¶È£", 12, 25, 38);
		Score cy = new Score("Ã¶¿µ", 13, 26, 39);
		
		list.add(cs);
		list.add(cm);
		list.add(ch);
		list.add(cy);
		
		
		System.out.println(cs.toString());	//toString¶§¹®¿¡ ÁÖ¼Ò°ªÀÌ ³ª¿È..
		System.out.println(cm);
		System.out.println(ch);
		System.out.println(cy);
		System.out.println(list);
		
		
		
	}
}
