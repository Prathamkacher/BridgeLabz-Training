//Create a utility class ExtendedUnitConvertor2 with static conversion methods.
public class ExtendedUnitConvertor2 {

    //Convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    //Convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    //Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    //Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    //Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    //Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    //main method
    public static void main(String[] args) {
		
        System.out.println("100.6 F in Celsius = " + convertFarhenheitToCelsius(100.6));
        System.out.println("37 C in Fahrenheit = " + convertCelsiusToFarhenheit(37));
        System.out.println("70 pounds in kilograms = " + convertPoundsToKilograms(70));
        System.out.println("70 kilograms in pounds = " + convertKilogramsToPounds(70));
        System.out.println("5 gallons in liters = " + convertGallonsToLiters(5));
        System.out.println("5 liters in gallons = " + convertLitersToGallons(5));
    }
}
