package model;

public class MyObject {
	//class variables exist outside instances
	//it is created the moment the program starts, and is destroyed the moment the program ends
	//it is shared across objects 
	public static int ourInt; //ourInt is a class variable
	public static final int ourFinalInt = 0; //ourFinalInt is also a class variable
	//final variables must be initialized
	
	private static int ourSecretInt = 5;
	
	public int myInt; //myInt is an instance variable
	
	public void printInstanceMethod() { //can only be called by creating an instance of the class
		System.out.println("printInstanceMethod() is not a static method.");
		System.out.println("printInstanceMethod() needs an object to be able to be invoked.");
		System.out.println();
	}
	
	public static void printStaticMethod() { //can be called even without creating an instance of the class
		System.out.println("printStaticMethod() is a static method.");
		System.out.println("printStaticMethod() does not need an object to be able to be invoked.");
		System.out.println();
	}
	
	//this works as well, but its better to give static/class variables static getters and setters as well
	//public void setOurSecretInt(int number) { ourSecretInt = number; }
	//public int getOurSecretInt() { return ourSecretInt; }
	
	public static void setOurSecretInt(int number) { ourSecretInt = number; }
	public static int getOurSecretInt() { return ourSecretInt; }
}
