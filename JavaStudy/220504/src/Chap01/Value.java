package Chap01;

public class Value extends Object implements Cloneable{	//extends Object 생략됨
	int value;
	
	Value(int value){	//생성자 : 생성될 때 초기화 역할
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Value) {
			return value == ((Value)obj).value; //다운캐스팅
		}
		else
			return false;
	}

	@Override
	protected Value clone() {
		Object obj = null;
		
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Value)obj;
	}

	@Override
	public String toString() {
		return "값은"+ value;
	}
	

}
