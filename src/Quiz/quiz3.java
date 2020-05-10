package Quiz;
import java.util.Arrays;
class Book implements Comparable<Book>{
	int price=0;
	public Book(int price) {
		this.price=price;
	}
	public void show() {
		System.out.println("Book [price="+price+"]");
	}
	@Override
	public int compareTo(Book b) {
		if(this.price<b.price) {
			return -1;
		}
		else if(this.price==b.price) {
			return 0;
		}
		else{
			return 1;
		}
	}
}
public class quiz3 {
	public static void main(String[] args) {
		Book [] Books= {new Book(15000),new Book(50000),new Book(20000)};
		System.out.println("정렬 전");
		for(int i=0;i<Books.length;i++) {
			Books[i].show();
		}
		System.out.println("정렬 후");
		Arrays.sort(Books);
		for(int i=0;i<Books.length;i++) {
			Books[i].show();
		}
	}
}
