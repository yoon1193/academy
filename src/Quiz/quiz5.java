package Quiz;
abstract class Controller{
	boolean power;
	public Controller(boolean power) {
		this.power=power;
	}
	public void show() {
		if(this.power==false) {
			System.out.println(getName()+"가 꺼졌습니다.");
		}else {
			System.out.println(getName()+"가 켜졌습니다.");
		}
	}
	public abstract String getName();
}
class TV extends Controller{
	String name="Tv";
	public TV(boolean a) {
		super(a);
	}
	@Override
	public String getName() {
		return name;
	}
}
class Radio extends Controller{
	String name="라디오";
	public Radio(boolean a) {
		super(a);
	}
	@Override
	public String getName() {
		return name;
	}
}
public class quiz5 {
	public static void main(String[] args) {
		Controller []c = {new TV(false),new Radio(true)};
		for(Controller controller : c)
			controller.show();

	}

}
