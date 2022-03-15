package com.PackageAccesModifiers;

class Test2 {
    
    protected void display() {
        System.out.println("Hello Protected Access Modifiers");
        System.out.println("\nProtected :\nWhen methods and data members are declared protected,\n we can access them within \n the same package as well as from subclasses");
    }
}

class ProtectedModifiers extends Test2 {
    public static void main(String[] args) {

        
        Test2 t = new Test2();
        
        t.display();
    }
}
