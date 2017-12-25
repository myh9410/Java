package innerex;
class Calc{
	int num1;
	int num2;
	
	class ProgCalc{
		void calc(){
			System.out.println("프로그래머용 계산기");
		}
	}
	class MeCalc{
		void calc(){
			System.out.println("공학용 계산기");
		}
		
	}
	class ComCalc{
		void calc(){
			System.out.println("일반용 계산기");
		}
		
	}
}
public class CalcMain {

	public static void main(String[] args) {	//클래스는 인스턴스가 있어야지만 내부에있는 내용에 접근 할 수 있는데
												//그러기 위해선 new가 꼭 필요..
		//프로그래머용~~
		Calc calc = new Calc();
		//calc.new ProgCalc().calc();
		Calc.ProgCalc pCalc = calc.new ProgCalc();
		pCalc.calc();
		
		//공학용~~
		Calc.MeCalc mCalc = calc.new MeCalc();
		mCalc.calc();
		
		//일반용~~
		new Calc().new ComCalc().calc();
	}
}
		











