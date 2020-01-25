package co.mhb.flyweight.pattern.test;

import co.mhb.flyweight.pattern.Circle;
import co.mhb.flyweight.pattern.Square;
import co.mhb.flyweight.pattern.factory.ShapeFactory;

public class FlyWeightTest {
	public static void main(String[] args) {
		final int  SHAPECOUNT=10;
		Circle circle=null;
		Square square=null;
		//draw circles with different dimension
		for(int i=0;i<=SHAPECOUNT;++i)
		{
			circle=(Circle) ShapeFactory.getInstance("circle");
			
			circle.draw(i*100, "White"+i, "doted"+i);
		}
		System.out.println("-------------------------------------------");
		//draw squarenwith different dimesion
		for(int i=1;i<=SHAPECOUNT;++i)
		{
			square=(Square) ShapeFactory.getInstance("square");
			square.draw(i*100, "Red"+i, "dashed"+i);
		}
	}

}
