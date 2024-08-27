import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.println(" Enter any Numbers ");
        int num = scanObj.nextInt();

        if (num%2==0){
            System.out.println("Numer is Even ");
        }
        else{
            System.out.println("Number is not Even");
        }
    }
}
