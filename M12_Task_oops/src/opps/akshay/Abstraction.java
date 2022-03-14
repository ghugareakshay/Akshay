package opps.akshay;

abstract class Test{
	abstract void show();
}

public class Abstraction extends Test
{
void show()
{
System.out.println("This is Abstraction");
}

 public static void main(String[] args)
 {
	 Abstraction a=new Abstraction();
a.show();

}
}

