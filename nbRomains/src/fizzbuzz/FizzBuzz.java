package fizzbuzz;

public class FizzBuzz {

	public static String chose(int i) {
		String rep = "";
		if(i%3==0 || i%5==0) {
			if (i%3 == 0) {
				rep += "Fizz";
			}
			if (i%5 == 0) {
				rep += "Buzz";
			}
		} else {
			rep += ""+i;
		}
		return rep;
	}

}