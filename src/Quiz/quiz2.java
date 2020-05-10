package Quiz;
abstract class Abstract{
	int i;
	public Abstract(int i) {
		this.i=i;
	}
	public abstract void show();
	 
}
class Concrete extends Abstract{
	int j;
	public Concrete(int i,int j) {
		super(i);
		this.j=j;
	}
	@Override
	public void show() {
		System.out.println("i = "+i+", "+"j = "+j);
	}
}
public class quiz2 {

	public static void main(String[] args) {
		Concrete c=new Concrete(100,50);
		c.show();

	}

}
