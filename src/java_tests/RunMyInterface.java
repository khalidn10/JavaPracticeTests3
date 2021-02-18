package java_tests;

import java.util.ArrayList;
import java.util.List;

public class RunMyInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<MyInterface> miList = new ArrayList<>();
		miList.add(new MyClass1());
		miList.add(new MyClass2());
		
		for (MyInterface mi : miList)
		{
			mi.method1();
			mi.method2();
		}
	}

}
