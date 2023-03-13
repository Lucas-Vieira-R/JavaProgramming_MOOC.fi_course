
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double average;
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
        average = (double) sum / (double) count;
        System.out.println("Average of the numbers: "+average);
        

    }
}
