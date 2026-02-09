import java.util.Scanner;
public class weekdays_and_weekends {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the day of the week:");
        String day = in.next();
        switch (day){
            case "Monday":
                 System.out.println("Monday is a weekday");
                 break;
            case "Tuesday":
                System.out.println("Tuesday is a weekday");
                break;
            case "Wednesday":
                System.out.println("Wednesday is a weekday");
                break;
            case "Thursday":
                System.out.println("Thursday is a weekday");
                break;
            case "Friday":
                System.out.println("Friday is a weekday");
                break;
            case "Saturday":
                System.out.println("Saturday is a weekend");
                break;
            case "Sunday":
                System.out.println("Sunday is a weekend");
                break;
            default :
                 System.out.println("Please enter a valid day of the week (Monday-Sunday)");
        }
    }
}
