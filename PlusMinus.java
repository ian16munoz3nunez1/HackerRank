import java.util.Scanner;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert the number of elements: ");
        int n = Integer.parseInt(in.nextLine());

        System.out.print("Insert the array: ");
        List<Integer> ints = Stream.of(in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        Result.plusMinus(ints);

        in.close();
    }
}

class Result {
    public static void plusMinus(List<Integer> ints) {
        int positive=0, negative=0, neutral=0, n=ints.size();

        for(int e: ints) {
            if(e > 0)
                positive++;

            if(e < 0)
                negative++;

            if(e == 0)
                neutral++;
        }

        float floatPositive = (float)positive/n;
        float floatNegative = (float)negative/n;
        float floatNeutral = (float)neutral/n;

        String strPositive = String.format("%.6f", floatPositive);
        String strNegative = String.format("%.6f", floatNegative);
        String strNeutral = String.format("%.6f", floatNeutral);

        System.out.println(strPositive);
        System.out.println(strNegative);
        System.out.println(strNeutral);
    }
}

