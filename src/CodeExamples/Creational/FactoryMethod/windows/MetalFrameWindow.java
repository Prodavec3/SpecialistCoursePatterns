package CodeExamples.Creational.FactoryMethod.windows;

public class MetalFrameWindow  implements Window {
	@Override
	public void open() {
		System.out.println("������� ������������� ����");
	}
	
	@Override
	public String toString() {
		return "������������� ����";
	}
}
