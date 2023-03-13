
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isZero = false;
        int sum=0;
        int count = 0;
        while(!isZero){
            int number = scanner.nextInt();
            if(number==0){
                isZero = true;
            }else if(number>0){
                count++;
                sum+=number;
            }else{
                continue;
            }
        }
        if(count==0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println((double)sum/(double)count);
        }
        

    }
}
