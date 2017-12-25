package interfaceex;
/*
	인터페이스
	하나의 카테고리(상징)을 만들어 놓는다!
		- 그 상징을 클래스에 붙이면 항상 똑같은 메서드를 
			재정의해서 사용할 수 있게 된다.
		
		- 표준화 시킬 수 있다.
 */
interface ReportMakeable{					//인터페이스는 able이라는 접미사를 많이 쓴다.
	void historyResearch();
	void practice();
	void principle();
}
class History implements ReportMakeable{

	@Override
	public void historyResearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void practice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void principle() {
		// TODO Auto-generated method stub
		
	}
	
}
class Art implements ReportMakeable{

	@Override
	public void historyResearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void practice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void principle() {
		// TODO Auto-generated method stub
		
	}
	
}
class Mechanic implements ReportMakeable{

	@Override
	public void historyResearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void practice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void principle() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceTest {

}
