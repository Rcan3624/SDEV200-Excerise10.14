import java.util.GregorianCalendar;

public class TestMyDate {
    public static void main(String[] args) {

        // Create an object containing the year, month, and day

        MyDate currentDate = new MyDate();

        System.out.println("The current year is: " + currentDate.getYear());
        System.out.println("The current month is: " + currentDate.getMonth());
        System.out.println("The current day is: " + currentDate.getDay());


        MyDate elapsedDate = new MyDate(561555550000L);

        System.out.println("The elapsed year is: " + elapsedDate.getYear());
        System.out.println("The elapsed month is: " + elapsedDate.getMonth());
        System.out.println("The elapsed day is: " + elapsedDate.getDay());


    }
}
