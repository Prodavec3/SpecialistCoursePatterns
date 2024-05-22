package CodeExamples.Creational.AbstractFactory.factories;

import CodeExamples.Creational.AbstractFactory.roofs.Roof;
import CodeExamples.Creational.AbstractFactory.roofs.TileRoof;
import CodeExamples.Creational.AbstractFactory.walls.BrickWall;
import CodeExamples.Creational.AbstractFactory.walls.Wall;
import CodeExamples.Creational.AbstractFactory.windows.PlasticFrameWindow;
import CodeExamples.Creational.AbstractFactory.windows.Window;

public class StoneHouseFactory implements HouseFactory {

	@Override
	public Wall createWall() {
		return new BrickWall();
	}

	@Override
	public Roof createRoof() {
		return new TileRoof();
	}

	@Override
	public Window createWindow() {
		return new PlasticFrameWindow();
	}

}
