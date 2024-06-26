package chap20_enum.enums;

public enum RGB {
	// RED, GREEN, BLUE 상수선언
	// 값은 4개를 갖는다
	// 첫 번째 같은 소문자 색상이름
	// 두 번째, 세 번째, 네 번째 값은 int
	// 두 번째 같은 빨간색 농도(255가 최대값)
	// 세 번째 값은 초록색 농도(255가 최대값)
	// 네 번째 값은 파란색 농도(255가 최대값)
	// enum을 구현하세요.
	RED("red", 255, 0, 0),
	GREEN("green", 0, 255, 0),
	BLUE("blue", 0, 0, 255);
	
	private String colorName;
	private int redValue;
	private int greenValue;
	private int blueValue;
	
	RGB(String colorName, int redValue, int greenValue, int blueValue) {
		this.colorName = colorName;
		this.redValue = redValue;
		this.greenValue = greenValue;
		this.blueValue = blueValue;
	}

	public String getColorName() {
		return colorName;
	}

	public int getRedValue() {
		return redValue;
	}

	public int getGreenValue() {
		return greenValue;
	}

	public int getBlueValue() {
		return blueValue;
	}
	
	
}
