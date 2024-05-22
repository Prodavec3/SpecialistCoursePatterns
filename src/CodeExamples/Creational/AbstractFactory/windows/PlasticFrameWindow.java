package CodeExamples.Creational.AbstractFactory.windows;
import static java.lang.System.out;

public class PlasticFrameWindow implements Window {

	@Override
	public void open() {
		out.println("������� ����������� ����");

	}

	@Override
	public void close() {
		out.println("������� ����������� ����");
	}

	@Override
	public Window install() {
		out.println("���������� ����������� ����");
		return this;
	}

}
