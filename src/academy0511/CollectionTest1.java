package academy0511;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Rectangle implements Comparable<Rectangle>{
	public double width,height;
	public double area() {
		return width * height;
	}
	
	public Rectangle(double width,double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Rectangle other = (Rectangle) obj;//형변환
		if (this.height != other.height)// 두 객체의 비교
			return false;
		if (this.width != other.width)
			return false;
//		if (this.width * this.height == other.width * other.height) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
//	@Override
//	public int compareTo(Object arg0) {
//		int returnValue=0;
//		Rectangle other = (Rectangle)arg0;
//		if(this.area()==other.area()) {
//			returnValue=0;
//		}
//		else if(this.area()>other.area()) {
//			returnValue=-1;
//		}
//		else if(this.area()<other.area()) {
//			returnValue=1;
//		}
//		//this와other를 비교해서 this가 클때는 -1이 리턴되는 내림차순정렬.
//		//this와other를 비교해서 other가 클때는 1이 리턴되는 오름차순정렬.
//		//-1=교환,0=같음,1=교환필요없음
//		return returnValue;
//	}
	
	@Override
	public int compareTo(Rectangle other) {
		int returnValue=0;
	
		if(this.area()==other.area()) {
			returnValue=0;
		}
		else if(this.area()>other.area()) {
			returnValue=-1;
		}
		else if(this.area()<other.area()) {
			returnValue=1;
		}
		//this와other를 비교해서 this가 클때는 -1이 리턴되는 내림차순정렬.
		//this와other를 비교해서 other가 클때는 1이 리턴되는 오름차순정렬.
		//-1=교환,0=같음,1=교환필요없음
		return returnValue;
	}
}

class RectangleWidthAsc implements Comparator<Rectangle>{
	@Override
	public int compare(Rectangle arg0, Rectangle arg1) {
		int returnValue=0;
		if(arg0.width>arg1.width) {
			returnValue=1;
		}
		else if(arg0.width<arg1.width) {
			returnValue=-1;
		}
		else {
			returnValue=0;
		}
		return returnValue;
	}
}
class RectangleHeightAsc implements Comparator<Rectangle>{
	@Override
	public int compare(Rectangle arg0, Rectangle arg1) {
		int returnValue=0;
		if(arg0.height>arg1.height) {
			returnValue=1;
		}
		else if(arg0.height<arg1.height) {
			returnValue=-1;
		}
		else {
			returnValue=0;
		}
		return returnValue;
	}
}


public class CollectionTest1 {

	public static void main(String[] args) {
		//int,String 잘 됨
		//우리가 만든 클래스의 문제점은?
		//컬렉션을 사용하려면 equals랑 hashCode를 재정의해야함.

		ArrayList<Rectangle> arr = new ArrayList<Rectangle>();
		arr.add(new Rectangle(10,10));
		arr.add(new Rectangle(11,11));
		arr.add(new Rectangle(12,12));
		arr.add(new Rectangle(13,13));
		arr.add(new Rectangle(14,14));
		arr.add(new Rectangle(13,20));
		System.out.println("   1---------------------------");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("   2)remove---------------------------");
		arr.remove(1);
		arr.remove(new Rectangle(12,12));//안지워짐 -> 위에 작업을 통해 지워짐 확인하셈
		for(Rectangle r : arr) {
			System.out.println(r);
		}
		
		System.out.println("   3)add후remove---------------------------");
		Rectangle rect=new Rectangle(15,15);
		arr.add(rect);
		arr.remove(rect);
		for(Rectangle r : arr) {
			System.out.println(r);
		}
		
		System.out.println("   4)객채정렬---------------------------");
		//객체정렬
		//compareTo compare
		//compareTo --> Comparable 인터페이스  매개변수1개(자기자신하고 매개변수 비교)
		//compare --> Comparator 인터페이스  매개변수2개
		Collections.sort(arr);
		for(Rectangle r : arr) {
			System.out.println(r);
		}
		
		System.out.println("   5)width로 정렬---------------------------");
		//width로 정렬 //익명클래스
		Collections.sort(arr,new Comparator<Rectangle>() {
			@Override
			public int compare(Rectangle arg0, Rectangle arg1) {
				int returnValue=0;
				if(arg0.width>arg1.width) {
					returnValue=-1;
				}
				else if(arg0.width<arg1.width) {
					returnValue=1;
				}
				else {
					returnValue=0;
				}
				return returnValue;
			}
		});
		for(Rectangle r : arr) {
			System.out.println(r);
		}
		
//		Comparator<Rectangle> com = new Comparator<Rectangle>() {
//
//			@Override
//			public int compare(Rectangle o1, Rectangle o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//		};
//		Collections.sort(arr,com);
		
		System.out.println("   6)height로 정렬---------------------------");
		//height로 정렬 //익명클래스
			Collections.sort(arr,new Comparator<Rectangle>() {
				@Override
				public int compare(Rectangle arg0, Rectangle arg1) {
					int returnValue=0;
					if(arg0.height>arg1.height) {
						returnValue=-1;
					}
					else if(arg0.height<arg1.height) {
						returnValue=1;
					}
					else {
						returnValue=0;
					}
					return returnValue;
				}
			});
			for(Rectangle r : arr) {
				System.out.println(r);
			}
			
			System.out.println("   7)width 오름차순 정렬(클래스를 따로뺴서)---------------------------");
//			RectangleWidthAsc asc = new RectangleWidthAsc();
//			Collections.sort(arr,asc); 같은거 밑어꺼랑
			Collections.sort(arr,new RectangleWidthAsc());
			for(Rectangle r : arr) {
				System.out.println(r);
			}
			
			System.out.println("   8)height 오름차순 정렬(클래스를 따로뺴서)---------------------------");
			Collections.sort(arr,new RectangleHeightAsc());
			for(Rectangle r : arr) {
				System.out.println(r);
			}
			
			System.out.println("   9)width 내림차순 정렬(람다식)---------------------------");
			//람다식
			Collections.sort(arr,(a,b)->{
				int returnValue = 0;
				if(((Rectangle)a).width<((Rectangle)b).width) {
					returnValue = 1;
				}
				else if(((Rectangle)a).width>((Rectangle)b).width) {
					returnValue = -1;
				}
				return returnValue;
			});
			for(Rectangle r : arr) {
				System.out.println(r);
			}
			
			System.out.println("   10)height 내림차순 정렬(람다식)---------------------------");
			//람다식
			Collections.sort(arr,(a,b)->{
				int returnValue = 0;
				if(((Rectangle)a).height<((Rectangle)b).height) {
					returnValue = 1;
				}
				else if(((Rectangle)a).height>((Rectangle)b).height) {
					returnValue = -1;
				}
				return returnValue;
			});
			for(Rectangle r : arr) {
				System.out.println(r);
			}
	}

}
