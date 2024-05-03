package chap99_homework.homework04;

import java.util.Scanner;

public class UseOfEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// {new Employee(), new Employee(), new Employee(), .... }
		// {new RegularEmployee(), new TempEmployee(), new ContractEmployee(), .... }
		Employee[] empArr = new Employee[100];
		
		Scanner sc = new Scanner(System.in);
		
		int eno;
		String name;
		int pay;
		int bonus;
		int hireYear;
		int workDay;
		
		/*
		 * *** 메뉴 선택 ***
		 * 1. 정규직 저장
		 * 2. 임시직 저장
		 * 3. 계약직 저장
		 * 4. 전체 사원 정보 출력
		 * 5. 월급 계산 출력
		 * 6. 프로그램 종료
		 * 
		 * 1번 선택 시
		 * 사번을 입력하세요.
		 * 1
		 * 이름을 입력하세요.
		 * 홍길동
		 * 급여를 입력하세요.
		 * 3000
		 * 보너스를 입력하세요.
		 * 300
		 * 입력한 empArr에 저장
		 * 
		 * 2번 선택 시
		 * 사번을 입력하세요.
		 * 2
		 * 이름을 입력하세요.
		 * 임꺽정
		 * 급여를 입력하세요.
		 * 3000
		 * 근무년수를 입력하세요.
		 * 7
		 * 입력한 내용을 empArr에 저장
		 * 
		 * 3번 선택 시
		 * 사번을 입력하세요.
		 * 3
		 * 이름을 입력하세요.
		 * 임꺽정
		 * 급여를 입력하세요.
		 * 20
		 * 근무일수를 입력하세요.
		 * 20
		 * 입력한 내용을 empArr에 저장
		 * 
		 * 4번 선택 시
		 * empArr에 저장되어 있는 모든 사원의 정보출력
		 * showEmployeeInfo() 메소드 사용
		 * 
		 * 5번 선택 시
		 * 검색할 사원의 사번을 입력하세요.
		 * 1
		 * 입력한 사번에 해당하는 사원의 정보 출력(showEmployeeInfo() 메소드 사용)
		 * 
		 * 6번 선택 시
		 * 프로그램 종료
		 */
		
		boolean isExit = true;
		int empIndex = 0;
		while(isExit) {
			System.out.println("*** 메뉴 선택 ***");
			System.out.println("1. 정규직 저장");
			System.out.println("2. 임시직 저장");
			System.out.println("3. 계약직 저장");
			System.out.println("4. 전체 사원 정보 출력");
			System.out.println("5. 월급 계산 출력");
			System.out.println("6. 프로그램 종료");
			
			int selectNum = sc.nextInt();
			sc.nextLine();	// 엔터 회피
			
			switch(selectNum) {
				case 1 : case 2 : case 3 :
					empArr[empIndex++] = generateEmployee(sc, selectNum);
					break;
				case 4 :
					System.out.println("저장되어 있는 근무자들을 출력합니다.");
					for(int i = 0; i < empIndex; i++) {
						if(empArr[i] != null) {
							System.out.println("---------------- " + (i + 1) + "번째 직원 ----------------");
							empArr[i].showEmployeeInfo();
							System.out.println("----------------------------------------");
						} else {
							break;
						}
					}
					break;
				case 5 :
					System.out.println("검색할 사원의 사번을 입력하세요.");
					eno = sc.nextInt();
					sc.nextLine(); // 엔터 회피
					
					boolean isExist = false;
					for(int i = 0; i < empArr.length; i++) {
						if(empArr[i] != null && empArr[i].getEno() == eno) {	// empArr null(사원이 있는지 없는지)부터 체크 후 사원번호 체크
							isExist = true;
//							System.out.println("검색하신 직원의 월급은 : " + empArr[i].getMonthPay() + "만원 입니다.");
							empArr[i].showEmployeeInfo();
						}
					}
					
					if(!isExist) {
						System.out.println("검색하신 사번을 갖고 있는 직원이 없습니다.");
					}
					
					break;
				case 6 :
					isExit = false;
					sc.close();
					System.exit(0);
//					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					continue;
			}
		}
//		sc.close();
	}
	
	public static Employee generateEmployee(Scanner sc, int menuSelect) {
		
		System.out.println("사번을 입력하세요.");
		int eno = sc.nextInt();
		sc.nextLine(); // 엔터 회피
		
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		
		System.out.println("급여를 입력하세요.");
		int pay = sc.nextInt();
		sc.nextLine(); // 엔터 회피
		
		if(menuSelect == 1) {
			System.out.println("보너스를 입력하세요.");
			int bonus = sc.nextInt();
			sc.nextLine(); // 엔터 회피
			
			return new RegularEmployee(eno, name, pay, menuSelect, bonus);
		} else if(menuSelect == 2) {
			System.out.println("근무년수를 입력하세요.");
			int hireYear = sc.nextInt();
			
			return new TempEmployee(eno, name, pay, menuSelect, hireYear);
		} else {
			System.out.println("근무일수를 입력하세요.");
			int workDay = sc.nextInt();
			
			return new ContractEmployee(eno, name, pay, menuSelect, workDay);
		}
		
	}
}
