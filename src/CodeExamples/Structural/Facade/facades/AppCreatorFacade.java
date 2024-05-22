package CodeExamples.Structural.Facade.facades;

import CodeExamples.Structural.Facade.widgets.MainWindow;

public abstract class AppCreatorFacade {
	public abstract MainWindow getMainWindow();
	public abstract MainWindow showApp(String... comp);

}
