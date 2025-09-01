import java.util.Scanner;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class AVeryBigSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert the number of elements: ");
        int n = Integer.parseInt(in.nextLine());

        System.out.print("Insert the array: ");
        List<Long> ar = Stream.of(in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" "))
            .map(Long::parseLong)
            .collect(Collectors.toList());

        long result = Result.aVeryBigSum(ar);

        System.out.println(result);

        in.close();
    }
}

class Result {
    public static long aVeryBigSum(List<Long> ar) {
        long result=0;

        for(long e: ar)
            result += e;

        return result;
    }
}

