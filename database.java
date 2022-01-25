import java.util.*;
import static java.lang.System.out;
public class database {
	static Scanner input = new Scanner(System.in);
	static ArrayList<String> customers = new ArrayList<String>();
	static ArrayList<ArrayList<String>> reservations = new ArrayList<ArrayList<String>>();


	public static void insertCustomers() {
		out.print("Enter in the customer's name to insert. ");
		String customerName = input.nextLine();
		customers.add(customerName);
		menuBuilder.getCustomerManagementMenu();			
	}
	
	public static void deleteCustomers() {
		
		out.print("List of customers: \n");
		
		for (int i = 0; i<customers.size(); i++) {
			out.println(customers.get(i));
		}
		
		out.print("Which name would you like to delete? ");
		String customerName = input.nextLine();
		customers.remove(customers.indexOf(customerName));
		out.print("Customer \""+customerName+"\" was successfully removed.\n");
		menuBuilder.getCustomerManagementMenu();			
	}
	
	public static void viewCustomers() {
		for (int i = 0; i<customers.size(); i++) {
			out.println(customers.get(i));
		}
		
	}
	
		public static void addReservation() {

			ArrayList<String> individualReservations = new ArrayList<String>();

			out.println("Insert Name: ");
			String customerName = input.nextLine();
			individualReservations.add(customerName);

			out.println("Insert Reservation Time: ");
			String reservationTime = input.nextLine();
			individualReservations.add(reservationTime);
			
			out.println("Insert Phone Number: ");
			String phoneNumber = input.nextLine();
			while(phoneNumber.length()>10 ||phoneNumber.length()<10) {
				out.println("Enter a valid phone number: ");
				phoneNumber = input.nextLine();
			}
			individualReservations.add(phoneNumber);
			
			reservations.add(individualReservations);
			
			out.println("Reservation was successfully added!");
			
		}
		
		public static void updateReservation() {
			ArrayList<String> individualReservations = new ArrayList<String>();
			int i = 0;
			int index = 0;
		
			out.println("Please enter the name of the customer whose reservation you would like to edit: ");
			viewReservations();
			String customerName = input.nextLine();
			while(i<reservations.size()) {
				if(customerName.equals(reservations.get(i).get(0))) {

					for (int j = 0; j<reservations.get(i).size();j++) {
							individualReservations.add(reservations.get(i).get(j));

						}
					
					}
				i++;
					

				
			}
			out.println("What would you like to edit in the reservation? ");
			out.println("1. Name   2. Time   3. Phone Number");
			int m = input.nextInt();
			
			
			if(m==1) {
					out.println("Enter new name");
					String newName = input.next();
					individualReservations.set(0,newName);
					out.println("The new name is "+newName);
					
				
			}else if(m==2) {
				out.println("Enter new reservation time");
				String newReservation = input.next();
				individualReservations.set(1,newReservation);
				out.println("The new name is "+newReservation);
				
			}else if(m==3) {
				out.println("Enter new phone number:");
				String newNum = input.next();
				individualReservations.set(2,newNum);
				out.println("The new name is "+newNum);
				
			}
			

			reservations.add(i,individualReservations);
			i=0;
			
			while(i<reservations.size()) {
				if(customerName.equals(reservations.get(i).get(0))) {

					reservations.remove(i);
					
					}
				i++;
				
			}

			//reservations.remove(i);
			
		}
		public static void cancelReservation() {

			out.println("Please enter the name of the customer whose reservation you would like to cancel: ");
			viewReservations();
			String customerName = input.nextLine();
			//ArrayList<String> individualReservations = new ArrayList<String>();
			for (int i = 0; i<reservations.size();i++) {

					if(customerName.equals(reservations.get(i).get(0))) {					
						reservations.remove(i);
						out.println("Reservation was successfully removed!");

					}
				}
				//if(individualReservations.get(0)==customerName) {
				//	reservations.remove(i);
				//}
			
		}
				
		public static void viewReservations() {
			
			if(reservations.size()>0) {
				for (int i = 0; i<reservations.size();i++) {
					ArrayList<String> individualReservations = new ArrayList<String>();

					for (int j = 0; j<reservations.get(i).size();j++) {
						individualReservations.add(reservations.get(i).get(j));
					
					}
					out.println(" Name: "+individualReservations.get(0)+"\n Reservation Time: "+individualReservations.get(1)+"\n Phone Number: "+individualReservations.get(2));
				}
			}
		}
	
}
