package nbRom;

public class nbRom {

	public static String change(int i) {
		int nbACalculer, diviseur, nbPresent, fois;
		nbACalculer = i;
		String nbString = "";
		diviseur = 1000;
		nbPresent = 0;
		fois = 0;
		
		while (nbACalculer != 0) {
			
			nbPresent = nbACalculer%diviseur;
			for (int x =0; x < nbPresent; x++) {
				nbString += traduction(diviseur);
				nbACalculer = nbACalculer - diviseur;
			}
		}
		
		return nbString;
	}
	public static String traduction(int i) {
		if (i == 1000) {
			return "M";
		}
		if (i == 500) {
			return "D";
		}
		if (i == 100) {
			return "C";
		}
		if (i == 50) {
			return "L";
		}
		if (i == 10) {
			return "X";
		}
		if (i == 5) {
			return "V";
		} else {
			return "I";
		}
	}
}