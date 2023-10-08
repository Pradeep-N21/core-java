public class RedmiPhone {

    int modelNumber;
    String modelName;
    String operatingSystem;
    double screenSize;
    int storageCapacity;
    int batteryCapacity;
    boolean is5GEnabled;
    String color;
    double price;
    
    static String brandName;
    static String manufacturer;
    static int numberOfModels;

    static {
        brandName = "Redmi";
        manufacturer = "Xiaomi";
        numberOfModels = 100;
    }

    public RedmiPhone(int modelNumber, String modelName, String operatingSystem, double screenSize,
                      int storageCapacity, int batteryCapacity, boolean is5GEnabled, String color,
                      double price) {
        this.modelNumber = modelNumber;
        this.modelName = modelName;
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
        this.batteryCapacity = batteryCapacity;
        this.is5GEnabled = is5GEnabled;
        this.color = color;
        this.price = price;

        numberOfModels++;
    }

    public static void main(String[] args) {
        RedmiPhone note10 = new RedmiPhone(1, "Redmi Note 10", "MIUI 12", 6.43, 128, 5000, true, "Aqua Green", 199.99);
        System.out.println("Model Name: " + note10.modelName);
        System.out.println("Operating System: " + note10.operatingSystem);
        System.out.println("Screen Size: " + note10.screenSize + " inches");
        System.out.println("Storage Capacity: " + note10.storageCapacity + " GB");
        System.out.println("Battery Capacity: " + note10.batteryCapacity + " mAh");
        System.out.println("5G Enabled: " + note10.is5GEnabled);
        System.out.println("Color: " + note10.color);
        System.out.println("Price: $" + note10.price);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Number of Redmi Phone Models: " + numberOfModels);

        RedmiPhone nineA = new RedmiPhone(2, "Redmi 9A", "MIUI 11", 6.53, 32, 5000, false, "Midnight Black", 129.99);
        System.out.println("Model Name: " + nineA.modelName);
        System.out.println("Operating System: " + nineA.operatingSystem);
        System.out.println("Screen Size: " + nineA.screenSize + " inches");
        System.out.println("Storage Capacity: " + nineA.storageCapacity + " GB");
        System.out.println("Battery Capacity: " + nineA.batteryCapacity + " mAh");
        System.out.println("5G Enabled: " + nineA.is5GEnabled);
        System.out.println("Color: " + nineA.color);
        System.out.println("Price: $" + nineA.price);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Number of Redmi Phone Models: " + numberOfModels);
		
		RedmiPhone note = new RedmiPhone(2, "Note 7", "MIUI 10", 6.93, 48, 50000, false, "Midnight Blue", 189.99);
        System.out.println("Model Name: " + note.modelName);
        System.out.println("Operating System: " + note.operatingSystem);
        System.out.println("Screen Size: " + note.screenSize + " inches");
        System.out.println("Storage Capacity: " + note.storageCapacity + " GB");
        System.out.println("Battery Capacity: " + note.batteryCapacity + " mAh");
        System.out.println("5G Enabled: " + note.is5GEnabled);
        System.out.println("Color: " + note.color);
        System.out.println("Price: $" + note.price);
        System.out.println("Price: $" + note.price);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Number of Redmi Phone Models: " + numberOfModels);
		
		
    }
}

