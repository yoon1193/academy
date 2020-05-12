package Quiz;
class Point{
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString() {
		return "ÁÂÇ¥ : [x :"+x+" y :"+y+"]";
		
	}
}
class MovablePoint extends Point{
	private int xSpeed,ySpeed;
	public int getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	public int getySpeed() {
		return ySpeed;
	}
	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public String toString() {
		return "ÁÂÇ¥ : (" + getX() + ",  " + getY() + ")\tÀÌµ¿¼Óµµ : (" + xSpeed + ", " + ySpeed + ")";
		
	}
}
public class qquiz12 {

	public static void main(String[] args) {
		Point p = new Point(0,0);
	 	MovablePoint mp = new  MovablePoint(0,0,0,0);
		System.out.println(p);
		System.out.println(mp);
		

	}

}
