
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean isZero = false;
        int sum = 0;
        while(!isZero){
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            if(number==0){
                isZero = true;
            }
            sum +=number;
        }
        System.out.println("Sum of the numbers: "+sum);
    }
}