package academy0506;
//���������� public private defalt protected
//public �����ġ ���ٰ���
//private ���� class ���ο��� ���ٰ���
//defalt ���� ��Ű������ ���ٰ���
//protected ������Ű���̰ų�, �ٸ���Ű���̸� ��ӹ��� �ڽĿ����� ���ٰ���
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
