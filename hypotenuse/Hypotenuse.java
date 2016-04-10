package hypotenuse;

public class Hypotenuse {

	public static void main(String[] args) {
		double a = 3.0;
		double b = 4.0;
		double hyp = getHypotenuse(a, b);
		System.out.println("The hyptotenuse is "+hyp);
	}
	
	public static double getHypotenuse(double sideA, double sideB) {
		double a2 = sideA*sideA;
		double b2 = sideB*sideB;
		double sum = a2 + b2;
		double h = Math.sqrt(sum);
		return h;
	}

}
