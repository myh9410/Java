package innerex;
class Calc{
	int num1;
	int num2;
	
	class ProgCalc{
		void calc(){
			System.out.println("���α׷��ӿ� ����");
		}
	}
	class MeCalc{
		void calc(){
			System.out.println("���п� ����");
		}
		
	}
	class ComCalc{
		void calc(){
			System.out.println("�Ϲݿ� ����");
		}
		
	}
}
public class CalcMain {

	public static void main(String[] args) {	//Ŭ������ �ν��Ͻ��� �־������ ���ο��ִ� ���뿡 ���� �� �� �ִµ�
												//�׷��� ���ؼ� new�� �� �ʿ�..
		//���α׷��ӿ�~~
		Calc calc = new Calc();
		//calc.new ProgCalc().calc();
		Calc.ProgCalc pCalc = calc.new ProgCalc();
		pCalc.calc();
		
		//���п�~~
		Calc.MeCalc mCalc = calc.new MeCalc();
		mCalc.calc();
		
		//�Ϲݿ�~~
		new Calc().new ComCalc().calc();
	}
}
		











