
public class HorseBarn {

	private Horse[] spaces;
	
	public HorseBarn(int numStalls) {
		spaces = new Horse[numStalls];
	}
	
	public void assignStall(int stall, Horse h) {
		if (spaces[stall]==null) {
			spaces[stall] = h;
		} // should there be an else??
	}	
	
	public void rollCall() {
		for (Horse h: spaces) {
			System.out.println(h.getName());
		}
	}
}