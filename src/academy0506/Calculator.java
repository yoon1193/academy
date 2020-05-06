package academy0506;
class Vip extends Customer {
	public double sale = 0.1;
	@Override
	public double getRate() {
		return rate-sale;		
	}
}
class Gold extends Customer {
	public double sale = 0.2;
	@Override
	public double getRate() {
		return rate-sale;		
	}
}

class Tv extends Product{
	public double tax = 0.1;
	@Override
	public double getPrice() {
		return price*(1+tax);
	}
}

class Cp extends Product{
	public double tax = 0.11;
	@Override
	public double getPrice() {
		return price*(1+tax);
	}
}

class Radio extends Product{
	public double tax = 0.12;
	@Override
	public double getPrice() {
		return price*(1+tax);
	}
}

public class Calculator {
	public static double productCalculator(Customer c,Product[] p) {
		double totalPrice = 0;
		double totalRate = 0;
		
		totalRate = c.getRate();
		if(p!=null) {
			for(Product pr:p) {
				if(pr!=null) {
					totalPrice+=pr.getPrice();
				}
			}
		}
		
		return totalPrice*totalRate;//�� ���Ź�ǰ�ݾ�*��������
	}

	public static void main(String[] args) {
		Customer c = new Customer();
		Customer v = new Vip();
		Customer g = new Gold();
		Product [] pr = new Product[5];
		pr[0] = new Tv();
		pr[1] = new Radio();
		pr[2] = new Cp();
		
		System.out.println("�Ϲݰ�: "+Calculator.productCalculator(c, pr));
		System.out.println("Vip��: "+Calculator.productCalculator(v, pr));
		System.out.println("Gold��: "+Calculator.productCalculator(g, pr));
		
	}

}
