//package Quiz;
//interface Human{
//	void eat();
//	static void echo() {
//		System.out.println("��ȣ!!!");
//	}
//}
//class Worker implements Human{
//	public void eat() {
//		System.out.println("���� �Խ��ϴ�.");
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
//		System.out.println("���ö��� �Խ��ϴ�.");
//	}
//	public void print() {
//		System.out.println("�л��Դϴ�.");
//	}
//}
//class Person implements Human{
//
//	@Override
//	public void eat() {
//		System.out.println("���� �Խ��ϴ�.");
//		
//	}
//	public void print() {
//		System.out.println("�ΰ��Դϴ�.");
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
