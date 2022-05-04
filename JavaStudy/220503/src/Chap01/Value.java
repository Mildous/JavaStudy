package Chap01;

public class Value extends Object implements Cloneable{	//extends Object ������
	int value;
	
	Value(int value){	//������ : ������ �� �ʱ�ȭ ����
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Value) {
			return value == ((Value)obj).value; //�ٿ�ĳ����
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
		return "����"+ value;
	}
	

}
