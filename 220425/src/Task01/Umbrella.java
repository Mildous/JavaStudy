package Task01;

public class Umbrella {
	
	String type;
	String pattern;
	String color;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void showUmbrella() {
		System.out.printf("����� Ÿ���� %s, ����� ���̴� %s, ����� ������ %s%n", type, pattern, color);
	}

}