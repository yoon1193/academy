package academy0501;



//모든 class는 object class를 상속한다
class Rectangle{
	public double width=0;
	public double height=0;
	
	//method 넓이,둘레
	public double area() {
		return width*height;
	}
	public double around() {
		return 2*(width+height);
	}
	
	//생성자
	public Rectangle() {}
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	
}
class RectanglePillar extends Rectangle {
	public double pillar=0;
	
	public double volume() {//부피
		return area()*pillar;
	}
	
	public RectanglePillar() {}
	public RectanglePillar(double width,double height,double pillar) {
		super(width,height);//super 부모생성자 생성자 맨 처음부분에 써야함  
		this.pillar = pillar;
//		this.width  = width;
//		this.height = height;
		super.width=width;
		super.height=height;
	}
}


class Triangle{
	public double width=0;
	public double height=0;
	public double area() {
		return (width*height)/2;
	}
	public Triangle() {}
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
}
class TrianglePillar extends Triangle{
	public double pillar=0;
	
	public double volume() {//부피
		return area()*pillar;
	}

	public TrianglePillar(double width,double height,double pillar) {
		this.pillar = pillar;
		this.width  = width;
		this.height = height;
	}
	
	
}




public class ac1 {

	public static void main(String[] args) {
		//클래스 관련있는 data를 묶은것
		//상속 기존 클래스를 유지하면서
		Rectangle r1=new Rectangle(10,30);
		System.out.println(r1.area());
		System.out.println(r1.around());
		System.out.println("-----------------");
		RectanglePillar rp=new RectanglePillar();
		rp.width=10;
		rp.height=20; 
		rp.pillar=30;
		System.out.println(rp.area());
		System.out.println(rp.around());
		System.out.println(rp.volume());
		System.out.println("-----------------");
		RectanglePillar rp1=new RectanglePillar(10,20,30);
		System.out.println(rp1.area());
		System.out.println(rp1.around());
		System.out.println(rp1.volume());
		System.out.println("-----------------");
		Triangle t1=new Triangle(10,20);
		System.out.println(t1.area());
		TrianglePillar t2=new TrianglePillar(10,20,5);
		
		System.out.println(t2.volume());
		
		
		
	}

}
