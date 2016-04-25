package nbRom;

public class nbRom {

	public static String change(int i) {
		int nbACalculer, diviseur, nbPresent, fois, occurC, occurX, occurI;
		String nbString, nbStringFinal;
		nbACalculer = i;
		nbString = "";
		diviseur = 1000;
		nbPresent = 0;
		fois = 0;
		
		while (nbACalculer != 0) {
			
			nbPresent = nbACalculer / diviseur;
			for (int x =0; x < nbPresent; x++) {
				nbString += traduction(diviseur);
				nbACalculer = nbACalculer - diviseur;
			}
			if (fois%2 == 0) {
				diviseur /= 2;
				fois++;
			} else {
				diviseur /= 5;
				fois++;
			}
		}
	
		/*if (nbString.length() >= 4) {
	
			for (int z = 0; z < nbString.length()-3; z++) {
				String temp=nbString.substring(z,z+3);
				if (temp.matches("CCCC")) {
					
				}
				if (temp.matches("XXXX")) {
					
				}
				if (temp.matches("IIII")) {
					
				}
			}
		}*/
				
		
		return nbStringFinal;
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