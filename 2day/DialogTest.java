package dialogex;

import javax.swing.JOptionPane;

/*
  	대화상자 부르기 -> 문자열로 입력받는다.
  		String sss = JOptionPane.showInputDialog();
  		
  	때에 따라서는 정수, 실수 등으로 파싱해서 가져와야 한다.
  	
  			int i = Integer.parseInt( sss );
  			double d = Double.parseDouble( sss );
  	
 */
public class DialogTest {
	
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("이름 입력");
		String age = JOptionPane.showInputDialog("나이 입력");
		String frAge = JOptionPane.showInputDialog("짝 나이 입력");
		
		int ageInt = Integer.parseInt(age);
		int frAgeInt = Integer.parseInt(frAge);
		int totAge = ageInt + frAgeInt;
		
		
		
		//출력
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("짝 나이 : "+frAge);
		System.out.println("합 : "+totAge);
		
	}
}
