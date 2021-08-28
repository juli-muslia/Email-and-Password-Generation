import java.util.Scanner;

public class Email {
	private String fname;
	private String lname;
	private String password;
	private String email;
	private String department;
	private int mailsize = 1024;
	private String emailalternatives;
	private String domainKompanie ="kompania.com";

	public Email(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
		System.out.println("Emaili u krijua: " + this.fname + " " + this.lname);

		this.department = setDepartment();
		System.out.println("Departamenti i zgjedhur: " + this.department);
		
		this.password = passwordGenerator(10);
		System.out.println("Passwordi i gjeneruar: " + this.password);
		
		// gjenerimi i emailit 
		email = fname.toLowerCase() + "."+ lname.toLowerCase() + "@"+ department.toLowerCase() +"."+ domainKompanie;
		System.out.println("Emaili i gjeneruar: " +email);
		
		System.out.println("=========================================");
		
	}

	// vendosja e departamentit
	private String setDepartment() {
		System.out.println(
				"Shkruani Departamentin:  \n 1- Shitje \n 2- Adwords \n 3- Web Development \n 4- Virtual Tour");
		Scanner sc = new Scanner(System.in);
		int zgjedhjaDep = sc.nextInt();
		if (zgjedhjaDep == 1) {
			return "Shitje";
		} else if (zgjedhjaDep == 2) {
			return "Adwords";
		} else if (zgjedhjaDep == 3) {
			return "Web-Development";
		} else if (zgjedhjaDep == 4) {
			return "Virtual-Tour";
		} else
			return "";
	}
	// Gjenerimi i passwordit 

	private String passwordGenerator( int length) {

		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());

			password[i] = passwordSet.charAt(rand);

		}

		return new String (password);

	}
	
	// madhesia e emailit
	public void setMailSize (int capacity) {
		this.mailsize = capacity; 
	}
	
	public void setAlternativeEmail (String alternativeEmail) {
		this.emailalternatives = alternativeEmail;
	}
	public void changePassword (String password) {
		this.password = password;
	}
	
	public int getMailSize() {
		return mailsize;
	}
	public String getAlternativeEmail () {
		return emailalternatives;
	}
	
	public String getPassword () {
		return password;
	}
	
	public String showInfo() {
		return "Emri:" + fname +" "+ lname +
				"\nEmaili: " + email +
				"\nKapaciteti i emailit: " + mailsize +"mb";
	}
}
