package chap20_enum.enums;

public enum MethodMonth {
	// 1. enum에 값지정
	// 상수명(지정할 값)
	// 첫 번째 지정된 값의 타입과 동일한 타입의 값을 계속해서 지정해야 한다.
	JAN(1) {
		@Override
		public void printHangulMonth() {
			// TODO Auto-generated method stub
			System.out.println("1월입니다.");
		}
	},
	FEB(2) {
		@Override
		public void printHangulMonth() {
			// TODO Auto-generated method stub
			System.out.println("2월입니다.");
		}
	},
	MAR(3) {
		@Override
		public void printHangulMonth() {
			// TODO Auto-generated method stub
			System.out.println("3월입니다.");
		}
	},
	APR(4) {
		@Override
		public void printHangulMonth() {
			// TODO Auto-generated method stub
			System.out.println("4월입니다.");
		}
	},
	MAY(5) {
		@Override
		public void printHangulMonth() {
			// TODO Auto-generated method stub
			System.out.println("5월입니다.");
		}
	},
	JUN(6) {
		@Override
		public void printHangulMonth() {
			// TODO Auto-generated method stub
			System.out.println("6월입니다.");
		}
	},
	JUL(7) {
		@Override
		public void printHangulMonth() {
			// TODO Auto-generated method stub
			System.out.println("7월입니다.");
		}
	},
	AUG(8) {
		@Override
		public void printHangulMonth() {
			// TODO Auto-generated method stub
			System.out.println("8월입니다.");
		}
	},
	SEP(9) {
		@Override
		public void printHangulMonth() {
			// TODO Auto-generated method stub
			System.out.println("9월입니다.");
		}
	},
	OCT(10) {
		@Override
		public void printHangulMonth() {
			// TODO Auto-generated method stub
			System.out.println("10월입니다.");
		}
	},
	NOV(11) {
		@Override
		public void printHangulMonth() {
			// TODO Auto-generated method stub
			System.out.println("11월입니다.");
		}
	},
	DEC(12) {
		@Override
		public void printHangulMonth() {
			// TODO Auto-generated method stub
			System.out.println("12월입니다.");
		}
	};
	
	// 2. 지정된 값을 받아줄 변수 선언. 항상 pricate으로 선언한다.
	// 변수가 private으로 선언되기 때문에 getter/setter메소드를 항상 정의한다.
	// 생성자에서 해당 상수 값으로 초기화가 될 수 있도록 한다.
	private int monthValue;
	
	// 3. 생성자 선언
	// enum 객체를 생성할 때 valueOf(상수명)메소드나 enum클래스원형.상수명으로
	// 생성을 하게 되는데 지정된 상수명에 해당하는 생성자가 자동으로 호출
	// ValueMonth valueMonth = ValueMonth.JAN;
	MethodMonth(int monthValue){
		this.monthValue = monthValue;
	}
	
	// 4. getter 메소드 선언, 상수의 값을 리턴해주는 메소드
	public int getMonthValue() {
		return this.monthValue;
	}
	
	// 1. enum에 static 메소드 선언
	public static void printMonths() {
		MethodMonth[] methodMonthArr = MethodMonth.values();
		
		for(MethodMonth methodMonth : methodMonthArr) {
			System.out.println(methodMonth + "는(은)" + methodMonth.getMonthValue() + "월입니다.");
		}
	}
	
	// 2. enum에 일반(인스턴스) 메소드 선언
	public void printMonth(int month) {
		MethodMonth[] methodMonthArr = MethodMonth.values();
		
		for(MethodMonth methodMonth : methodMonthArr) {
			if(methodMonth.getMonthValue() == month) {
				System.out.println("입력한 달은 " + methodMonth.getMonthValue() + "월 입니다.");
			}
		}
	}
	
	// 현재 생성된 상수 객체의 월 값에 매개변수로 받은 개월 수을 더해서
	// month 개월 후가 몇월달인지 출력하는 메소드를 구현하세요.
	public void printAddMonth(int month) {
//		int calculMonth = (this.monthValue + month) % 12;
//		printMonth(calculMonth);
		if(this.monthValue + month <= 12) {
			System.out.println(month + "개월 뒤는 " + (this.monthValue + month) + "월입니다.");
		} else {
			System.out.println(month + "개월 뒤는 " +
						((this.monthValue + month) % 12) + "월입니다.");
		}
	}
	
	// 3. enum에 추상메소드 선언
	// enum에 선언된 추상메소드는 자식클래스에서 구현되는 게 아니고 선언된 상수마다 구현을 해줘야한다.
	public abstract void printHangulMonth();
}
