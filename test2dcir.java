
public class test2dcir {
	public static void main(String args[]) {
		Circle2D circle = new Circle2D(10,10,5);
		Circle2D circle1 = new Circle2D(18,18,4);
		boolean a = circle.contains(circle1);
		boolean b = circle.overlaps(circle1);
		System.out.print(a+" "+b);
}
}
