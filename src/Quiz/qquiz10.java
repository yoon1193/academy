package Quiz;
class Circle{
	int radius=0;
	public void show() {
		System.out.println("�������� "+radius+"�� ���̴�.");
	}
	public Circle() {}
	public Circle(int radius) {

		this.radius = radius;
	}
	
}
class ColoredCircle extends Circle{
	String color = "";
	public void show() {
		System.out.println("�������� "+radius+"�� "+color+"���̴�.");
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
		Circle c1 = new ColoredCircle(10,"������");
		c1.show();

	}

}
