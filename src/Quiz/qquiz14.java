package Quiz;
class Phone{
	protected String owner;
	//생성자
	public Phone() {}
	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	public void talk() {
		System.out.println(owner+"가 통화중");
	}
	
}
class Telephone extends Phone{
	private String when;
	public void autoAnswering() {
		System.out.println(owner+"가 부재 중이니 "+when+" 전화 요망");
	}
	public Telephone() {}
	public Telephone(String owner,String when) {
		super(owner);
		this.owner=owner;
		this.when = when;
	}
}
class Smartphone extends Telephone{
	private String game;
	public Smartphone() {}
	public Smartphone(String owner, String game) {
		super(owner,game);
		this.game = game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public String getGame() {
		return game;
	}
	public void playGame(){
		System.out.println(owner+"가 "+game+" 게임 중");
	}
	
}
public class qquiz14 {
	public static void main(String[] args) {
		Phone[] phones = {new Phone("황진이"), new Telephone("길동이","내일"),
							new Smartphone("민국이","갤러그")};
		for(int i=0;i<phones.length;i++) {
			if(phones[i] instanceof Smartphone) {
				((Smartphone)phones[i]).playGame();
			}else if(phones[i] instanceof Telephone) {
				((Telephone)phones[i]).autoAnswering();
			}else if(phones[i] instanceof Phone) {
				((Phone)phones[i]).talk();
			}
		}

	}
	

}


