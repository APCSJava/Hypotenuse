
public class HorseBarnTester {

	public static void main(String[] args) {
		HorseBarn barn = new HorseBarn(10);
		Horse h1 = new Horse("Julie", 1574.0);
		Horse h2 = new Horse("Pedro", 1256.5);
		barn.assignStall(3, h1);
		barn.assignStall(7, h2);
		barn.rollCall();
	}

}
