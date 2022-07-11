package chap01_1;

public class BoxTest {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
		Box<Grape> grapeBox = new Box<Grape>();
		FruitBox<Fruit> fb = new FruitBox<Fruit>();
		//FruitBox<Toy> fb2 = new FruitBox<Toy>();
		
		fruitBox.add(new Fruit()); //Box<Fruit>�� Fruit�� ��´�
		fruitBox.add(new Apple()); //Box<Fruit>�� Apple�� ��´�
		
		appleBox.add(new Apple()); //Box<Apple>�� Apple�� 2�� ��´�
		appleBox.add(new Apple());
		//appleBox.add(new Toy()); //Box<Apple>���� Apple�� ���� �� ����
		
		toyBox.add(new Toy());
		//toyBox.add(new Apple()); //Box<Toy>���� Toy�� ���� �� ����
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);		
		System.out.println(toyBox);

	}

}
