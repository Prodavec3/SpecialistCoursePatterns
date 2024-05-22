package CodeExamples.Creational.Prototype;

public class ColorPoint extends Point implements Prototype{
	StringBuilder color;

	public ColorPoint(int x, int y, StringBuilder color) {
		super (x,y);
		this.color = color;
	}

	public ColorPoint(ColorPoint p) {
		//this(p.x, p.y, p.color); // shallow clone - неглубокое копирование
		this(p.x, p.y, new StringBuilder(p.color));// deep clone - глубокое копирование
		// создаем новый объект с новой ссылкой вместо той же самой
	}

	@Override
	public ColorPoint Clone() {
		return new ColorPoint(this);
	}

	@Override
	public String toString() {
		return String.format("Color Point (%d,%d) %s", x,y, color);
	}


}
