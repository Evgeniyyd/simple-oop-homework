import lombok.NonNull;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        printStringReverse("khjg");
        isPhoneNumber("89999797793");
        printSubStringReverse("мапана", 0, 2);
        getWordsReverseInColumn("Hello my nice world");
        getWordsReverse("Hello my nice world");
    }

    public static void printStringReverse(@NonNull String string) {
        if (string.isEmpty() || string.equals(" ")) {
            System.out.println("Wrong string");
        }
        char[] charArray = string.toCharArray();
        IntStream.rangeClosed(1, charArray.length)
                .mapToObj(i -> charArray[charArray.length - i])
                .forEach(System.out::println);
//        StringBuilder stringBuilder = new StringBuilder(string);
//        System.out.println(stringBuilder.reverse());
//взять строку, разбить её на символы из этой строки создать интстрим ,
// используя массив и  интстрим запускать чисела  и обращаться к символам с конца

//        Stream.of(stringBuilder)
//                .map(stringBuilder1 -> stringBuilder1.reverse())
//                .forEach(System.out::println);
    }

    public static void isPhoneNumber(@NonNull String isNaber) {
        if (isNaber.isEmpty() || isNaber.equals(" ")) {
            System.out.println((String) null);
        }
        System.out.println(Stream.of(isNaber)
                .anyMatch(namer -> namer.startsWith("8") &&
                        namer.length() == 11 && namer.matches("\\d+")));

    }

    public static void printSubStringReverse(String string, int start, int finish) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.setCharAt(start, string.charAt(finish));
        stringBuilder.setCharAt(finish, string.charAt(start));
        System.out.println(stringBuilder);

    }

    public static String getWordsReverse(String revereString) {
      return   Arrays.stream(revereString.split(" "))
              .map(string -> new StringBuilder(string).reverse().toString())
                .collect(Collectors.joining(" "));
    }

    public static void getWordsReverseInColumn(String string) {
        String[] split = string.split(" ");
        for (String strings : split) {
            StringBuilder stringBuilder = new StringBuilder(strings);
            StringBuilder reverse = stringBuilder.reverse();
            System.out.print(reverse + " ");
        }
    }


}

