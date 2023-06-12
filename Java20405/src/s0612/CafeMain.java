package s0612;

public class CafeMain {
	public static void main(String[] args) {
		Cafe c1 = new Cafe();
		c1.makeTea(3);
		c1.makeTea(3, 4);
		c1.makeTea(3, 2, 5);
		c1.printCount();

		System.out.println();

		Cafe c2 = new Cafe();
		c2.makeTea(1);
		c2.makeTea(2, 5);
		c2.makeTea(9, 3, 8);
		c2.printCount();

	}

}
