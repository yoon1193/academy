package Quiz;
class Parents{
	String name = "����";
	public void print() {
		
	}
}
class Child extends Parents{
	String name = "�絵����";
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
