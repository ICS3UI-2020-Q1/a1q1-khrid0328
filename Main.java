import java.util.Scanner;

/**
 * This program converts a temperature from Celsius to Fahrenheit
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for the degree they want to convert to fahrenheit
    System.out.println("Please enter a temperature you would like to convert in degrees Celsius.");
    // declare and initialize a variable for temperature in Celsius
    int temperatureC = input.nextInt();

    // declare and calculate temperature in degrees fahrenheit
    int temperatureF = (temperatureC * 9) / 5 + 32; 

    // tell the user the temperature in Fahrenheit
    System.out.println(temperatureC+"C is the same as "+ temperatureF+"F");
  }
}
