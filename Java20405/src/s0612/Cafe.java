package s0612;

public class Cafe {
	private int coffee, sugar, cream;

	private static int count = 0;

	int getCount() {
		return count;
	}

	void setCount() {
		this.count = count;
	}

	public void makeTea(int coffee) {
		count++;
		System.out.println("블랙커피 " + (coffee));
		this.coffee = coffee;

	}

	public void makeTea(int coffee, int sugar) {
		count++;
		System.out.println("설탕커피 " + (coffee + sugar));
		this.coffee = coffee;
		this.sugar = sugar;
	}

	public void makeTea(int coffe, int sugar, int cream) {
		count++;
		System.out.println("밀크커피 " + (coffee + sugar + cream));
		this.coffee = coffe;
		this.sugar = sugar;
		this.cream = cream;
	}

	public void printCount() {
		System.out.println("총 판매 수량 : " + count);
	}

}
