package Quiz;
class Girl{
	protected String name;
	public void show() {
		System.out.println("�׳�� �ڹ� �ʺ����̴�.");
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
		System.out.println(name+"�� �ڹٸ� �� �ȴ�.");
	}
}
class BestGirl extends GoodGirl{
	public BestGirl(String name) {
		super(name);
		this.name = name;
		
	}

	public void show() {
		System.out.println(name+"�� �ڹٸ� �����ϰ� �� �ȴ�.");
	}
}
public class quiz9 {

	public static void main(String[] args) {
		Girl g1 = new Girl("g1");
		Girl g2 = new GoodGirl("g2");
		GoodGirl gg = new BestGirl("gg");
		g2.show();
		gg.show();
		
		Girl[] girls = {new Girl("������"),new GoodGirl("����"),new BestGirl("Ȳ����")};
		for(Girl g : girls) {
			g.show();
		}

	}

}
