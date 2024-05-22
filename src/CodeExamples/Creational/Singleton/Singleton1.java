package CodeExamples.Creational.Singleton;

// - non thread safe (обращение может происходить в параллельных потоках
// параллельно может быть true, объекта 2 и больше)
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
