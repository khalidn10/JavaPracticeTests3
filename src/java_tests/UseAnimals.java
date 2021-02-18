package java_tests;

public class UseAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();      
        Animal dToA = d;
        Dog aToD = null;
        
        if (dToA instanceof Dog)
        {
        	aToD = (Dog) dToA;
        	System.out.println("Downcast successful");
        }
        
        System.out.println(dToA.varI);
        dToA.callme();
        dToA.staticCallMe();
        System.out.println("");
        System.out.println(aToD.varI);
        aToD.callme();
        aToD.callme2();
        aToD.staticCallMe();
	}

}
