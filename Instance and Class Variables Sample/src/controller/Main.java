package controller;

import model.MyObject;

public class Main {
	
	public static void main(String[] args) {
		MyObject object1 = new MyObject();
		MyObject object2 = new MyObject();
		
		//integers without a starting value is given 0 by default
		System.out.println("Object 1 myInt Initial Value: " + object1.myInt);
		System.out.println("Object 2 myInt Initial Value: " + object2.myInt);
		
		object1.myInt = 1;
		object2.myInt = 2;
		
		System.out.println();
		System.out.println("Object 1 myInt Assigned Value: " + object1.myInt);
		System.out.println("Object 2 myInt Assigned Value: " + object2.myInt);
		
		System.out.println();
		System.out.println("Object 1 ourInt Initial Value: " + object1.ourInt);
		System.out.println("Object 2 ourInt Initial Value: " + object2.ourInt);
		System.out.println("Called from MyObject class: " + MyObject.ourInt);
		
		object1.ourInt = 1;
		object2.ourInt = 2; //try commenting this line for the previous assignment to show up
		
		System.out.println();
		System.out.println("Object 2 ourInt Assigned Value: " + object1.ourInt);
		System.out.println("Object 2 ourInt Assigned Value: " + object2.ourInt);
		System.out.println("Called from MyObject class: " + MyObject.ourInt);
		
		
		MyObject object3 = new MyObject();
		
		System.out.println();
		object3.printInstanceMethod();
		//MyObject.printInstanceMethod(); //this line generates an error because printInstanceMethod() is not a static method
		object3.printStaticMethod(); //Called using an instance of the class
		MyObject.printStaticMethod(); //Called using the class name itself
		
		/* uncomment the non-static getters and setters in the MyObject class for this to work
		System.out.println();
		System.out.println("Object 3 ourSecretInt Initial Value: " + object3.getOurSecretInt());
		object3.setOurSecretInt(15);
		System.out.println("Object 3 ourSecretInt Assigned Value: " + object3.getOurSecretInt());
		*/
		
		System.out.println();
		System.out.println("Object 3 ourSecretInt Initial Value: " + MyObject.getOurSecretInt());
		MyObject.setOurSecretInt(20);
		System.out.println("Object 3 ourSecretInt Assigned Value: " + MyObject.getOurSecretInt());
	}
}