package homework10.advance;

public enum TweleveMonth {

	JANUARY(31, 31),
	FEBRUARY(28, 29),
	MARCH(31, 31),
	APRIL(30, 30),
	MAY(31, 31),
	JUNE(30, 30),
	JULY(31, 31),
	AUGUST(31, 31),
	SEPTEMBER(30, 30),
	OCTOBER(31, 31),
	NOVEMBER(30, 30),
	DECEMBER(31, 31);
	
	private int commonYearDay;
	private int leapYearDay;
	
	public int getCommonYearDay() {
		return commonYearDay;
	}

	public int getLeapYearDay() {
		return leapYearDay;
	}

	TweleveMonth (int commonYearDay, int leapYearDay){
		this.commonYearDay = commonYearDay;
		this.leapYearDay = leapYearDay;
	}
	
	public int sumDays(int year) {
		int daySum = 0;
		TweleveMonth[] twelveMonth = TweleveMonth.values();
		
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			for(int i = 0; i < 5; i++) {
				daySum += twelveMonth[i].getLeapYearDay();
			}
		} else {
			for(int i = 0; i < 5; i++) {
				daySum += twelveMonth[i].getCommonYearDay();
			}
		}
		
		return daySum;
	}
}
