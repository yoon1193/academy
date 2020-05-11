package Quiz;
class Person{
	String name;
	int age;
	public Person() {}
	public void show() {
		System.out.println("사람[이름: "+name+", 나이 : "+age+"]");
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
class Student extends Person{
	int sNum;
	public Student() {}
	public Student(String name,int age,int sNum) {
		super();
		this.name = name;
		this.age = age;
		this.sNum = sNum;
	}
	public void show() {
		System.out.println("학생[이름: "+name+", 나이 : "+age+", 학번 : "+sNum+"]");
	}
	
}
class ForeignStudent extends Student{
	String nationality;
	public ForeignStudent () {}
	public ForeignStudent(String name,int age,int sNum,String nationality) {
		super();
		this.name = name;
		this.age = age;
		this.sNum = sNum;
		this.nationality = nationality;
	}
	public void show() {
		System.out.println("외국학생[이름: "+name+", 나이 : "+age+", 학번 : "+sNum+", 국적 : "+nationality+"]");
	}
	
}
public class qquiz11 {

	public static void main(String[] args) {
		Person[] p = {new Person("길동이",22),new Student("황진이",23,100),
					new ForeignStudent("Amy",30,200,"U.S.A")};
		for(Person person : p) {
			person.show();
		}
	}

}
