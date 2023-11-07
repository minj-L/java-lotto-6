package util;

import java.util.Arrays;
import java.util.List;

public class SplitString {
    public static List<String> splitString(String inputWinNumber) throws IllegalArgumentException {
        String[] winNumbers = inputWinNumber.split(",");
        return Arrays.asList(winNumbers);
    }
}
