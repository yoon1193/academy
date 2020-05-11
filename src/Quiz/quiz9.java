package Quiz;
class Girl{
	protected String name;
	public void show() {
		System.out.println("그녀는 자바 초보자이다.");
	}
	public Girl(String name) {
		this.name = name;
	};
}
class GoodGirl extends Girl{
	public GoodGirl(String name) {
		super(name);
		this.name = name;
	}

	public void show() {
		System.out.println(name+"는 자바를 잘 안다.");
	}
}
class BestGirl extends GoodGirl{
	public BestGirl(String name) {
		super(name);
		this.name = name;
		
	}

	public void show() {
		System.out.println(name+"는 자바를 무지하게 잘 안다.");
	}
}
public class quiz9 {

	public static void main(String[] args) {
		Girl g1 = new Girl("g1");
		Girl g2 = new GoodGirl("g2");
		GoodGirl gg = new BestGirl("gg");
		g2.show();
		gg.show();
		
		Girl[] girls = {new Girl("갑순이"),new GoodGirl("콩쥐"),new BestGirl("황진이")};
		for(Girl g : girls) {
			g.show();
		}

	}

}
