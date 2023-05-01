package s0501;

public class Car {
	// 속성
	String owner, color; // 소유자, 색깔
	int speed, km;// 속도, 주행거리
	static int count;
	// 생성자(생략가능)---------------------------------------

	Car() {
		count++;
		System.out.println("총 자의 대수 : " + count);
	}

	Car(String name) {
		owner = name;
		count++;
		System.out.println("총 자의 대수 : " + count);
	}

	Car(String name, String col, int speed) {
		owner = name;
		color = col;
		this.speed = speed;
		count++;
		System.out.println("총 자의 대수 : " + count);
	}

	// 메소드 : 주행거리를 10씩 올린다.
	void run() {
		km += 10;
	}

	// 주행 속도를 0으로 바꾸고
	// 현재까지의 주행 거리를 출력한다.
	void stop() {
		speed = 0;
		System.out.println(owner + "의 차는 " + km + "를 달렸습니다.");
	}

	void speedUp() {// 속도를 5씩 올린다.
		speed += 5;
		System.out.println(owner + "의 현재속도는 " + speed + "입니다.");
		km += 2;
		System.out.println(owner + "의 주행거리는 " + km + "입니다.");
	}

	void speedDown() {// 속도를 5씩 내린다.
		speed -= 5;
		System.out.println(owner + "의 현재속도는 " + speed + "입니다.");
	}

	void printCarInFo() {
		System.out.println("소유자" + " : " + owner);
		System.out.println("색 상" + " : " + color);
		System.out.println("현재속도" + " : " + speed);
		System.out.println("주행거리" + " : " + km);

	}
}
