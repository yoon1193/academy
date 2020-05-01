package academy0501;
class  Animal{
	public String name="";
	
//	public Animal() {}
	public Animal(String name) {
		super();
		this.name = name;
	}
	public void getName() {
		System.out.println(name);
	}
	public void eat() {
		System.out.println("eat");
	}
	public void move() {
		System.out.println("move");
	}
	public static void dispName(Animal a) {
		a.getName();
		a.move();
	}
	public static void dispName(Human a) {
		a.getName();
		a.move();
	}
	public static void dispName(Tiger a) {
		a.getName();
		a.move();
	}
	public static void dispName(Eagle a) {
		a.getName();
		a.move();
	}
	
}

class Human extends Animal{
	public Human (String name) {
		super(name);
	}
	@Override //������̼�  ������.
	public void move() {
		System.out.println("walk");
	}
	public void read() {
		System.out.println("read a book");
	}
}

class Tiger extends Animal{
	public Tiger (String name) {
		super(name);
	}
	@Override
	public void move() {
		System.out.println("run");
	}
	public void hunting() {
		System.out.println("hunting");
	}
}

class Eagle extends Animal{
	public Eagle (String name) {
		super(name);
	}
	@Override
	public void move() {
		System.out.println("fly");
	}
}
public class ac3 {

	public static void main(String[] args) {
		Animal a = new Animal("cat1");
		a.getName();
		a.eat();
		a.move();
		System.out.println("------------------");
		Human h = new Human("Yoon");
		h.getName();
		h.move();
		h.read();
		h.eat();
		System.out.println("------------------");
		Tiger t = new Tiger("tiger");
		t.getName();
		t.move();
		t.hunting();
		System.out.println("------------------");
		Eagle e = new Eagle("eagle");
		e.getName();
		e.move();
		System.out.println("------------------");
		//������ = �θ� �ڽ��� ������ �ִ�.
		Animal a0 = new Animal("dog");
		Animal a1 = new Human("Kim");
		Animal a2 = new Tiger("T1");
		Animal a3 = new Eagle("E1");
		//new Animal�� ���
		a0.getName();
		a0.eat();
		a0.move();
//		((Human)a0).read(); �ȵ�
		System.out.println("------------------");
		//new Human
		a1.getName();
		a1.eat();
		a1.move();//Animal Class ������ �����ǵȰ��� ���� (Human move)
		((Human)a1).read();//����
		System.out.println("------------------");
		//new Tiger
		a2.getName();
		a2.eat();
		a2.move();
		((Tiger)a2).hunting();
		System.out.println("------------------");
		//new Eagle
		a3.getName();
		a3.eat();
		a3.move();
		System.out.println("------------------");
		
		//overload �����̸��Ǹ޼ҵ�,�ٸ� �Ű����� �޼ҵ�
		//override ����� ���ؼ� �����ǵ� �޼ҵ�
		
		//�θ�class�� �ڽ�class�� ���� �ν��Ͻ�����
		//�⺻������ �θ� �ִ� �޼ҵ峪 �ʵ忡 �����Ѵ�.
		//����)override�� �޼ҵ�� �ڽ� �޼ҵ尡 ���
		//�ڽĿ� �ִ� �޼ҵ带 ���� ��ų�� ���� -- ����ȯ �ʿ�.


		//human,tiger,eagle�� �ϳ��� �迭�� �־ ���
		//�������� �̿��ؼ� ó���Ѵ�.
		Animal []  arr = new Animal[4];
		arr[0]=a0;
		arr[1]=a1;
		arr[2]=a2;
		arr[3]=a3;
		for(Animal ani:arr) {
			ani.move();
		}
		System.out.println("------------------");
		//������ �Ű������� �޾Ƽ� name�� ����ϴ� �Լ�
		Animal.dispName(a0);
		Animal.dispName(a1);
		Animal.dispName(a2);
		Animal.dispName(a3);
		System.out.println("------------------");
		//instanceof
		System.out.println(a0 instanceof Animal);
		System.out.println(a1 instanceof Animal);
		System.out.println(a2 instanceof Animal);
		System.out.println(a3 instanceof Animal);
		
		System.out.println(a0 instanceof Human);
		System.out.println(a1 instanceof Human);
		System.out.println(a2 instanceof Human);
		System.out.println(a3 instanceof Human);
		
	}

}
