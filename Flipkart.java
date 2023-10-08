public class Flipkart {

   
    int numberOfProducts;
    double totalRevenue;
    String productName;
    String productCategory;
    int productRating;
    boolean isDiscountAvailable;
    String sellerName;

    
    static String companyName;
    static String companyLocation;
    static int foundingYear;

    
    static {
        companyName = "Flipkart";
        companyLocation = "Bengaluru";
        foundingYear = 2007;
    }

    
    public Flipkart(int numberOfProducts, double totalRevenue, String productName, String productCategory,
                    int productRating, boolean isDiscountAvailable, String sellerName) {
        this.numberOfProducts = numberOfProducts;
        this.totalRevenue = totalRevenue;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productRating = productRating;
        this.isDiscountAvailable = isDiscountAvailable;
        this.sellerName = sellerName;
    }

    public static void main(String[] args) {
       
        Flipkart smartphone = new Flipkart(1000, 150000.0, "Smartphone", "Electronics", 4, true, "TechGadgets Inc.");

        System.out.println("Company Name: " + companyName);
        System.out.println("Company Location: " + companyLocation);
        System.out.println("Founding Year: " + foundingYear);
        System.out.println("Product Information:");
        System.out.println("Number of Products: " + smartphone.numberOfProducts);
        System.out.println("Total Revenue: $" + smartphone.totalRevenue);
        System.out.println("Product Name: " + smartphone.productName);
        System.out.println("Product Category: " + smartphone.productCategory);
        System.out.println("Product Rating: " + smartphone.productRating);
        System.out.println("Discount Available: " + smartphone.isDiscountAvailable);
        System.out.println("Seller Name: " + smartphone.sellerName);
		
		Flipkart laptop = new Flipkart(500, 80000.0, "Laptop", "Electronics", 4, true, "ElectroMega Inc.");
        System.out.println("\nProduct 2 Information:");
        System.out.println("Number of Products: " + laptop.numberOfProducts);
        System.out.println("Total Revenue: $" + laptop.totalRevenue);
        System.out.println("Product Name: " + laptop.productName);
        System.out.println("Product Category: " + laptop.productCategory);
        System.out.println("Product Rating: " + laptop.productRating);
        System.out.println("Discount Available: " + laptop.isDiscountAvailable);
        System.out.println("Seller Name: " + laptop.sellerName);
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Location: " + companyLocation);
        System.out.println("Founding Year: " + foundingYear);

        Flipkart tv = new Flipkart(800, 120000.0, "LED TV", "Electronics", 5, true, "TechZone Electronics");
        System.out.println("\nProduct 3 Information:");
        System.out.println("Number of Products: " + tv.numberOfProducts);
        System.out.println("Total Revenue: $" + tv.totalRevenue);
        System.out.println("Product Name: " + tv.productName);
        System.out.println("Product Category: " + tv.productCategory);
        System.out.println("Product Rating: " + tv.productRating);
        System.out.println("Discount Available: " + tv.isDiscountAvailable);
        System.out.println("Seller Name: " + tv.sellerName);
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Location: " + companyLocation);
        System.out.println("Founding Year: " + foundingYear);
       
    }
}
