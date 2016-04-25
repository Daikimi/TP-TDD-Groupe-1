package nbRom;

public class nbRom {

	public static String change(int i) {
		int nbACalculer, diviseur, nbPresent, fois;
		String nbString;
		
		nbACalculer = i;
		nbString = "";
		diviseur = 1000;
		nbPresent = 0;
		fois = 0;
		
		while (nbACalculer != 0 || diviseur != 1) {
			
			nbPresent = nbACalculer / diviseur;
			for (int x =0; x < nbPresent; x++) {
				if(nbPresent == 4) {
					nbString += traduction(diviseur);
					nbString += traduction(5*diviseur);
					nbACalculer -= diviseur*4;
					nbPresent = 1;
				} else {
				nbString += traduction(diviseur);
				nbACalculer -= diviseur;
				}
			}
	
			if (fois%2 == 0) {
				diviseur /= 2;
				fois++;
			} else {
				diviseur /= 5;
				fois++;
			}
			if (diviseur == 0) {
				return nbString;
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