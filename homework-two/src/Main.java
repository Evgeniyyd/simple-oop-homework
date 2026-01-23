import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;
import java.util.stream.Stream;


@EqualsAndHashCode()
@ToString(callSuper = true)
public class Main {
    public static void main(String[] args) {
        printStringReverse("khjg");
        isPhoneNumber("89999797793");
        printSubStringReverse("мапана", 0, 2);

    }

    public static void printStringReverse(@NonNull String reverse) {
        if (reverse.isEmpty() || reverse.equals(" ")) {
            System.out.println("Wrong string");
        }
        StringBuilder stringBuilder = new StringBuilder(reverse);
        Stream.of(stringBuilder)
                .map(stringBuilder1 -> stringBuilder1.reverse())
                .filter(revers -> !revers.isEmpty() || !revers.equals(" "))
                .forEach(System.out::println);
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
}
