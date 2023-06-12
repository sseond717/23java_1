package s0612;

public class Car {
	String carname, color = "검정색";
	private int velocity;

	void speedUp() {
		velocity += 5;
	}

	void speedDown() {
		velocity -= 5;
	}
}
