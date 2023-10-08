public class College {
   
   
    private static int totalColleges;
    private static String defaultLocation;
    private static double averageGPA;

    
    private String name;
    private String location;
    private int establishedYear;
    private int numberOfStudents;
    private String accreditation;
    private String dean;
    private String phoneNumber;

    public College(String name, String location, int establishedYear,
                   int numberOfStudents, String accreditation, String dean,
                   String phoneNumber) {
        this.name = name;
        this.location = location;
        this.establishedYear = establishedYear;
        this.numberOfStudents = numberOfStudents;
        this.accreditation = accreditation;
        this.dean = dean;
        this.phoneNumber = phoneNumber;
    }
   
   
    static {
        totalColleges = 500;
        defaultLocation = "City";
        averageGPA = 3.5;
    }

    public static void main(String[] args) {
        College harvard = new College("Harvard University", "Cambridge, MA", 1636, 22000,
                                      "NEASC", "John Doe", "+1 (123) 456-7890");

        System.out.println("Total Colleges: " + College.totalColleges);
        System.out.println("Default Location: " + College.defaultLocation);
        System.out.println("Average GPA: " + College.averageGPA);
        System.out.println("College Name: " + harvard.name);
        System.out.println("Location: " + harvard.location);
        System.out.println("Established Year: " + harvard.establishedYear);
        System.out.println("Number of Students: " + harvard.numberOfStudents);
        System.out.println("Accreditation: " + harvard.accreditation);
        System.out.println("Dean: " + harvard.dean);
        System.out.println("Phone Number: " + harvard.phoneNumber);
		
		College mit = new College("Massachusetts Institute of Technology", "Cambridge, MA", 1861, 11000,
                                   "NEASC", "Jane Smith", "+1 (987) 654-3210");
								 
		System.out.println("Total Colleges: " + College.totalColleges);
        System.out.println("Default Location: " + College.defaultLocation);
        System.out.println("Average GPA: " + College.averageGPA);
        System.out.println("College Name: " + mit.name);
        System.out.println("Location: " + mit.location);
        System.out.println("Established Year: " + mit.establishedYear);
        System.out.println("Number of Students: " + mit.numberOfStudents);
        System.out.println("Accreditation: " + mit.accreditation);
        System.out.println("Dean: " + mit.dean);
        System.out.println("Phone Number: " + mit.phoneNumber);
		
		College stanford = new College("Stanford University", "Stanford, CA", 1885, 17000,
                                       "WASC", "David Johnson", "+1 (555) 123-4567");
	    
		System.out.println("Total Colleges: " + College.totalColleges);
        System.out.println("Default Location: " + College.defaultLocation);
        System.out.println("Average GPA: " + College.averageGPA);
        System.out.println("College Name: " + stanford.name);
        System.out.println("Location: " + stanford.location);
        System.out.println("Established Year: " + stanford.establishedYear);
        System.out.println("Number of Students: " + stanford.numberOfStudents);
        System.out.println("Accreditation: " + stanford.accreditation);
        System.out.println("Dean: " + stanford.dean);
        System.out.println("Phone Number: " + stanford.phoneNumber);

    }
}
