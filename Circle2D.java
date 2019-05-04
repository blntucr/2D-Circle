
public class Circle2D {
	double x, y, radius;
	
	Circle2D(){
		this(0,0,1);
	}
	Circle2D(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	public boolean contains(double x, double y) {
		if(x >= (this.x - radius) && y >= (this.y-radius) 
				&& x <= (this.x + radius) && y <= (this.y + radius))
			return true;
		else
			return false;
	}
	public boolean contains(Circle2D circle) {
		if((circle.x + radius) <= (this.x + radius)
				&& (circle.y + circle.radius) <= (this.y + radius) 
				&& (circle.y - circle.radius) >= (this.y - radius)
				&& (circle.x - circle.radius) >= (this.y - radius))
			return true;
		else
			return false;
	}
	public boolean overlaps(Circle2D circle) {
		if((this.x + radius) > (circle.x - circle.radius) 
				&& (this.y + radius) > (circle.y - circle.radius))
			return true;
		else
			return false;
	}
}
