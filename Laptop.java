public class Laptop {
   
    private static String brand;
    private static String defaultManufacturer;
    private static double averagePrice;

    private int totalLaptops;
    private String model;
    private int yearManufactured;
    private double price;
    private String processor;
    private int memoryGB;
    private String operatingSystem;
    private String serialNumber;

    public Laptop(int totalLaptops, String model, int yearManufactured,
                  double price, String processor, int memoryGB,
                  String operatingSystem, String serialNumber) {
        this.totalLaptops = totalLaptops;
        this.model = model;
        this.yearManufactured = yearManufactured;
        this.price = price;
        this.processor = processor;
        this.memoryGB = memoryGB;
        this.operatingSystem = operatingSystem;
        this.serialNumber = serialNumber;
    }
   
    static {
        brand = "hp";
        defaultManufacturer = "Hewlett Packard";
        averagePrice = 10000.0;
    }

    public static void main(String[] args) {
        Laptop dellXPS = new Laptop(100, "XPS 13", 2022, 1499.99,
                                    "Intel Core i7", 16, "Windows 11", "ABC123");

        System.out.println("Brand: " + Laptop.brand);
        System.out.println("Default Manufacturer: " + Laptop.defaultManufacturer);
        System.out.println("Average Price: " + Laptop.averagePrice);
        System.out.println("Total Laptop: " + dellXPS.totalLaptops);
        System.out.println("Model: " + dellXPS.model);
        System.out.println("Year Manufactured: " + dellXPS.yearManufactured);
        System.out.println("Price: $" + dellXPS.price);
        System.out.println("Processor: " + dellXPS.processor);
        System.out.println("Memory (GB): " + dellXPS.memoryGB);
        System.out.println("Operating System: " + dellXPS.operatingSystem);
        System.out.println("Serial Number: " + dellXPS.serialNumber);
		
        Laptop hpSpectre = new Laptop(399, "Spectre x360", 2021, 1299.99,
                                      "Intel Core i5", 8, "Windows 10", "XYZ789");
								 
        System.out.println("Brand: " + Laptop.brand);
        System.out.println("Default Manufacturer: " + Laptop.defaultManufacturer);
        System.out.println("Average Price: " + Laptop.averagePrice);
        System.out.println("Total Laptops: " + hpSpectre.totalLaptops);
        System.out.println("Model: " + hpSpectre.model);
        System.out.println("Year Manufactured: " + hpSpectre.yearManufactured);
        System.out.println("Price: $" + hpSpectre.price);
        System.out.println("Processor: " + hpSpectre.processor);
        System.out.println("Memory (GB): " + hpSpectre.memoryGB);
        System.out.println("Operating System: " + hpSpectre.operatingSystem);
        System.out.println("Serial Number: " + hpSpectre.serialNumber);
		
        Laptop lenovoThinkPad = new Laptop(788, "ThinkPad X1 Carbon", 2020, 1399.99,
                                           "Intel Core i7", 16, "Windows 10", "PQR456");
	    
        System.out.println("Brand: " + Laptop.brand);
        System.out.println("Default Manufacturer: " + Laptop.defaultManufacturer);
        System.out.println("Average Price: " + Laptop.averagePrice);
        System.out.println("TOTAL Laptop: " + lenovoThinkPad.totalLaptops);
        System.out.println("Model: " + lenovoThinkPad.model);
        System.out.println("Year Manufactured: " + lenovoThinkPad.yearManufactured);
        System.out.println("Price: $" + lenovoThinkPad.price);
        System.out.println("Processor: " + lenovoThinkPad.processor);
        System.out.println("Memory (GB): " + lenovoThinkPad.memoryGB);
        System.out.println("Operating System: " + lenovoThinkPad.operatingSystem);
        System.out.println("Serial Number: " + lenovoThinkPad.serialNumber);
    }
}
