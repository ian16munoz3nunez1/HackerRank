import java.util.Scanner;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert n and k: ");
        String[] nk = in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        System.out.print("Insert the array: ");
        List<Integer> divisible = Stream.of(in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = Result.divisibleSumPairs(n, k, divisible);
        System.out.println(result);

        in.close();
    }
}

class Result {
    public static int divisibleSumPairs(int n, int k, List<Integer> divisible) {
        int result=0;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if((divisible.get(i)+divisible.get(j))%k == 0)
                    result++;
            }
        }

        return result;
    }
}

