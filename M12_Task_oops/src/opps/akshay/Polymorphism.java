package opps.akshay;

public class Polymorphism {

	void marry1() {
		System.out.println("Your first choice  wife:"+"Pooja");
	}
	void marry2() {
		System.out.println("Your second choice  wife:"+"Archana");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Akshay select your future object: ");
		Polymorphism p= new Polymorphism();
		p.marry1();
		p.marry2();

	}

}
