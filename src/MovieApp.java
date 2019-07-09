import java.util.*;

public class MovieApp {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean checkout = true;
		ArrayList<Movie> movieList = makeList();
		System.out.println("\nWelcome to the Movie List Application!\n");
		System.out.println("There are 10 movies in this list.");
		
		do {
		String userInput = ValidationMethods.getString(scan, "What category are you interested in? ");
		for(int i = 0; i < 10; i++) {
			if (userInput.equals(movieList.get(i).getCategory())) {
				System.out.println(movieList.get(i).getTitle());
			}
		}
		
		checkout = Movie.keepGoing(scan);
		} while (checkout == true);
		System.out.println("Goodbye!");
	}
	
	public static ArrayList<Movie> makeList(){
		ArrayList <Movie> movieList = new ArrayList<>();
			
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
			
		return movieList;
		}
}
//		System.out.println(Movie.getMovie(2));
//		Movie test = Movie.getMovie(5);
//		String catTest = test.getCategory();
//		System.out.println(catTest);
//		
//		
//		Set<String> categories = new HashSet<>();
//		for (int i = 1; i <= 100; i++) {
//			Movie temp = Movie.getMovie(i);
//			String category = temp.getCategory();
//			categories.add(category);
//		}
//		ArrayList<String> catArray = new ArrayList<>();
//		catArray.addAll(categories);
//		Collections.sort(catArray);
//		
//		for(int i = 0; i < catArray.size(); i++) {
//			System.out.println(i + 1 + ". " + catArray.get(i));
//		}
//		
//		ArrayList<String> titles = new ArrayList<>();
//		for (int i = 1; i <= 100; i++) {
//			Movie temp = Movie.getMovie(i);
//			String title = temp.getTitle();
//			titles.add(title);
//			Collections.sort(titles);
//		}
//		for (String title : titles) {
//			System.out.println(title);
//		}




