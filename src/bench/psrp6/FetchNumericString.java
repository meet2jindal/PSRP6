package bench.psrp6;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FetchNumericString {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("as", "123", "32", "2as");
        String regNumericsOnly = "^\\d*$";
        System.out.println(ls.stream().filter(str-> Pattern.matches(regNumericsOnly, str)).collect(Collectors.toList()));
    }
}
