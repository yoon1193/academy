package Quiz;

import java.io.IOException;

interface Sort{
	void ascedning(int[] a);
	void desendning(int[] a);
	void description();
}
class QuickSort implements Sort{

	@Override
	public void ascedning(int[] a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desendning(int[] a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void description() {
		System.out.println("QuickSort �Դϴ�");
		
	}
	
}
class HeapSort implements Sort{

	@Override
	public void ascedning(int[] a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desendning(int[] a) {
		System.out.println("HeapSort �Դϴ�");
		
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		
	}
	
}
class BubbleSort implements Sort{

	@Override
	public void ascedning(int[] a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desendning(int[] a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void description() {
		System.out.println("BubbleSort �Դϴ�");
	}
	
}

public class quiz8 {

	public static void main(String[] args) throws IOException {
		System.out.println("���� ����� �����ϼ���.");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		
		int ch = System.in.read();
		Sort sort = null;
		
		if(ch == 'b' || ch == 'B') {
			sort = new BubbleSort();
		}
		else if(ch == 'h' || ch == 'H') {
			sort = new HeapSort();
		}
		else if(ch == 'q' || ch == 'Q') {
			sort = new QuickSort();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}

		int[] arr = new int[10];
		sort.ascedning(arr);
		sort.desendning(arr);
		sort.description();
	}

}
