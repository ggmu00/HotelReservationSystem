import java.util.*;
import static java.lang.System.out;
public class customerMangaer {
	ArrayList<String> customers = new ArrayList<String>();
	
	static Scanner input = new Scanner(System.in);
	static database db = new database();
	
	public static void getCustomerOptions(int m) {
		
		if(m == 1) {
			db.insertCustomers();
		}else if(m == 2) {
			db.deleteCustomers();
		}
		else if(m == 3) {
			db.viewCustomers();
		}
		
	}

	

}
