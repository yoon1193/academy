package Interfacequize;
interface Countable{
	void count();
}
class Bird implements Countable{
	public Bird(String name) {
		System.out.println(name+"�� 2���� �ִ�.");
	}

	@Override
	public void count() {
		
	}
	public void fly() {
		System.out.println("����");
	}
}
class Tree implements Countable{
	public Tree(String name) {
		System.out.println(name+"�� 5�׷� �ִ�.");
	}

	@Override
	public void count() {
		
		
	}
	public void ripen() {
		System.out.println("�;���");
	}
}
public class quize1 {

	public static void main(String[] args) {
		
		
		Countable[] m= {new Bird("���ٱ�"),new Bird("������"),
						new Tree("�������"),new Tree("�㳪��")};
		for(Countable e:m) 
			e.count();
		
		for(int i=0;i<m.length;i++) {
			if(m[i]==new Bird(null)) {
				m.clone();
			}
		}
			
		
		

	}


}
