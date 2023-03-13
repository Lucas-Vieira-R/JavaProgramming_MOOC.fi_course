
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double value = Double.valueOf(scan.nextLine());
        double tax;
        double exTax;
        
        if(value<5000){
            System.out.println("No tax");
        }else if(value>=5000 && value<25000){
            exTax = (value-5000)*0.08;
            tax = 100 + exTax;
            System.out.println("Tax: "+tax);
        }else if(value>=25000 && value<55000){
            exTax = (value-25000)*0.1;
            tax = 1700 + exTax;
            System.out.println("Tax: "+tax);
        }else if(value>=55000 && value<200000){
            exTax = (value-55000)*0.12;
            tax = 4700 + exTax;
            System.out.println("Tax: "+tax);
        }else if(value>=200000 && value<1000000){
            exTax = (value-200000)*0.15;
            tax = 22100 + exTax;
            System.out.println("Tax: "+tax);
        }else{
            exTax = (value-1000000)*0.17;
            tax = 142100 + exTax;
            System.out.println("Tax: "+tax);
        }   

    }
}
