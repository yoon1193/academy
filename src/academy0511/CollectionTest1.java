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
		Rectangle other = (Rectangle) obj;//����ȯ
		if (this.height != other.height)// �� ��ü�� ��
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
//		//this��other�� ���ؼ� this�� Ŭ���� -1�� ���ϵǴ� ������������.
//		//this��other�� ���ؼ� other�� Ŭ���� 1�� ���ϵǴ� ������������.
//		//-1=��ȯ,0=����,1=��ȯ�ʿ����
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
		//this��other�� ���ؼ� this�� Ŭ���� -1�� ���ϵǴ� ������������.
		//this��other�� ���ؼ� other�� Ŭ���� 1�� ���ϵǴ� ������������.
		//-1=��ȯ,0=����,1=��ȯ�ʿ����
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
		//int,String �� ��
		//�츮�� ���� Ŭ������ ��������?
		//�÷����� ����Ϸ��� equals�� hashCode�� �������ؾ���.

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
		arr.remove(new Rectangle(12,12));//�������� -> ���� �۾��� ���� ������ Ȯ���ϼ�
		for(Rectangle r : arr) {
			System.out.println(r);
		}
		
		System.out.println("   3)add��remove---------------------------");
		Rectangle rect=new Rectangle(15,15);
		arr.add(rect);
		arr.remove(rect);
		for(Rectangle r : arr) {
			System.out.println(r);
		}
		
		System.out.println("   4)��ä����---------------------------");
		//��ü����
		//compareTo compare
		//compareTo --> Comparable �������̽�  �Ű�����1��(�ڱ��ڽ��ϰ� �Ű����� ��)
		//compare --> Comparator �������̽�  �Ű�����2��
		Collections.sort(arr);
		for(Rectangle r : arr) {
			System.out.println(r);
		}
		
		System.out.println("   5)width�� ����---------------------------");
		//width�� ���� //�͸�Ŭ����
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
		
		System.out.println("   6)height�� ����---------------------------");
		//height�� ���� //�͸�Ŭ����
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
			
			System.out.println("   7)width �������� ����(Ŭ������ ���Ε���)---------------------------");
//			RectangleWidthAsc asc = new RectangleWidthAsc();
//			Collections.sort(arr,asc); ������ �ؾ��
			Collections.sort(arr,new RectangleWidthAsc());
			for(Rectangle r : arr) {
				System.out.println(r);
			}
			
			System.out.println("   8)height �������� ����(Ŭ������ ���Ε���)---------------------------");
			Collections.sort(arr,new RectangleHeightAsc());
			for(Rectangle r : arr) {
				System.out.println(r);
			}
			
			System.out.println("   9)width �������� ����(���ٽ�)---------------------------");
			//���ٽ�
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
			
			System.out.println("   10)height �������� ����(���ٽ�)---------------------------");
			//���ٽ�
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
