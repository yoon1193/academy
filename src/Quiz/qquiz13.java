package Quiz;
class Parents{
	String name;
	Parents(){
		name = "영조";
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
		name = "사도세자";
	}
	public Child(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println("나는 "+name+"이다");
	}
}
public class qquiz13 {

	public static void main(String[] args) {
		Parents p = new Child();
		System.out.println(p.name);
		p.print();

	}

}
