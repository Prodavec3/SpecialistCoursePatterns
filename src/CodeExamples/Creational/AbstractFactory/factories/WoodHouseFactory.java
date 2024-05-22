package CodeExamples.Creational.AbstractFactory.factories;

import CodeExamples.Creational.AbstractFactory.roofs.Roof;
import CodeExamples.Creational.AbstractFactory.roofs.WoodRoof;
import CodeExamples.Creational.AbstractFactory.walls.WoodWall;
import CodeExamples.Creational.AbstractFactory.walls.Wall;
import CodeExamples.Creational.AbstractFactory.windows.Window;
import CodeExamples.Creational.AbstractFactory.windows.WoodFrameWindow;

public class WoodHouseFactory implements HouseFactory {

	@Override
	public Wall createWall() {
		return new WoodWall();
	}

	@Override
	public Roof createRoof() {
		return new WoodRoof();
	}

	@Override
	public Window createWindow() {
		return new WoodFrameWindow();
	}

}
