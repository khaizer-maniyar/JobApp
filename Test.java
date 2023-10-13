import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter temperature in Fahrenheit: ");
            
            double fahrenheit = sc.nextDouble();
            
            double celsius = (fahrenheit - 32) * 5 / 9;
            
            System.out.printf("Temperature in Degree Celsius will be: %.1f%n", celsius);
        }
    }
}
