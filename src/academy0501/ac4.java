package academy0501;
//고객 상품 요금계산
class Customers{
	public String name;
	public String grade;
	public int sal;
	public Customers() {
		this.grade="silver";
		this.sal=0;
	}
	public Customers(String name) {
		super();
		this.name = name;
		this.grade="Silver";
		this.sal=0;
	}
	public void display() {
		System.out.print(name+"님은 ");
		System.out.print(grade+"등급 이시고 ");
		System.out.println("할인율은 "+sal+"% 입니다." );
	}
	
}
class Gold extends Customers{
//	public Gold() {
//		this.grade="Gold";
//		this.sal=5;
//	}
	public Gold(String name) {
		super(name);
		this.grade="Gold";
		this.sal=5;
	}
}
class Vip extends Customers{
//	public Vip() {
//		this.grade="VIP";
//		this.sal=10;
//	}
	public Vip(String name) {
		super(name);
		this.grade="VIP";
		this.sal=10;
		
	}
}

class Product{
	public String name;
	public int price;
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
}
class Tv extends Product{
	public Tv(String name,int price) {
		super(name,price);
		
	}
	
}
class Hp extends Product{
	public Hp(String name,int price) {
		super(name,price);
	}
	
}
class Pc extends Product{
	public Pc(String name,int price) {
		super(name,price);
	}
	
}
public class ac4 {

	public static void main(String[] args) {
//		Customers c1=new Customers("Yoon");
//		c1.display();
//		Gold g1=new Gold("Kim");
//		g1.display();
//		Vip v1=new Vip("An");
//		v1.display();
		Customers c0=new Vip("An");
		Customers c1=new Gold("An");
		Customers c2=new Customers("An");
		Customers[] arr=new Customers[3];
		arr[0]=c0;
		arr[1]=c1;
		arr[2]=c2;
		
		
		

	}

}
