public class Bank {

    private static String mainBrank;
    private static String defaultLocation;
    private static double averageInterestRate;

    private String name;
    private String location;
    private String type;
    private double totalAssets;
    private double interestRate;
	private int numberOfAccount;
	private int year;
	
	

    public Bank(String name, String location, String type, double totalAssets, double interestRate,int numberOfAccount,int year) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.totalAssets = totalAssets;
        this.interestRate = interestRate;
		this.numberOfAccount = numberOfAccount;
		this.year = year;
		
    }

    static {
        mainBrank = "RBI";
        defaultLocation = "Mumbai";
        averageInterestRate = 0.05; // 5% annual interest rate
    }

    public static void main(String[] args) {
        Bank jpMorgan = new Bank("JPMorgan Chase", "New York, NY", "Commercial", 30000000000.0, 0.03,6000,1980);

        System.out.println("Main Bank: " + Bank.mainBrank);
        System.out.println("Default Location: " + Bank.defaultLocation);
        System.out.println("Average Interest Rate: " + Bank.averageInterestRate);
        System.out.println("Bank Name: " + jpMorgan.name);
        System.out.println("Location: " + jpMorgan.location);
        System.out.println("Type: " + jpMorgan.type);
        System.out.println("Total Assets: $" + jpMorgan.totalAssets);
        System.out.println("Interest Rate: " + jpMorgan.interestRate);
		System.out.println("Number of Account: " + jpMorgan.numberOfAccount);
		System.out.println("Year: " + jpMorgan.year);
		
		System.out.println("-------------------------------------------------------------------------------------------");

        Bank wellsFargo = new Bank("Wells Fargo", "San Francisco, CA", "Commercial", 25000000000.0, 0.02,7000,1980);

        System.out.println("Main Bank: " + Bank.mainBrank);
        System.out.println("Default Location: " + Bank.defaultLocation);
        System.out.println("Average Interest Rate: " + Bank.averageInterestRate);
        System.out.println("Bank Name: " + wellsFargo.name);
        System.out.println("Location: " + wellsFargo.location);
        System.out.println("Type: " + wellsFargo.type);
        System.out.println("Total Assets: $" + wellsFargo.totalAssets);
        System.out.println("Interest Rate: " + wellsFargo.interestRate);
		System.out.println("Number of Account: " + wellsFargo.numberOfAccount);
		System.out.println("Year: " + wellsFargo.year);
		
		System.out.println("-------------------------------------------------------------------------------------------");

        Bank citiBank = new Bank("Citibank", "New York, NY", "Commercial", 22000000000.0, 0.04,4000,1990);

        System.out.println("Main Bank: " + Bank.mainBrank);
        System.out.println("Default Location: " + Bank.defaultLocation);
        System.out.println("Average Interest Rate: " + Bank.averageInterestRate);
        System.out.println("Bank Name: " + citiBank.name);
        System.out.println("Location: " + citiBank.location);
        System.out.println("Type: " + citiBank.type);
        System.out.println("Total Assets: $" + citiBank.totalAssets);
        System.out.println("Interest Rate: " + citiBank.interestRate);
		System.out.println("Number of Account: " + citiBank.numberOfAccount);
		System.out.println("Year: " + citiBank.year);
    }
}
