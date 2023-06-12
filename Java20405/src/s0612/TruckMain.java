package s0612;

public class TruckMain {
	public static void main(String[] args) {
		Truck truck = new Truck();
		truck.carname = "프론티어";
		truck.color = "파랑";
		truck.ton = 5;
		truck.speedUp();
		System.out.println(truck.carname + "은 " + truck.color + "이고 " + truck.ton + "톤이다");
	}
}

