package Module4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public Task5() {
    }

    public static void main(String[] args) {
        String stringText = "[a-zA-Z]+";
        String text = "1It is 2interesting TO 4study VERY666, Делайте обучение интересней";
        Pattern pattern = Pattern.compile(stringText);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.print(matcher.group());
        }

    }
}
