package homwork04.advance.employee;

public abstract class Employee {
	// 사번
	public int eno;
	// 이름
	public String name;
	// 급여
	public int pay;
	// 근무형태(1: 정규직, 2: 계약직, 3: 임시직)
	public int type;
	
	public Employee(int eno, String name, int pay, int type) {
		this.eno = eno;
		this.name = name;
		this.pay = pay;
		this.type = type;
	}
	
	public abstract double getMonthPay();

	public void showEmployeeInfo() {};

	
	
}