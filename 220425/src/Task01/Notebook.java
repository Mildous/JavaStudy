package Task01;

public class Notebook {
	String color; //����
	int size; //ȭ�� ũ��(12, 14, 16��ġ)
	int memory; //�޸� �뷮(4, 8, 16, 32)
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