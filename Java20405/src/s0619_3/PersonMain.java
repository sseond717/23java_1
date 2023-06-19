package s0619_3;

public class PersonMain {
	public static void main(String[] args) {
		Student s1 = new Student();
		SoccerPlayer s2 = new SoccerPlayer();
		s1.name= "염미정"; s1.age = 23; s1.online = true;
		s2.name= "구자경"; s2.age = 28; s2.teamName = "서울FC";
		s1.printInfo();
		s2.printInfo();
	}
}
