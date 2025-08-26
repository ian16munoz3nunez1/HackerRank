import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.joining;

import java.util.regex.Pattern;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert the hour: ");
        String str = in.nextLine();

        String result = Result.timeConversion(str);
        System.out.print("Result: " + result);

        in.close();
    }
}

class Result {
    public static String timeConversion(String str) {
        boolean am, pm;
        String regex, result=null;
        List<Integer> time = new ArrayList<>();

        regex = "am$";
        am = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(str).find();
        if(am) {
            str = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(str).replaceAll("");
            time = Stream.of(str.split(":")).map(Integer::parseInt).collect(toList());
            time.set(0, time.get(0)%12);
        }

        regex = "pm$";
        pm = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(str).find();
        if(pm) {
            str = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(str).replaceAll("");
            time = Stream.of(str.split(":")).map(Integer::parseInt).collect(toList());
            time.set(0, (time.get(0)%12)+12);
        }

        result = time.stream().map(n -> String.format("%02d", n)).collect(joining(":"));

        return result;
    }
}

