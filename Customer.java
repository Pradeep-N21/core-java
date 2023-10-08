public class Customer {

    private static String companyName;
    private static String defaultCountry;
    private static double averagePurchaseAmount;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private int customerID;
    private double purchaseAmount;

    static {
        companyName = "Amazon";
        defaultCountry = "India";
        averagePurchaseAmount = 100.0;
    }

    public Customer(String firstName, String lastName, String email, String phoneNumber, String address, double purchaseAmount,int customerID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.purchaseAmount = purchaseAmount;
        this.customerID = customerID;
    }

    public static void main(String[] args) {
        Customer john = new Customer("John", "Doe", "john@example.com", "+1 (123) 456-7890", "123 Main St", 150.0,101);
		
        System.out.println("Company Name: " + Customer.companyName);
        System.out.println("Default Country: " + Customer.defaultCountry);
        System.out.println("Average Purchase Amount: $" + Customer.averagePurchaseAmount);
        System.out.println("Customer ID: " + john.customerID);
        System.out.println("Customer Name: " + john.firstName + " " + john.lastName);
        System.out.println("Email: " + john.email);
        System.out.println("Phone Number: " + john.phoneNumber);
        System.out.println("Address: " + john.address);
        System.out.println("Purchase Amount: $" + john.purchaseAmount);
		
		System.out.println("-----------------------------------------------------------------------------------------------");

        Customer jane  = new Customer("Jane", "Smith", "jane@example.com", "+1 (987) 654-3210", "456 Elm St", 200.0,102);

        System.out.println("Company Name: " + Customer.companyName);
        System.out.println("\nDefault Country: " + Customer.defaultCountry);
        System.out.println("Average Purchase Amount: $" + Customer.averagePurchaseAmount);
        System.out.println("Customer ID: " + jane.customerID);
        System.out.println("Customer Name: " + jane.firstName + " " + jane.lastName);
        System.out.println("Email: " + jane.email);
        System.out.println("Phone Number: " + jane.phoneNumber);
        System.out.println("Address: " + jane.address);
        System.out.println("Purchase Amount: $" + jane.purchaseAmount);
		
		System.out.println("-----------------------------------------------------------------------------------------------");

        Customer alice = new Customer("Alice", "Johnson", "jane@example.com", "+1 (555) 123-4567", "789 Oak St", 75.0,103);

        System.out.println("Company Name: " + Customer.companyName);
		System.out.println("\nDefault Country: " + Customer.defaultCountry);
        System.out.println("Average Purchase Amount: $" + Customer.averagePurchaseAmount);
        System.out.println("Customer ID: " + alice.customerID);
        System.out.println("Customer Name: " + alice.firstName + " " + alice.lastName);
        System.out.println("Email: " + alice.email);
        System.out.println("Phone Number: " + alice.phoneNumber);
        System.out.println("Address: " + alice.address);
        System.out.println("Purchase Amount: $" + alice.purchaseAmount);
    }
}
