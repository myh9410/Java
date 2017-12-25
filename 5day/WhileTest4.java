package whileex;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
	do{
	
	}while(조건식);				//do~while문에서 끝은 ;로 마감시켜야 한다.
					//최소 한번은 실행한다.
	
	if(조건);{} 라고 쳐버리면
	
		if(조건)
			;
		{
	
				로 해석되어서 아무 실행도 안함... 주의
		} 
	
	
	
	
 */
public class WhileTest4 {
	public static void main(String[] args) {
		int i = 0;
		
		for(i=0; i>0; i++){
			System.out.println("이 문장은 보이지 않습니다.");
		}
		System.out.println("////////////////////////////////////////////");
		
		while(i>0){
			System.out.println("이 문장도 보이지 않습니다.");
		}
		System.out.println("////////////////////////////////////////////");
		
		do{
			System.out.println("do while은 처음부터 거짓이어도 최소 한번은 실행됩니다.");
		}while(i>0);//거짓조건!
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
