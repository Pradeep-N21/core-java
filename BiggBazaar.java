public class BiggBazaar {
    int numberOfStores;
    int numberOfEmployees;
    String storeName;
    String storeManager;
    int floorArea;
    int annualRevenue;
    boolean isOpen;
    static String companyLocation;
    static String companyFounder;
    static int foundingYear;

    static {
        companyLocation = "Mumbai";
        companyFounder = "Ramesh Mehta";
        foundingYear = 1987;
    }

    public BiggBazaar(int numberOfStores, int numberOfEmployees, String storeName, String storeManager,
                      int floorArea, int annualRevenue, boolean isOpen) {
        this.numberOfStores = numberOfStores;
        this.numberOfEmployees = numberOfEmployees;
        this.storeName = storeName;
        this.storeManager = storeManager;
        this.floorArea = floorArea;
        this.annualRevenue = annualRevenue;
        this.isOpen = isOpen;
    }

    public static void main(String[] args) {
        BiggBazaar downtown = new BiggBazaar(10, 100, "Bigg Bazaar Downtown", "Suresh Kumar", 15000, 5000000, true);
        System.out.println(downtown.numberOfStores);
        System.out.println(downtown.numberOfEmployees);
        System.out.println(downtown.storeName);
        System.out.println(downtown.storeManager);
        System.out.println(downtown.floorArea);
        System.out.println(downtown.annualRevenue);
        System.out.println(downtown.isOpen);
        System.out.println(companyLocation);
        System.out.println(companyFounder);
        System.out.println(foundingYear);

        BiggBazaar mall = new BiggBazaar(8, 80, "Bigg Bazaar Mall", "Priya Gupta", 12000, 4500000, true);
        System.out.println(mall.numberOfStores);
        System.out.println(mall.numberOfEmployees);
        System.out.println(mall.storeName);
        System.out.println(mall.storeManager);
        System.out.println(mall.floorArea);
        System.out.println(mall.annualRevenue);
        System.out.println(mall.isOpen);
        System.out.println(companyLocation);
        System.out.println(companyFounder);
        System.out.println(foundingYear);
		
		BiggBazaar superStore = new BiggBazaar(15, 150, "Bigg Bazaar Superstore", "Rajesh Sharma", 18000, 6000000, true);
        System.out.println("\nStore 3 Information:");
        System.out.println("Number of Stores: " + superStore.numberOfStores);
        System.out.println("Number of Employees: " + superStore.numberOfEmployees);
        System.out.println("Store Name: " + superStore.storeName);
        System.out.println("Store Manager: " + superStore.storeManager);
        System.out.println("Floor Area: " + superStore.floorArea);
        System.out.println("Annual Revenue: $" + superStore.annualRevenue);
        System.out.println("Is Open: " + superStore.isOpen);
        System.out.println("Company Location: " + companyLocation);
        System.out.println("Company Founder: " + companyFounder);
        System.out.println("Founding Year: " + foundingYear);
    }
}

