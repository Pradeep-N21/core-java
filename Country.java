public class Country {
   
    private static int totalCountries;
    private static String defaultCurrency;
    private static double averageLifeExpectancy;
 
    private String name;
    private String capital;
    private String population;
    private String area;
    private String currency;
    private String language;
}
   
    public Country(String name, String capital, String population, String area,
                   String currency, String language) {
       this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.currency = currency;
        this.language = language;
                      
    
    }
           static
           {
              totalCountries = 195;
              defaultCurrency = "USD";
              averageLifeExpectancy = 73.2;
           }
 
           public static void main(String[] args)
           {
             Country india = new Country("india","New Dehli","140cr","3.282m km","Rupees","Kannada");
             
                      System.out.println(india.totalCountries);
                      System.out.println(india.name);
                      System.out.println(india.currency);
                      
             Country china = new Country("China","Beijing","141cr","9.597m km","Yuan","Mandarin");  
                      System.out.println(china.totalCountries);
                      System.out.println(china.defaultCurrency);
                      System.out.println(china.name);
                      System.out.println(china.capital);
                      
             Country russia = new Country("Russia","Moscow","14cr","17.1m km","Rubles","Russian");
                      System.out.println(russia.totalCountries);
                      System.out.println(russia.area);
                      System.out.println(russia.name);
                      System.out.println(russia.population);
             
 
   }
