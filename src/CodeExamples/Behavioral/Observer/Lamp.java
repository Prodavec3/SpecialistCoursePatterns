package CodeExamples.Behavioral.Observer;

public class Lamp implements ElectricityListener
{

	@Override
	public void electricityOn(Object source)
	{
		System.out.println("����� ��������");
	}
}
