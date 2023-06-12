package s0612;

public class Leader extends Student{
	boolean lead;
	
	Leader(boolean lead) {
		this.lead= lead;
	}
	Leader() {}
	Leader(String name, String hakbun, boolean lead) {
		super(name, hakbun);
		//this.name = name;
		//this.hakbun = hakbun;
		this.lead = lead;
	}
	void isLeader() {
		if(lead == true)
			System.out.println(name + "은(는) 학급회장");
		else
			System.out.println(name + "은(는) 평민");
	}
	
}
