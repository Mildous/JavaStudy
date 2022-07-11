package chap01_1;

public class BoxTest {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
		Box<Grape> grapeBox = new Box<Grape>();
		FruitBox<Fruit> fb = new FruitBox<Fruit>();
		//FruitBox<Toy> fb2 = new FruitBox<Toy>();
		
		fruitBox.add(new Fruit()); //Box<Fruit>에 Fruit을 담는다
		fruitBox.add(new Apple()); //Box<Fruit>에 Apple을 담는다
		
		appleBox.add(new Apple()); //Box<Apple>에 Apple을 2번 담는다
		appleBox.add(new Apple());
		//appleBox.add(new Toy()); //Box<Apple>에는 Apple만 담을 수 있음
		
		toyBox.add(new Toy());
		//toyBox.add(new Apple()); //Box<Toy>에는 Toy만 담을 수 있음
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);		
		System.out.println(toyBox);

	}

}
