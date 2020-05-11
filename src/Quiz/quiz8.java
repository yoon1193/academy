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
		System.out.println("QuickSort 입니다");
		
	}
	
}
class HeapSort implements Sort{

	@Override
	public void ascedning(int[] a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desendning(int[] a) {
		System.out.println("HeapSort 입니다");
		
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
		System.out.println("BubbleSort 입니다");
	}
	
}

public class quiz8 {

	public static void main(String[] args) throws IOException {
		System.out.println("정렬 방식을 선택하세요.");
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
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}

		int[] arr = new int[10];
		sort.ascedning(arr);
		sort.desendning(arr);
		sort.description();
	}

}
