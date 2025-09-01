import java.util.Scanner;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class BreakingRecords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert the number of elements: ");
        int n = Integer.parseInt(in.nextLine().trim());

        System.out.print("Insert the elements: ");
        List<Integer> scores = Stream.of(in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        List<Integer> result = Result.breakingRecords(scores);
        System.out.println(result.stream().map(Object::toString).collect(Collectors.joining(" ")));

        in.close();
    }
}

class Result {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int most=scores.get(0), least=scores.get(0);
        List<Integer> result = Arrays.asList(0, 0);

        for(int e: scores) {
            if(e > most) {
                most = e;
                result.set(0, result.get(0)+1);
            }

            if(e < least) {
                least = e;
                result.set(1, result.get(1)+1);
            }
        }

        return result;
    }
}

