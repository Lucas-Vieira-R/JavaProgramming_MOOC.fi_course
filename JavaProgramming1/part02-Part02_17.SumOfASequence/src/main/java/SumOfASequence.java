
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lastNum = scanner.nextInt();
        int c=0;
        int sum=0;
        while(c<=lastNum){
            sum+=c;
            c++;
        }
        System.out.println("The sum is "+sum);
    }
}
