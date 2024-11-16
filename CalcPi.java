// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int calc = Integer.parseInt(args[0]);
		double divider = 3.0;
		double sum = 1.0;
		int counter = 1;
		boolean possitiveOrNegative = false;

		while (counter < calc) {
			if (possitiveOrNegative == false){
			sum = sum - (1 / divider);
			possitiveOrNegative = true;	
			} else {
				sum = sum + (1 / divider);
				possitiveOrNegative = false;
			}
             counter ++;
			 divider = divider + 2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi according to Java:    " + 4.0 * sum);

	}
}
