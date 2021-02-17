package _05_netflix;

public class NetflixRunner {
	public static void main(String[] args) {
		Movie m1 = new Movie("Madagascar", 4);
		Movie m2 = new Movie("The Sea of Monsters", 2);
		Movie m3 = new Movie("Soul", 5);
		Movie m4 = new Movie("Frozen 2", 3);
		Movie m5 = new Movie("Iron Man 3", 5);
		System.out.println(m1.getTicketPrice());
		NetflixQueue n = new NetflixQueue();
		n.addMovie(m1);
		n.addMovie(m2);
		n.addMovie(m3);
		n.addMovie(m4);
		n.addMovie(m5);
		n.printMovies();
		n.sortMoviesByRating();
	}
}
