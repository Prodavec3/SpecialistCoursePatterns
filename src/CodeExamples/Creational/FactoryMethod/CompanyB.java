package CodeExamples.Creational.FactoryMethod;

import CodeExamples.Creational.FactoryMethod.windows.Window;
import CodeExamples.Creational.FactoryMethod.windows.WoodFrameWindow;

public class CompanyB extends Supplier {
	@Override
	public Window createWindow() {
		return new WoodFrameWindow();
	}

}
