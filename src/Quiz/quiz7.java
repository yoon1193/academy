package Quiz;
interface Human1{
	void eat();
	static void echo() {
		System.out.println("야호!!!");
	}
}
class Worker implements Human1{
	public void eat() {
		System.out.println("빵을 먹습니다.");
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
		System.out.println("도시락을 먹습니다.");
	}
	public void print() {
		System.out.println("학생입니다.");
	}
}
class Person1 implements Human1{

	@Override
	public void eat() {
		System.out.println("빵을 먹습니다.");
		
	}
	public void print() {
		System.out.println("인간입니다.");
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
