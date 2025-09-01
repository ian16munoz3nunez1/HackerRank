import java.util.Scanner;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert the number of elements: ");
        int count = Integer.parseInt(in.nextLine());

        System.out.print("Insert the array: ");
        List<Integer> ar = Stream.of(in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = Result.simpleArraySum(ar);
        System.out.println(result);

        in.close();
    }
}

class Result {
    public static int simpleArraySum(List<Integer> ar) {
        int sum=0;

        for(int e: ar) {
            sum += e;
        }

        return sum;
    }
}

