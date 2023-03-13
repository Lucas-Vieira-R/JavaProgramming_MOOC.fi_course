
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFour = false;
        while(!isFour){
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            if(number==4){
                isFour = true;
            }
        }

    }
}
