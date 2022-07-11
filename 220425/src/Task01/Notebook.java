package Task01;

public class Notebook {
	String color; //색상
	int size; //화면 크기(12, 14, 16인치)
	int memory; //메모리 용량(4, 8, 16, 32)
	static String cpu = "i7";
	
	Notebook(){
		this("white", 14, 16);
	}
	
	Notebook(String color){
		this(color, 14, 16);
	}
	
	Notebook(String color, int size, int memory){
		this.color = color;
		this.size = size;
		this.memory = memory;
	}
			
}
