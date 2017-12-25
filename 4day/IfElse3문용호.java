package ifelseex;

import javax.swing.JOptionPane;

/*	
  */
public class IfElse3문용호 {

	public static void main(String[] args) {
		String menu = "1.짜장면 2.짬뽕 3.닭도리탕 4.부대찌개";
		int bunho = Integer.parseInt(JOptionPane.showInputDialog(menu));
		//만약 bunho 1~4이 안들어왔다면 -> "안녕히 가세요"
		//					 들어왔다면 -> 어떤 메뉴인지 판단하자! 다중 if ~ else로!!
		if (!(1 <= bunho && bunho <= 4)){
			System.out.println("안녕히 가세요.");
		}else if(bunho == 1){
			//System.out.println("1.짜장면.... 추가주문 1.곱배기   2.쟁반   3.간짜장");
			//세부메뉴 물어보기
			//대화상자에서 계속 물어보기
			String jjaMenu = "1.짜장면.... \n추가주문 1.곱배기   2.쟁반   3.간짜장";
			int bunho2 = Integer.parseInt(JOptionPane.showInputDialog(jjaMenu));// bunho2는 지역변수 변수 설정한 블럭 내에서만 사용가능.
			
			String msg = "";
			if(bunho2 == 1){
				msg = "곱배기 주문은 1000원이 추가됩니다.";
			}else if(bunho2 == 2){
				msg = "쟁반 자장은 2인분 이상만 주문이 됩니다.";
			}else if(bunho2 == 3){
				msg = "곱배기 주문은 1000원이 추가됩니다.";
			}
			System.out.println(msg);
			
		}else if(bunho == 2){
			System.out.println("2.짬뽕.... 추가주문 1.곱배기   2.볶음");
		}else if(bunho == 3){
			System.out.println("3.닭도리탕(5000원/인).... 추가주문 1.몇인분?");
		}else if(bunho == 4){
			System.out.println("4.부대찌개(6000원/인).... 추가주문 1.햄사리(2000원)	 2.라면사리(1000원)	  3.간짜장");
		}
		
	}//end main
}//end class
