import java.util.*;

public class MovieApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean checkout = true;

		ArrayList<Movie> movieList = new ArrayList<>();

		movieList.add(new Movie("The Aristocats", "animated"));
		movieList.add(new Movie("Lawrence of Arabia", "drama"));
		movieList.add(new Movie("The Shining", "horror"));
		movieList.add(new Movie("Ninja Scroll", "animated"));
		movieList.add(new Movie("12 Monkeys", "scifi"));
		movieList.add(new Movie("Goodfellas", "drama"));
		movieList.add(new Movie("Primer", "scifi"));
		movieList.add(new Movie("Pulp Fiction", "drama"));
		movieList.add(new Movie("Balto", "animated"));
		movieList.add(new Movie("Scanners", "scifi"));

		ArrayList<String> horror = new ArrayList<>();
		ArrayList<String> drama = new ArrayList<>();
		ArrayList<String> scifi = new ArrayList<>();
		ArrayList<String> musical = new ArrayList<>();
		ArrayList<String> animated = new ArrayList<>();
		ArrayList<String> comedy = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			Movie temp = Movie.getMovie(i);
			String category = temp.getCategory();
			String title = temp.getTitle();
			if (category.equals("horror")) {
				horror.add(title);
			} else if (category.equals("drama")) {
				drama.add(title);
			} else if (category.equals("scifi")) {
				scifi.add(title);
			} else if (category.equals("musical")) {
				musical.add(title);
			} else if (category.equals("animated")) {
				animated.add(title);
			} else if (category.equals("comedy")) {
				comedy.add(title);
			}
		}
		Collections.sort(horror);
		Collections.sort(drama);
		Collections.sort(scifi);
		Collections.sort(musical);
		Collections.sort(animated);
		Collections.sort(comedy);

		Set<String> categories = new HashSet<>();
		for (int i = 1; i <= 100; i++) {
			Movie temp = Movie.getMovie(i);
			String category = temp.getCategory();
			categories.add(category);
		}
		ArrayList<String> catArray = new ArrayList<>();
		catArray.addAll(categories);
		Collections.sort(catArray);

		for (int i = 0; i < catArray.size(); i++) {
			System.out.println(i + 1 + ". " + catArray.get(i));
		}
		System.out.println("\nWelcome to the Movie List Application!\n");
		System.out.println("There are 100 movies in this list.");

		do {
			int userInput = ValidationMethods.getRangeInt(scan, "What category are you interested in? ", 1, 6,
					"Enter a number between 1 and 6");
			String category = MovieMethods.switchCategory(userInput);
			/// HERE
			if (category.equals("horror")) {
				for (String each : horror) {
					System.out.println(each);
				}
			} else if (category.equals("musical")) {
				for (String each : musical) {
					System.out.println(each);
				}
			} else if (category.equals("animated")) {
				for (String each : animated) {
					System.out.println(each);
				}
			} else if (category.equals("drama")) {
				for (String each : drama) {
					System.out.println(each);
				}
			} else if (category.equals("scifi")) {
				for (String each : scifi) {
					System.out.println(each);
				}
			} else if (category.equals("comedy")) {
				for (String each : comedy) {
					System.out.println(each);
				}
			}

			checkout = MovieMethods.keepGoing(scan);
		} while (checkout == true);
		System.out.println("Goodbye!");

	}

}
