package Quiz;
interface Human1{
	void eat();
	static void echo() {
		System.out.println("��ȣ!!!");
	}
}
class Worker implements Human1{
	public void eat() {
		System.out.println("���� �Խ��ϴ�.");
	}
}
class Student1 implements Human1{
	int age=0;
	public Student1() {}
	public Student1(int age) {
	this.age=age;
	}
	@Override
	public void eat() {
		System.out.println("���ö��� �Խ��ϴ�.");
	}
	public void print() {
		System.out.println("�л��Դϴ�.");
	}
}
class Person1 implements Human1{

	@Override
	public void eat() {
		System.out.println("���� �Խ��ϴ�.");
		
	}
	public void print() {
		System.out.println("�ΰ��Դϴ�.");
	}
}
public class quiz7 {
	public static void main(String[] args) {
		Human1.echo();
		Student1 s = new Student1(20);
		s.print();
		s.eat();
		Person1 p = new Person1();
		p.print();
		p.eat();
	}
}
