package mathex;
/*
	(int)(Math.random()*�Ѱ���+���۰�)
 */	
public class MathTest2 {
	
	public static void main(String[] args) {
		String [] lucky = {
			"�̼����� ���� ����Ʈ�� �־��~",	
			"���� ���� �ݳ׿�~",	
			"�������� �����ϼ���",	
			"������ ������ ���׿�",	
			"���ִ� ����Ļ簡 ��ٸ��ϴ�.",	
			"���� ģ���� �쿬�� �����ϴ�.",	
			"���� �� �ζǸ� �缼�� ���̿�!~!�ڵ�����",	
			"������ �� �𸨴ϴ�.",	
		};
		int ran = (int)(Math.random()*lucky.length+0);
		
		System.out.println(lucky[ran]);
	}
}
