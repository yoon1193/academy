package Quiz;
interface Talkable{
	void talk();
}
class Korean implements Talkable{
	public void talk() {
		System.out.println("æ»≥Á«œººø‰!");
	}
}
class American implements Talkable{
	public void talk() {
		System.out.println("Hello!");
	}
}
public class quiz4 {
	static void speak(Talkable word) {
		word.talk();
	}
	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());

	}

}
