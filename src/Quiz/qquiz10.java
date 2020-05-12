package Quiz;
class Circle{
	int radius=0;
	public void show() {
		System.out.println("반지름이 "+radius+"인 원이다.");
	}
	public Circle() {}
	public Circle(int radius) {

		this.radius = radius;
	}
	
}
class ColoredCircle extends Circle{
	String color = "";
	public void show() {
		System.out.println("반지름이 "+radius+"인 "+color+"원이다.");
	}
	public ColoredCircle() {}
	public ColoredCircle(int radius, String color) {
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
