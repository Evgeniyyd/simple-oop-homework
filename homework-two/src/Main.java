import lombok.NonNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        printStringReverse("khjg");
        System.out.println(isPhoneNumber("89999798834"));
        printSubStringReverse("мапана", 0, 2);
        System.out.println(getWordsReverse("Hello my nice world"));
        System.out.println(getWordsReverseInColumn("Hello my nice world"));
    }

    public static void printStringReverse(@NonNull String string) {
        if (string.isEmpty() || string.equals(" ")) {
            System.out.println("Wrong string");
        }
        StringBuilder stringBuilder = new StringBuilder(string);
        System.out.println(stringBuilder.reverse());
    }

    public static Boolean isPhoneNumber(@NonNull String number) {
        if (number.isEmpty() || number.equals(" ")) {
            System.out.println((String) null);
        }
        return number.matches("^8\\d{10}");
    }

    public static void printSubStringReverse(String string, int start, int finish) {
        String substring = string.substring(start, finish + 1);
        StringBuilder stringBuilder = new StringBuilder(substring);
        stringBuilder.reverse();
        System.out.println(string.replaceAll(substring, stringBuilder.toString()));

    }

    public static String getWordsReverse(String revereString) {
        return String.join(" ", Arrays.asList(revereString.split(" ")).reversed());
    }

    public static String getWordsReverseInColumn(String string) {
        return Arrays.stream(string.split(" "))
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .collect(Collectors.joining(System.lineSeparator()));
    }
}


