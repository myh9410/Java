package stringex;

import javax.swing.JOptionPane;

/*
	String
		
		주소록에서 우편번호를 검색하는 프로그램이다.
 */
public class StringTest7문용호 {
	
	public static void main(String[] args) {
		String dbAddress = "";
		dbAddress +="64321 서울시 서초구 서초1동,";
		dbAddress +="64322 서울시 서초구 서초2동,";
		dbAddress +="64323 서울시 서초구 서초3동,";
		dbAddress +="64324 서울시 서초구 서초4동,";
		dbAddress +="64325 서울시 서초구 서초5동,";
		dbAddress +="64326 서울시 서초구 서초6동,";
		dbAddress +="64327 서울시 서초구 서초7동,";
		dbAddress +="64328 서울시 서초구 서초8동,";
		//",로 스플릿해라."
		//"스플릿한 것 중에 찾은 동이 있는지 확인."
		String dong = JOptionPane.showInputDialog("동을 입력하세요 ex)서초4동");
		String zipCode = "";
		
		
		
		
		
		
		
		
		System.out.println(dong+"의 우편번호는 ["+zipCode+"]입니다.");
		
	}
	
}
