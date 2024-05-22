package CodeExamples.Creational.Prototype;

// � Java ���� ������� ��������� Cloneable
public interface Prototype {
	public static Prototype createRedPoint() {
		// ����� � ������� ������ �������� � ����������� ���
		return Program.protos.get("red").Clone();
	}
	
	Prototype Clone();
	
	
}
