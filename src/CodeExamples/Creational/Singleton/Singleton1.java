package CodeExamples.Creational.Singleton;

// - non thread safe (��������� ����� ����������� � ������������ �������
// ����������� ����� ���� true, ������� 2 � ������)
public class Singleton1 {
	
	private Singleton1() {
		System.out.println("Singleton 1 created");
	}
	
	private static Singleton1 instance = null;
	
	public static Singleton1 getInstance() {
		if (instance == null)
			instance = new Singleton1();
		
		return instance;
	}

}
