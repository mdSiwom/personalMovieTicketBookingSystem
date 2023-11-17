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

		

		/* 
		do {
			System.out.println("------------------------------------");
			System.out.println(":Movie Ticket Booking System:");
			System.out.println("------------------------------------\n");
			System.out.println("Please Enter 1 to Book a Show");
			System.out.println("Please Enter 2 to Display Shows");
			System.out.println("Please Enter 3 to Cancel Booking");
			System.out.println("Please Enter 4 to Exit\n");

			System.out.print("Enter Option: ");
			option = select.nextInt();

			if (option == 1) {
				System.out.println("BOOK A SHOW Selected");
				System.out.println("-------------------------\n");
				Random rnd = new Random();
				int costumerId = rnd.nextInt(999);
				Customer customer = new Customer(costumerId);
				customers.add(customer);
				for (int i = 0; i < shows.size(); i++) {
					int showNumber = i + 1;
					System.out.println("Show Number: " + showNumber);
					System.out.println("Show Name:   " + shows.get(i).getShowName());
					System.out.println("Show Date:   " + shows.get(i).getShowDate());
					System.out.print("\n");
				}
				System.out.println("-------------------------");
				System.out.print("Enter the show number: ");
				int showNumber = choice.nextInt();
				int repeat = 0;
				System.out.println();

				//will print seatplan and execute options for that
				do {
					shows.get(showNumber - 1).getTheatre().printSeatPlan();
					System.out.print("Enter the row: ");
					int selectedRow = choice.nextInt();
					System.out.print("Enter the seat: ");
					int selectedSeat = choice.nextInt();
					System.out.println();
					Booking booking = new Booking(customer, shows.get(showNumber - 1));
					if (booking.reserveSeat(selectedRow - 1, selectedSeat - 1)) {
						bookings.add(booking);
						System.out.println("The seat is now reserved for you.");
					} else {
						System.out.println("Sorry the seat is already reserved.");
					}
					System.out.println();
					System.out.print("Enter 1 to reserve another seat or 2 to check out: ");
					repeat = choice.nextInt();
				} while (repeat == 1);
				System.out.println();
				System.out.println("Your Bill");
				System.out.println("-------------------------");
				int totalCost = 0;
				for (Booking booking : bookings) {
					if (booking.getCostumer().getId() == customer.getId()) {
						totalCost += booking.getCost();
					}
				}
				System.out.println("Costumer ID: " + customer.getId());
				System.out.println("Total costs: " + totalCost + " Euro");
				System.out.println();
			} else if (option == 2) {
				System.out.println("DISPLAY SHOWS Selected");
				System.out.println("-------------------------\n");
				for (int i = 0; i < shows.size(); i++) {
					int showNumber = i + 1;
					System.out.println("Show Number: " + showNumber);
					System.out.println("Show Name: " + shows.get(i).getShowName());
					System.out.println("Show Date: " + shows.get(i).getShowDate());
					// System.out.println("Seat Status:" + shows.get(i).getFreeSeatsCount());
					System.out.println("\n");
				}
				System.out.println("End of Show List.\n");
			} else if (option == 3) {
				System.out.println("CANCEL BOOKING Selected");
				System.out.println("-------------------------\n");
				System.out.print("Enter the costumer id: ");
				int customerId = choice.nextInt();
				for (Customer customer : customers) {
					if (customer.getId() == customerId) {
						for (Booking booking : bookings) {
							if (booking.getCostumer().getId() == customer.getId()) {
								if (booking.unreserveSeat()) {

								}
							}
						}
						System.out.println("Your reservation has been canceled!");
					}
				}
				System.out.println();
			} else if (option == 4) {
				System.exit(0);
			}
		} while (true);
		*/
	}
}