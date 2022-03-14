package opps.akshay;

 class Game{ 
	void play() {
		System.out.println("Cricket");
	}
}

public class Overriding extends Game {
      void play() {
    	       System.out.println("FootBall");}  
	
      public static void main(String[] args) {
		Overriding obj = new Overriding();
		obj.play();
		
		
	}
}
      
        
		
        
		
