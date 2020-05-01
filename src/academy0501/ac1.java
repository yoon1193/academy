package academy0501;



//��� class�� object class�� ����Ѵ�
class Rectangle{
	public double width=0;
	public double height=0;
	
	//method ����,�ѷ�
	public double area() {
		return width*height;
	}
	public double around() {
		return 2*(width+height);
	}
	
	//������
	public Rectangle() {}
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	
}
class RectanglePillar extends Rectangle {
	public double pillar=0;
	
	public double volume() {//����
		return area()*pillar;
	}
	
	public RectanglePillar() {}
	public RectanglePillar(double width,double height,double pillar) {
		super(width,height);//super �θ������ ������ �� ó���κп� �����  
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
	
	public double volume() {//����
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
		//Ŭ���� �����ִ� data�� ������
		//��� ���� Ŭ������ �����ϸ鼭
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
