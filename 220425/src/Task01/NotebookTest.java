package Task01;

public class NotebookTest {

	public static void main(String[] args) {
		Notebook n1 = new Notebook();
		Notebook n2 = new Notebook("black");
		System.out.println("n1�� color�� " +n1.color+ ", ȭ��ũ��� " +n1.size+ ", �޸𸮿뷮�� " +n1.memory+", CPU "+n1.cpu);
		System.out.println("n2�� color�� " +n2.color+ ", ȭ��ũ��� " +n2.size+ ", �޸𸮿뷮�� " +n2.memory+", CPU "+n2.cpu);

	}

}