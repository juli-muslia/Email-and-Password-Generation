import java.util.Scanner;

public class Application {
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Vendosni Emrin: ");
	 String emri = sc.next();
	 System.out.println("Vendosni mbiemrin: ");
	 String mbiemri = sc.next();
	 
	 
	Email email = new Email(emri, mbiemri);
	
	System.out.println(email.showInfo());
}
}
