package OOPSCONCEPT;

public class Shape {
	private float length;
	private float breadth;
	private int area;
	
	public void drawshape() {
		System.out.println("drawing");
	}
	
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getBreadth() {
		return breadth;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public Shape(float length, float breadth, int area) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.area = area;
	}

	public Shape()
	{
		super();
	}

}
