package homwork04.advance.employee;

// 정규직 근로자
public class RegularWorker extends Employee{

	public RegularWorker(int eno, String name, int pay, int type) {
		super(eno, name, pay, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		double rtnMonthPay = super.pay / 12;
		
		return rtnMonthPay;
	}
	
	public void showEmployeeInfo() {
		
	}
	
	
}