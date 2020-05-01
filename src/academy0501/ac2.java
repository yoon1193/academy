package academy0501;
class Customer{
	public int customerId=0;
	public String customerName="";
	public String customerGrade="";
	public int bonusPoint=0;
	public double bonusRatio=0;
	//������
	public Customer() {
		this.customerGrade="SILVER";
		this.bonusRatio=0.01;
	}
	public Customer(int customerId, String customerName, String customerGrade, int bonusPoint, int bonusRatio) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerGrade = customerGrade;
		this.bonusPoint = bonusPoint;
		this.bonusRatio = bonusRatio;
	}
	
	//
	public int calcPrice(int price) {
		bonusPoint+=(int)(price*bonusRatio);
		return price;
	}
	
	//����
	public void showCustomerinfo() {
		
		System.out.print(customerName+"�� �� ");
		System.out.print("����� "+customerGrade+"�̸�, ");
		System.out.println("���ʽ� ����Ʈ�� "+bonusPoint+"�� �Դϴ�");
	}
	
	//set
	public void setCustomerID(int s) {
		this.customerId=s;
		
	}
	public void setCustomerName(String s) {
		this.customerName=s;
	}
	
}

//vip
class vipCustomer extends Customer{
	public int consultantID=0;
	public double sal=0;
	public vipCustomer() {
		this.customerGrade="VIP";
		this.bonusRatio=0.05;
		this.sal=0.9;
	}
	public vipCustomer(int consultantID, double sal) {
		this.consultantID = consultantID;
		this.sal = sal;
	}

	public int calcPrice(int price) {
		bonusPoint+=(int)(price*bonusRatio);
		return (int)(price*sal);
	}
}
public class ac2 {

	public static void main(String[] args) {
		Customer customerlee=new Customer();
		customerlee.setCustomerID(10010);
		customerlee.setCustomerName("�̼���");
		customerlee.bonusPoint=1000;
		System.out.println(customerlee.calcPrice(10000));
		customerlee.showCustomerinfo();
		
	
		vipCustomer customerKim=new vipCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("������");
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.calcPrice(10000));
		customerKim.showCustomerinfo();
		
	}

}
