public class BlinkIt {

    int numberOfBlinkingLights;
    String lightColor;
    int batteryLife;
    boolean isPortable;
    static String productName;
    static String manufacturer;
    static int yearReleased;

    static {
        productName = "BlinkIt";
        manufacturer = "TechCo";
        yearReleased = 2022;
    }

    public BlinkIt(int numberOfBlinkingLights, String lightColor, int batteryLife, boolean isPortable) {
        this.numberOfBlinkingLights = numberOfBlinkingLights;
        this.lightColor = lightColor;
        this.batteryLife = batteryLife;
        this.isPortable = isPortable;
    }

    public static void main(String[] args) {
	
	
        BlinkIt blinker1 = new BlinkIt(5, "Red", 10, true);
		System.out.println("Product Name: " + BlinkIt.productName); 
        System.out.println("Manufacturer: " + BlinkIt.manufacturer); 
        System.out.println("Year Released: " + BlinkIt.yearReleased);
        System.out.println("Number of Blinking Lights: " + blinker1.numberOfBlinkingLights);
        System.out.println("Light Color: " + blinker1.lightColor);
        System.out.println("Battery Life: " + blinker1.batteryLife);
        System.out.println("Is Portable: " + blinker1.isPortable);
        System.out.println("Product Name: " + productName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Year Released: " + yearReleased);

        BlinkIt blinker2 = new BlinkIt(8, "Blue", 12, false);
		System.out.println("Product Name: " + BlinkIt.productName); 
        System.out.println("Manufacturer: " + BlinkIt.manufacturer); 
        System.out.println("Year Released: " + BlinkIt.yearReleased);
        System.out.println("Number of Blinking Lights: " + blinker2.numberOfBlinkingLights);
        System.out.println("Light Color: " + blinker2.lightColor);
        System.out.println("Battery Life: " + blinker2.batteryLife);
        System.out.println("Is Portable: " + blinker2.isPortable);
        System.out.println("Product Name: " + productName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Year Released: " + yearReleased);
    }
}

