
import java.util.*;

public class Theatre {
	private int theatreNumber;
	private String description;
	private int rowCount;
	private ArrayList<Row> rows;

	public Theatre(int theatreNumber, String description) {
		this.description = description;
		this.theatreNumber = theatreNumber;
		rows = new ArrayList<Row>();
	}

	public void createRows(int rowClass, int seatCount, int rowCount) {
		for (int i = 1; i <= rowCount; i++) {
			rows.add(new Row(rowClass, seatCount, i));
		}
		this.rowCount += rowCount;
	}

	public ArrayList<Row> getRows() {
		return rows;
	}

	public String getDescription() {
		return description;
	}

	public String printSeatPlan() {
		// determining max seats
		int maxSeatsInRow = 0;
		String str = "";
		for (Row row : getRows()) {
			if (row.getSeats().size() > maxSeatsInRow) {
				maxSeatsInRow = row.getSeats().size();
			}
		}
		// printing starts
		str += "Seats Option :" + "\n\n\n";
		str += "   |";
		for (int i = 1; i <= maxSeatsInRow; i++) {
			str += " " + i;
		}
		str += "\n";
		str += "----";
		for (int i = 1; i <= maxSeatsInRow; i++) {
			if (i > 9) {
				str += "---";
			} else {
				str += "--";
			}
		}

		str += "\n";
		for (Row row : getRows()) {
			if (row.getRowNumber() > 9) {
				str += row.getRowNumber() + " | ";
			} else {
				str += row.getRowNumber() + "  | ";
			}
			for (Seat seat : row.getSeats()) {

				if (seat.getReservationStatus()) {
					str += "X ";
				} else {
					str += seat.getSeatNumber() + " ";
				}
			}
			str += "\n";
		}
		return str;
	}
}
