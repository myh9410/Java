package extendsex;

class Emp{
	String name;
	String address;
	public Emp(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	void printEmpInfo(){
		System.out.println("�̸� : "+name);
		System.out.println("�ּ� : "+address);			
	}
	
	
}

class Regular extends Emp{
	int month;		//�ٹ� ���� ��
	int salary;		//�޿�
	public Regular(String name, String address, int month, int salary) {
		super(name, address);
		this.month = month;
		this.salary = salary;
	}
	private int getSalaryMonthly(){
		return month*salary;
	}
	public void printReg(){
		//System.out.println("�̸� : "+name);
		//System.out.println("�ּ� : "+address);		//�̸� �ּ� �θ����׼� ��¹ޱ�
		super.printEmpInfo();  		//super.���� �θ� �ִ� ������ �ҷ���.
									//super.�� this.ó�� ���� ����
									//�޼��尡 ��ġ�� this.�̳� super.���� ������ �ҷ����� ��Ȯ�� ����.
		System.out.println("�޿�("+month+"����) : "+ +getSalaryMonthly()+"��");
	}
}

class PartTime extends Emp{
	int hour;
	int hourMoney;		//�� �ϵ��� �� �ð�?? ������
	public PartTime(String name, String address, int hour, int hourMoney) {
		super(name, address);
		this.hour = hour;
		this.hourMoney = hourMoney;
	}
	private int getSalaryEmp(){
		return hour*hourMoney;
	}
	public void printEmpMoney(){
		//System.out.println("�̸� : "+name);
		//System.out.println("�ּ� : "+address);			//�̸� �ּ� �θ����׼� ��¹ޱ�
		super.printEmpInfo();
		System.out.println("�޿�("+hour+"�ð�) :" + getSalaryEmp()+"��");
	}
}
public class EmpMain {
	
	public static void main(String[] args) {
		Regular hgd = new Regular("ȫ�浿", "����� ������ ���ﵿ", 12, 1000000);
		hgd.printReg();
		PartTime kkc = new PartTime("������", "��⵵ �Ⱦ��", 6, 6500);
		kkc.printEmpMoney();
	}

}
