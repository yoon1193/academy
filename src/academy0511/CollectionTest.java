package academy0511;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class CollectionTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();//Integer=wrapperClass
		arr.add(40);
		arr.add(30);
		arr.add(20);
		arr.add(10);
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("-----1------------------");
//		arr.remove(1);
//		for(int i : arr) {
//			System.out.println(i);
//		}
//		System.out.println("------------------");
//		arr.remove((Integer)10);
//		for(int i : arr) {
//			System.out.println(i);
//		}
//		System.out.println("------------------");
		Collections.sort(arr);
		Iterator<Integer> iter = arr.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("-----2------------------");
		int index = arr.indexOf(10);//찾는 데이터의 인덱스
		System.out.println(index);
		index = arr.indexOf((Integer)10);
		System.out.println(index);
		System.out.println("-----3------------------");
		System.out.println(arr.contains(20));//존재유무
		System.out.println(arr.contains(22));
		System.out.println("-----------------------");
		
		
		
		
		
		ArrayList<String> a= new ArrayList<>();
		a.add("a1");
		a.add("a2");
		a.add("a3");
		a.add("a4");
		a.add("a5");
		a.add("a6");
		a.add("a7");
		System.out.println(a.remove(3));
		System.out.println(a.get(3));
		a.add(3,"a4추가");
		System.out.println("------------------");
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		

	}

}
