package homework10.basic;

public enum Country {

	KOR("한국", "불고기"),
	CHI("중국", "짜장면"),
	JAP("일본", "초밥"),
	USA("미국", "햄버거");
	
	private String countryName;
	private String countryFood;
	
	Country(String countryName, String countryFood){
		this.countryName = countryName;
		this.countryFood = countryFood;
	}

	public String getCountryName() {
		return countryName;
	}

	public String getCountryFood() {
		return countryFood;
	}
	
	public void notifyFood(String country) {
		Country[] countryArr = Country.values();
		
		for(Country countryE : countryArr) {
			if(countryE.getCountryName().equals(country)) {
				System.out.println(countryE + "의 대표음식은 " + countryE.getCountryFood() + "입니다.");
				break;
			}
		}
	}
}
