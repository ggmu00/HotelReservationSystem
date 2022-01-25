import java.util.*;
import static java.lang.System.out;
public class menuBuilder {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String [] args) {
		
		while(true) {
			int menu = menuBuilder.getMainMenu();
			if(menu == 1) {
				menu = menuBuilder.getCustomerManagementMenu();
				if(menu==4) {
					continue;
				}
			}else if(menu == 2) {
				menu = menuBuilder.getReservationManagementMenu();
				if(menu==5) {
					continue;
				}
			}else if(menu == 3) {
				out.print("Thank you for using.");
				System.exit(0);
			}

		}
		
	}
	
	public static int getMainMenu() {
		
		out.println("[MAIN MENU] 1. Customer Management   2. Reservation Management   3. Exit");
		int m = input.nextInt();
		if(m>0&&m<4) {
			return m;
		}else {
			out.print("Enter a valid number.");
		}
		
		return -1;
	}
	
	public static int getCustomerManagementMenu() {
		
		customerMangaer cm = new customerMangaer();
		
		out.println("[CUSTOMER MENU] 1. Insert   2. Delete 3. View Customers  4. Back");
		int m = input.nextInt();
		if(m>0&&m<5) {
			cm.getCustomerOptions(m);
			return m;
		}else {
			out.print("Enter a valid number.");
		}
		return -1;
	}
	public static int getReservationManagementMenu() {
		
		reservationManager rm = new reservationManager();
		
		out.println("[RESERVATIONS MENU] 1. Reserve   2. Update   3. Cancel   4. See all reservations   5. Back");
		int m = input.nextInt();
		if(m>0&&m<6) {
			rm.getReservationOptions(m);
			return m;
		}else {
			out.print("Enter a valid number.");
		}
		
		return -1;
	}
}
