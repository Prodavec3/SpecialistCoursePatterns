package CodeExamples.Structural.Flyweight.nature.flyweight;

import CodeExamples.Structural.Flyweight.nature.Animal;

public class AnimalContext extends  Animal {
	
	private AnimalPicture flyweight;
	
	public AnimalContext(int x, int y, AnimalType type) {
		super(x, y);
		this.flyweight = AnimalPictureFactory.instance.getAnimalPicture(type);
	}
	
	@Override
	public void draw() {
		flyweight.draw(getX(), getY());
	}
	

}
