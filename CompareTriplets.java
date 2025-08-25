import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class CompareTriplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert Alice points: ");
        List<Integer> a = Stream.of(in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        System.out.print("Insert Bob points: ");
        List<Integer> b = Stream.of(in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+$", " ").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        List<Integer> result = Result.compareTriplets(a, b);
        System.out.println(result.stream().map(Object::toString).collect(Collectors.joining(" ")));

        in.close();
    }
}

class Result {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = Arrays.asList(0, 0);

        for(int i = 0; i < 3; i++) {
            if(a.get(i) == b.get(i))
                continue;

            if(a.get(i) > b.get(i))
                result.set(0, result.get(0)+1);

            if(a.get(i) < b.get(i))
                result.set(1, result.get(1)+1);
        }

        return result;
    }
}

