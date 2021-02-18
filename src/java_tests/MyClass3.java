package java_tests;

public class MyClass3 {

	int i = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass3 mc3 = new MyClass3();
		MyClass4 mc4 = new MyClass4();
		
		mc4.myMethod(mc3);
		
		System.out.println(mc3.i);
	}

}
