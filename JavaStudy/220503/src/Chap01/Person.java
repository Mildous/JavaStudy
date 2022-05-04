package Chap01;

public class Person {
	long id;
	
	Person(long id){
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {	// ´ÙÇü¼º
			if(obj!=null && obj instanceof Person) {
				return id == ((Person)obj).id;
			}else {
				return false;
			}
	}
	
}
