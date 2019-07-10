import java.util.*;

public class MovieMethods {

	public static String switchCategory(int userInput) {
		String category = "";
		switch (userInput) {
		case 1:
			category = "animated";
			break;
		case 2:
			category = "comedy";
			break;
		case 3:
			category = "drama";
			break;
		case 4:
			category = "horror";
			break;
		case 5:
			category = "musical";
			break;
		case 6:
			category = "scifi";
			break;
		}
		return category;
	}

	public static boolean keepGoing(Scanner scan) {
		boolean checkout = true;
		String prompt = "Continue? (y/n): ";
		String answer = ValidationMethods.getString2(scan, prompt);
		if (answer.equals("n")) {
			checkout = false;
		}
		return checkout;
	}

}
