package Interfacequize;
interface Countable{
	void count();
}
class Bird implements Countable{
	public Bird(String name) {
		System.out.println(name+"가 2마리 있다.");
	}

	@Override
	public void count() {
		
	}
	public void fly() {
		System.out.println("날다");
	}
}
class Tree implements Countable{
	public Tree(String name) {
		System.out.println(name+"가 5그루 있다.");
	}

	@Override
	public void count() {
		
		
	}
	public void ripen() {
		System.out.println("익었다");
	}
}
public class quize1 {

	public static void main(String[] args) {
		
		
		Countable[] m= {new Bird("뻐꾸기"),new Bird("독수리"),
						new Tree("사과나무"),new Tree("밤나무")};
		for(Countable e:m) 
			e.count();
		
		for(int i=0;i<m.length;i++) {
			if(m[i]==new Bird(null)) {
				m.clone();
			}
		}
			
		
		

	}


}
