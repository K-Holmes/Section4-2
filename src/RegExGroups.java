import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date;
        Pattern dateP = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})");
        date = getDate(sc, dateP);
        System.out.println("US Style Date: "+date);
        sc.close();
    }

    static String getDate(Scanner sc, Pattern dateP){
        String date;
        Matcher dateM;
        boolean validDate = false;
        do{
            System.out.println("Enter a date (dd/mm/yyyy)");
            date = sc.next();
            dateM = dateP.matcher(date);
            if (dateM.matches()){
                String day = dateM.group(1);
                String month = dateM.group(2);
                String year = dateM.group(3);
                validDate = validateDate(date);
                if (dateM.matches()&&validDate){
                    date = month + "/" + day + "/" + year;
                } else {
                    System.out.println("Incorrect Date Entered");
                }
            }
        } while (!dateM.matches() && validDate);
        return date;
    }

    static boolean validateDate(String newDate){
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        String date = newDate;
        try {
            format.parse(date);
            return true;
        } catch (ParseException e){
            System.out.println(date+" is not valid according to " +
                    ((SimpleDateFormat) format).toPattern() + " pattern");
            return false;
        }
    }
}
