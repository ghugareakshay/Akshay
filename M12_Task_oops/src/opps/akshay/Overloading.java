package opps.akshay;

public class Overloading {

     public void m1(int x) {
    	 System.out.println(x);
    	 return;
    	 
     }
     public String m1(String s){
    	 System.out.println(s);
    	 return s;
     }
     
	public static void main(String[] args) {
		Overloading obj = new Overloading();
        obj.m1(10);
        obj.m1("Aditya");
        
		
        
		
	}

}
