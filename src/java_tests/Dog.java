package java_tests;

public class Dog extends Animal {

	int varI = 20;
	
	public void callme()
    {
        System.out.println("In callme of Dog");
    }

    public void callme2()
    {
        System.out.println("In callme2 of Dog");
    }
    
    public static void staticCallMe()
    {
        System.out.println("In staticCallMe of Dog");
    }
}
