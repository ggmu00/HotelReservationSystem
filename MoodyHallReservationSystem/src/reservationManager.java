import java.util.*;
import static java.lang.System.out;
public class reservationManager {
	public static void getReservationOptions(int m) {
		 database db = new database();

		if(m==1) {
			db.addReservation();
		}else if(m==2) {
			db.updateReservation();

		}else if(m==3) {
			db.cancelReservation();

		}else if(m==4) {
			db.viewReservations();

		}
		
		
	}
}
