package dateex;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
	��¥�� �ð��� ���õ� �ΰ��� Ŭ����
	
			DateŬ����		 				CalendarŬ����
			  ������							�Ź���
		   �����ϰ� ���			�ð��� ��¥ �׸��� ���� �ڼ��ϴ�.
		   			<----------------------------
		   			---------------------------->
		   ��¥ ������ ��ƴ�.
(deprecated : �ݴ�,������� ����.)			���� Calendar�� ����� ��
											static �޼���� �����.(�ϳ��� ����� ����.)
												- �̱��� ����
			
			
			
			
 */
public class DateTest {
	
	public static void main(String[] args) {
		Date d = new Date();	//�����ϰ� ���
		System.out.println(d);
		//��¥ ������ �������� ����.. ���Ŀ� d�� ���Խ��Ѽ� ����� �Ŵ�!
		//���� ����!!
		//y : year	M : Month d : day	h : hour m : min s : sec
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy�� MM�� dd��");
		
		//�ð��� �������� : format(�ð�)
		String today = sdf.format(d);
		//String today = sdf2.format(d);
		//String today = sdf3.format(d);
		System.out.println(today);
	}
}
