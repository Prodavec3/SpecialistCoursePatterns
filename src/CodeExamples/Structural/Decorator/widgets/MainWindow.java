package CodeExamples.Structural.Decorator.widgets;

public class MainWindow extends CompositeControl {
	@Override
	public void drawLineFinish() {
		super.drawLineFinish();
		System.out.println();
	}

}
