package s0612;

public class EngHello extends Greeting{
	public String name = "Kim Hyun Kang";

	public void sayHello() {
		System.out.println(name +" Hello");
	}
	public void sayGreeting() {
		super.sayHello();
	}

	public static void main(String[] args) {
		EngHello eng = new EngHello();
		eng.sayHello();
		eng.sayGreeting();
		
		// eng.test();
	}
}