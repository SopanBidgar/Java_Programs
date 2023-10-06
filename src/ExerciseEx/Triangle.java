package ExerciseEx;

 public class Triangle extends Square {

	 String area;
	private int length;
	private String dimension;
	private String circumference;
	
	 public void m1() {
		System.out.println("2222");
	}
	public void show() {
		System.out.println("Triangle is bad");
	}

	public Triangle() {
		super();
	}

	public Triangle(String area, int length, String dimension, String circumference) {
		super();
		this.area = area;
		this.length = length;
		this.dimension = dimension;
		this.circumference = circumference;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getCircumference() {
		return circumference;
	}

	public void setCircumference(String circumference) {
		this.circumference = circumference;
	}

}
