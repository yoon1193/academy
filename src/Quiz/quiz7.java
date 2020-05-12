//package Quiz;
//interface Human{
//	void eat();
//	static void echo() {
//		System.out.println("야호!!!");
//	}
//}
//class Worker implements Human{
//	public void eat() {
//		System.out.println("빵을 먹습니다.");
//	}
//}
//class Student implements Human{
//	int age=0;
//	public Student() {}
//	public Student(int age) {
//	this.age=age;
//	}
//	@Override
//	public void eat() {
//		System.out.println("도시락을 먹습니다.");
//	}
//	public void print() {
//		System.out.println("학생입니다.");
//	}
//}
//class Person implements Human{
//
//	@Override
//	public void eat() {
//		System.out.println("빵을 먹습니다.");
//		
//	}
//	public void print() {
//		System.out.println("인간입니다.");
//	}
//}
//public class quiz7 {
//	public static void main(String[] args) {
//		Human.echo();
//		Student s = new Student(20);
//		s.print();
//		s.eat();
//		Person p = new Person();
//		p.print();
//		p.eat();
//	}
//}
