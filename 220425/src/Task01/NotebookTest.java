package Task01;

public class NotebookTest {

	public static void main(String[] args) {
		Notebook n1 = new Notebook();
		Notebook n2 = new Notebook("black");
		System.out.println("n1의 color는 " +n1.color+ ", 화면크기는 " +n1.size+ ", 메모리용량은 " +n1.memory+", CPU "+n1.cpu);
		System.out.println("n2의 color는 " +n2.color+ ", 화면크기는 " +n2.size+ ", 메모리용량은 " +n2.memory+", CPU "+n2.cpu);

	}

}
