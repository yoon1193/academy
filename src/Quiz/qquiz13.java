package Quiz;
class Parents{
	String name;
	Parents(){
		name = "����";
	}
	public Parents(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println(name);
	}
}
class Child extends Parents{
	String name ;
	Child(){
		name = "�絵����";
	}
	public Child(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println("���� "+name+"�̴�");
	}
}
public class qquiz13 {

	public static void main(String[] args) {
		Parents p = new Child();
		System.out.println(p.name);
		p.print();

	}

}
