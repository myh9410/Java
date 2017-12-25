package hashMapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JOptionPane;

/*
	Map 구조
			A - B : 연결되어 있다.
			
		
		put(A,B)	A : key		B : Value
	
 */
public class HashMapTest2문용호 {
	
	public static void main(String[] args) {
		//String id String pw 
		HashMap<String, String> mapLogin = new HashMap<>();
		//지금 현재 database에는 n명의 회원이 있다.
		//그 중 한명이 로그인을 시도하고 있는 상황이다.
		
		//그래서, db에 가서 회원가입시 입력했던 정보들 중에서
		//회원,id와 pw를 가져다가 mapLogin에 넣는다.
		
		mapLogin.put("dog", "dog1234");
		mapLogin.put("cat", "cat1234");
		mapLogin.put("pig", "pig1234");
		mapLogin.put("cow", "cow1234");
		mapLogin.put("fox", "fox1234");
		mapLogin.put("egg", "egg1234");
		mapLogin.put("ant", "ant1234");
		
		//현재 로그인을 하려는 회원의 정보를 받는다!
		String userid = JOptionPane.showInputDialog("아이디 입력");
		String userpw = JOptionPane.showInputDialog("비번 입력");
		
		
		//#		key에 해당하는 게 userid하고 맞는게 있니?
		//		--> key를 모아(set)오자!	.contains(userid)
		//		false면 해당id 없음...		true면	id에 해당하는 value꺼내와서 userpw하고 대조하면 된다.
		//		true가 되면 로그인 했습니다.	false가 되면 비번이 틀려요.
		
		
		
		
		
	}

}
