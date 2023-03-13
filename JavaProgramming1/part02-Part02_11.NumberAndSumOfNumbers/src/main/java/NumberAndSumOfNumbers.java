
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        boolean isZero = false;
        
        while(!isZero){
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            if(number==0){
                isZero = true;
            }else{
                count++;
                sum+=number; 
            }
            
        }
        System.out.println("Number of numbers: "+count);
        System.out.println("Sum of the numbers: "+sum);
    }
}
