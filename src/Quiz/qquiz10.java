package Quiz;
class Circle{
	int radius;
	public void show() {
		System.out.println("반지름이 "+radius+"인 원이다.");
	}
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
}
class ColoredCircle extends Circle{
	String color;
	public void show() {
		System.out.println("반지름이 "+radius+"인 "+color+"원이다.");
	}
	public ColoredCircle(int radius, String color) {
		super(radius);
		this.radius = radius;
		this.color = color;
	}
	
	
}
public class qquiz10 {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		c.show();
		Circle c1 = new ColoredCircle(10,"빨간색");
		c1.show();

	}

}
