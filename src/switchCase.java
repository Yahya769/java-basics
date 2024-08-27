import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter Day ");
        String day = scanObj.nextLine();

        switch(day){
            case "Mon":
                System.out.println("Day is MOnday");
                break;
            case "Tues":
                System.out.println("Day is Tuesday");
                break;
            case "Wed":
                System.out.println("Day is Wedday");
                break;
            case "Thurs":
                System.out.println("Day is Thursday");
                break;
            case "Fri":
                System.out.println("Day is Friday");
                break;
            default:
                System.out.println("Day is invalid");
                break;
        }


    }
}
