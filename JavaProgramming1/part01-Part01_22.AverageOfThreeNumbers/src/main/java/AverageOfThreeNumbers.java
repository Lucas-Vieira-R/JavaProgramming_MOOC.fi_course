
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int num3 = Integer.valueOf(scanner.nextLine());
        int sum = num1+num2+num3;
        double aver = (double) sum/3;
        System.out.println("The average is "+(aver));
    }
}
