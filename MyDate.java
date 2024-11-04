import java.util.*;

class MyDate {

    // Attributes.
    int day;
    int month;
    int year;


    // No-arg constructor.
    public MyDate() {
        super();
        Calendar calendar = Calendar.getInstance();
        // Create a MyDate object for the current date.
        //MyDate currentDate = new MyDate();
        this.day = calendar.get(Calendar.DATE);
        this.month = calendar.get(Calendar.MONTH);
        this.year = calendar.get(Calendar.YEAR);
    }


    public MyDate(long elapsedTime) {
        // TODO Convert milliseconds since January 1, 1970 to a date in
        GregorianCalendar gregorianCalander = new GregorianCalendar();
        gregorianCalander.setTimeInMillis(elapsedTime);
        //day, month, year form
        this.day = gregorianCalander.get(Calendar.DATE);
        this.month = gregorianCalander.get(Calendar.MONTH);
        this.year = gregorianCalander.get(Calendar.YEAR);


        }
    public MyDate(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }
    public int getMonth() {
        return this.month;
    }
    public int getDay() {
        return this.day;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar getGregorianCalanderDate = new GregorianCalendar();
        getGregorianCalanderDate.setTimeInMillis(elapsedTime);
    }

}





// So you have a start. It also wants a no-arg constructor. So we do



/*Notice that I'm just taking stuff from the assignment, but there's the
beginning of code. Then the assignment wants a constructor that has an
argument - elapsed time in milliseconds. */



    // Constructor that has one argument of the elapsed time since
    //midnight, January 1, 1970, in milliseconds.
    //MyDate(int elapsedTime) {
        // TODO Convert milliseconds since January 1, 1970 to a date in
        //day, month, year form

    //}
