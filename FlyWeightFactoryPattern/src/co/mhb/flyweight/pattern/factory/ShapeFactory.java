package co.mhb.flyweight.pattern.factory;

import java.util.HashMap;
import java.util.Map;

import co.mhb.flyweight.pattern.Circle;
import co.mhb.flyweight.pattern.Shape;
import co.mhb.flyweight.pattern.Square;

public class ShapeFactory {
	private static Map<String, Shape> cache = new HashMap<String, Shape>();

	public static Shape getInstance(String shapeType) {
		Shape square = null;
		Shape circle = null;
		
		if (shapeType.equalsIgnoreCase("circle")) {
			if (!cache.containsKey("circle")) {
				circle = new Circle();
				cache.put("circle", circle);
			}
			return cache.get("circle");
		}

		else if (shapeType.equalsIgnoreCase("square")) {
			if (!cache.containsKey("square")) {
				square = new Square();
				cache.put("square", square);
			}
			return cache.get("square");
		}
		throw new IllegalArgumentException("invalid inputs");
	}

}
