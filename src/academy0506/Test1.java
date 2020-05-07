package academy0506;
//접근제한자 public private defalt protected
//public 모든위치 접근가능
//private 같은 class 내부에서 접근가능
//defalt 같은 패키지에서 접근가능
//protected 같은패키지이거나, 다른패키지이면 상속받은 자식에서만 접근가능
class MycClass2 extends academy0506a.MyClass{
	public void test() {
		i1=1;
		//i2=1;
		//i3=1;
		i4=1;
	}
}
public class Test1 {

	public static void main(String[] args) {
		academy0506.MyClass a = new academy0506.MyClass();
		a.i1=1;
		//a.i2=1;
		a.i3=1;
		a.i4=1;
		
		academy0506a.MyClass b = new academy0506a.MyClass();
		b.i1=1;
		//b.i2=1;
		//b.i3=1;
		//b.i4=1;
		
	}

}
