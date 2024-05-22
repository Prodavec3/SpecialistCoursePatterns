package CodeExamples.Creational.AbstractFactory.factories;

import CodeExamples.Creational.AbstractFactory.roofs.Roof;
import CodeExamples.Creational.AbstractFactory.walls.Wall;
import CodeExamples.Creational.AbstractFactory.windows.Window;

public interface HouseFactory {
	Wall createWall();
	Roof createRoof();
	Window createWindow();
}
