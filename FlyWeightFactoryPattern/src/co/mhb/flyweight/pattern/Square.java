package co.mhb.flyweight.pattern;

public class Square implements Shape {
	private String label;
public Square() {
	System.out.println("Square:0-param Constructor");
	label="square";
}
	@Override
	public void draw(int side, String fillColor, String lineStyle) {
	System.out.println("Drawing square having "+side +"size with filcolor "+fillColor+ "and lineStyle" +lineStyle);

	}

}
