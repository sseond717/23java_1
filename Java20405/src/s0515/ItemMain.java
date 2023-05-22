package s0515;

public class ItemMain {

	public static void main(String[] args) {
		Item phone = new Item("갤럭시 22+", 900);
		phone.printItemInfo();

		Item phone2 = new Item("Iphone 15", 1500);
		phone2.printItemInfo();

		Item galaxy = new Item("폴드 4", 2000);
		galaxy.upgradeRam();
		galaxy.printItemInfo();

		Item Iphone = new Item("Iphone 15 pro max", 2200);
		Iphone.upgradeStorege();
		Iphone.upgradeStorege();
		Iphone.upgradeStorege();
		Iphone.upgradeRam();
		Iphone.upgradeRam();
		Iphone.upgradeRam();
		Iphone.upgradeRam();
		Iphone.upgradeRam();
		Iphone.upgradeRam();
		Iphone.upgradeRam();
		Iphone.upgradeRam();
		Iphone.upgradeRam();
		Iphone.upgradeRam();
		Iphone.upgradeRam();
		Iphone.printItemInfo();
		Iphone.payment();

	}

}