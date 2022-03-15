package com.PackageAccesModifiers;

class Test3 {
    
    public String scope;

    
    public void display() {
        System.out.println("Hello Public Access Modifiers");
        System.out.println("\nit access " + scope);
        System.out.println("\nit Use With:\n methods, variables, classes"+"\n"+"Restriction:\nThe public access modifier has no scope restriction");
    }
}


public class PublicModifiers {
    public static void main( String[] args ) {
        
       Test3 t = new Test3();

        
        t.scope = "Every Where";
       
        t.display();
    }
}
