package Quiz;
class Vehicle{
	String color;
	int speed;
	public void show() {
		System.out.println("��: "+color+" ���ǵ�: "+speed);
	}
	public Vehicle() {}
	public Vehicle(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
	}
	
}
class Car extends Vehicle{
	int displacement;
	int gears;
	public Car() {}
	public Car(String color, int speed,int displacement, int gears) {
		super(color,speed);
		this.color = color;
		this.speed = speed;
		this.displacement = displacement;
		this.gears = gears;
	}
	public void show() {
		System.out.println("��: "+color+" ���ǵ�: "+speed+" ��ⷮ: "+displacement+" ���ܼ�: "+gears);
	}
}
public class qquiz15 {

	public static void main(String[] args) {
		Car c = new Car("�Ķ�",200,1000,5);
		c.show();
		
		Vehicle v = c;
		v.show();
	}

}
