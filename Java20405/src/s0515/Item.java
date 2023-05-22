package s0515;

public class Item {
	// 상품을 관리하는 클래스
	// 상품 이름, 가격
	String name;
	int price;
	int storege = 128;
	int ram = 4;
	int total_price;

	// 생성자
	Item() {
	}

	Item(String p1, int pri) {
		name = "제품명 : " + p1;// 초기화
		price = pri * 1000;

	}

	// 메소드
	void printItemInfo() {
		System.out.println(name + "\n출고가 : " + price + "\n저장공간 : " + storege + "\n램 : " + ram);
	}

	void payment() {
		total_price = total_price + price;
		System.out.println("최종금액 : " + total_price + "원");
	}

	void upgradeRam() {
		ram++;
		System.out.println("램 업그레이드 추가 비용 : 2만원");
		total_price += 20000;

	}

	void upgradeStorege() {
		storege = storege * 2;
		System.out.println("저장공간 업그레이드 추가 비용 : 10만원");
		total_price += 100000;
	}
}