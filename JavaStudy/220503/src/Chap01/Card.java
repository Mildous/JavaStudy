package Chap01;

public class Card {
	String kind;
	int number;
	
	Card(){
		this("SPADE", 1);
	}

	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		return kind + ":" +number;
	}
	

}
