package listex;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/*
	String <--- 검사	:	contains(),	indexOf
		   <--- 추출	:	substring(A,B)

	ArrayList (*)
 */
public class ArrayListTest {
	
	public static void main(String[] args) {
		ArrayList<Integer> listA = new ArrayList<Integer>();	//생성자
		listA.add(10);	//0번
		listA.add(20);	//1번
		listA.add(30);
		listA.add(40);
		listA.add(50);	//4번
		listA.add(60);	//5번
		System.out.println(listA);
		
		//listB는 listA에서 20,30,40을 꺼내온 다음 초기화 할거다!
		//List<Integer> ls = listA.subList(1,4);//내 소소
//		List<Integer> ls = listA.subList(listA.indexOf(20), listA.indexOf(40)+1);//강사님 소스
//		ArrayList<Integer> listB = new ArrayList<Integer>(ls);	//생성자
//		System.out.println(listB);
		
		//리스트가 많아서 요소가 있는지 없는지 명시적으로 보이지 않을 때....
		int searchA = Integer.parseInt(JOptionPane.showInputDialog("요소입력"));
		int searchB = Integer.parseInt(JOptionPane.showInputDialog("요소입력"));//searchA부터 searchB까지 찾을 범위 입력받기
		if (listA.contains(searchA) && listA.contains(searchB)){
			List<Integer> ls = listA.subList(listA.indexOf(20), listA.indexOf(40)+1);//강사님 소스
			System.out.println(ls);
			
			ArrayList<Integer> listB = new ArrayList<Integer>(ls);	//생성자
			System.out.println(listB);
		}else{
			System.out.println("찾으려는 요소가 없어요~");
		}
		
		
		
		
		
		
		
	}
}
