package whileex;
/*
	�ݺ��� (loop)	-	for		while		do while
	
	
	
	//������ ���� �� �����ϸ� ���ϴ�.
	for(��;��;����){}	//��𼭺��� ��� �ұ�?
						
		
	
	//���� �ݺ� ���� �� ���ϴ�!
	while(���ǽ�){}		//�ݺ��� �Ŵ�? ���Ŵ�?
	
	
 */
public class WhileTest {
	public static void main(String[] args) {
		int i=0;
		while(i<5){
			System.out.println(i+1+". ����");
			i++;
		}
		System.out.println("/////////////////////////////////////////");
		
		for (i=0;i<5;i++){
			System.out.println(i+1+". ����");
			
		i=0;	//������ ���� �ʱ�ȭ�� ����.
		while(i<5)
			System.out.println(++i+". ����");		
			
		}
	}

}
