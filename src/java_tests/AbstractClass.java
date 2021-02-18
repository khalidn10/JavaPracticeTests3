package java_tests;

public abstract class AbstractClass {

	private int i = 0;
	
	abstract void abstractMethod();
	
	private void normalMethod()
	{
		System.out.println("Normal method");
	}
	
	public void normalMethod2()
	{
		if (i == 0)
		{
			normalMethod();
		}
		System.out.println("Normal method 2");
	}
}
