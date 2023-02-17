import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternTest {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[A-F]{5,}.*");
        String str = "AAAAAhhh";

        System.out.println(isMatch(str, p));
    }

    private static boolean isMatch(String str, Pattern p){
        Matcher m = p.matcher(str);
        return m.matches();
    }
}
