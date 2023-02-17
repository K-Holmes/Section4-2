import java.util.Scanner;

public class SsnCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ssn = getSsn(sc);
        if (validSsn(ssn)){
            System.out.println(ssn+" is a valid Social Security Number");
        } else {
            System.out.println("This is an invalid ssn, must be in the format" +
                    " of (xxx-xx-xxxx)");
        }
        sc.close();
    }

    static boolean validSsn(String ssn){
        return ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}");
    }
    static String getSsn(Scanner sc){
        System.out.println("Hand over your Social Security Number: ");
        return sc.nextLine();
    }
}
