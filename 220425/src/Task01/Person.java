package Task01;

public class Person {
	
	String name;
	String num;
	String birth;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public void showPerson() {
		if(birth != null && !"".equals(birth)) {
			System.out.println("이름: "+name+" / 전화번호: "+num+" / 생일: "+birth);
		}else {
			System.out.println("이름: "+name+" / 전화번호: "+num);
		}
	}

}
	
	