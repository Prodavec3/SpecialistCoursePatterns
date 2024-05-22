package CodeExamples.Creational.AbstractFactory;

import java.util.Locale;

import CodeExamples.Creational.AbstractFactory.factories.*;

public class Program {

	public static void main(String[] args) {
		HouseFactory factory;
		if (Locale.getDefault().getISO3Country().equals("RUS"))
			factory = new StoneHouseFactory();
		else
			factory = new WoodHouseFactory();
		
		factory.createWall().build();
		factory.createRoof().cover().waterProtect();
		factory.createWindow().install().open();

	}

}
