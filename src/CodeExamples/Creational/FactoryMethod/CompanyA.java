package CodeExamples.Creational.FactoryMethod;

import CodeExamples.Creational.FactoryMethod.windows.PlasticFrameWindow;
import CodeExamples.Creational.FactoryMethod.windows.Window;

public class CompanyA extends Supplier {
	@Override
	public Window createWindow() {
		return new PlasticFrameWindow();
	}
}
