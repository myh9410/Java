package mathex;
/*
	Math.random() : ������(����)
		���� �߻� �޼���	:	rand() 0~32767�߿��� �ϳ� ����´�! (C���)
 								0.0 ~ 1.0							(JAVA)
//Math.			abs(absolute) - ���񰪱��ϱ�
 
 
 		(int)(Math.random()*�Ѱ���+���۰�)
 */	
public class MathTest {
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println((int)(Math.random()*10+0));	//0~9���� 10��
		}
		System.out.println(Math.random()*100+0);	//0~99���� 100��
	}
}
