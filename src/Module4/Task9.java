package Module4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public Task9() {
    }

    public static void main(String[] args) {
        String text = "SW Eltex MES1124 УД АТС-66 388-22-66-СОШ №1 MES-1124(172.16.16.93):03 /nSW D-LinkDES-1210-28/ME УД АТС-45 МБОУ DES-1210-28(172.16.252.170) /nSW D-Link DES-1210";
        Pattern pattern = Pattern.compile("([0-9]{1,3}[\\.]){3}[0-9]{1,3}");
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
