package com.PackageAccesModifiers;

//Step1:When variables and methods are declared private, they cannot be accessed outside of the class
//Step2:But we can access  use the getters and setters method.
class Test1{
	private String name;
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class PrivateModifiers {

	public static void main(String[] main){
		Test1 t = new Test1();

        // access the private variable using the getter and setter
        t.setName("Hello Private Acces Modifiers");
        
        System.out.println(t.getName());
        System.out.println("\nPrivate:\nStep1:When variables and methods are declared private,\n they cannot be accessed outside of the class\r\nStep2:But we can access  use the getters and setters method.");
    }

}
