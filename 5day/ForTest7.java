package forex;

import javax.swing.JOptionPane;

/*
	������ : 
	� ������ �ִ�.
	������ �ñ�� 
	ù°������ 1��	���糯���� 2��	..... 100�� �Ŀ��� 100�� �� ���ڰ� �ٴ´�.
	
	100���� �ð��� �� 10�� �Ŀ��� �󸶰� �ɱ�?
	money�� �ð��� ��	nDay�Ŀ��� ���ϱ�?
*/
public class ForTest7 {
	public static void main(String[] args) {
		int money = 100;
		int nDay = 10;
		int sum = money;
		int day=1;
		for (int i=0;i<11;i++){
			//sum=sum+ day++;		//���������� �Ϸ��� int day = 1���� ����..
			//sum=sum+ ++day;		//���������� �Ϸ��� int day = 0���� ����..
			sum += i;
			
		}
		
	}

}
