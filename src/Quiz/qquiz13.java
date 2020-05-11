package Quiz;
class Parents{
	String name = "영조";
	public void print() {
		
	}
}
class Child extends Parents{
	String name = "사도세자";
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
