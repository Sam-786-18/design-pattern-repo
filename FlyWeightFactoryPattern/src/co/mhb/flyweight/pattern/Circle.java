package co.mhb.flyweight.pattern;

public class Circle implements Shape {
private String label;
public Circle() {
	 System.out.println("Circle:0-param constructor");
	label="circle";
}
	@Override
	public void draw(int radius, String fillColor, String lineStyle) {
		System.out.println("Drawing Circle having "+radius +"size with filcolor "+fillColor+ "and lineStyle" +lineStyle);


	}

}
