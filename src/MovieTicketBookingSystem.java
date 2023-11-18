import java.util.*;

public class MovieTicketBookingSystem {
	public static void main(String[] args) {

		ArrayList<Show> shows = new ArrayList<Show>();
		ArrayList<Theatre> theatres = new ArrayList<Theatre>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		ArrayList<Customer> customers = new ArrayList<Customer>();

		// Test Objects
		Theatre testTheatre1 = new Theatre(1, "Main Theatre");
		Theatre testTheatre2 = new Theatre(2, "Royal Theatre");
		Theatre testTheatre3 = new Theatre(3, "Platinum Theatre");
		testTheatre1.createRows(1, 10, 10);
		testTheatre2.createRows(1, 10, 7);
		testTheatre3.createRows(1, 10, 8);
		theatres.add(testTheatre1);
		theatres.add(testTheatre2);
		theatres.add(testTheatre3);
		shows.add(new Show("jawan - Film", "21.11.2023", theatres.get(0)));
		shows.add(new Show("oppenheimer - Film", "22.11.2023", theatres.get(1)));
		shows.add(new Show("Barbie - Film", "23.11.2023", theatres.get(2)));

		//GUI implementation
		IDandPasswords idandPasswords = new IDandPasswords();
		LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo(), shows, theatres, bookings, customers);

	}
}