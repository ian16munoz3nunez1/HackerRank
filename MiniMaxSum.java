import java.util.Scanner;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Collections;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert the array: ");
        List<Integer> ints = Stream.of(in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        Result.miniMaxSum(ints);

        in.close();
    }
}

class Result {
    public static void miniMaxSum(List<Integer> ints) {
        long min = Collections.min(ints);
        long max = Collections.max(ints);

        long sum=0;
        for(int e: ints) {
            sum += e;
        }

        long minSum = sum-max;
        long maxSum = sum-min;

        System.out.println(minSum + " " + maxSum);
    }
}

