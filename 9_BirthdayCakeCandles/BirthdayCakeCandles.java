import java.util.Scanner;

import java.util.List;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert the number of candles: ");
        int n = in.nextInt();
        in.nextLine();

        System.out.print("Insert the candles: ");
        List<Integer> candles = Stream.of(in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = Result.birthdayCakeCandles(candles);

        System.out.println("Result: " + result);

        in.close();
    }
}

class Result {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = Collections.max(candles);
        int cont=0;

        for(int e: candles)
            if(e == max) cont++;

        return cont;
    }
}

