import java.util.Scanner;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class SubarrayDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert n: ");
        int n = Integer.parseInt(in.nextLine());

        System.out.print("Insert squares: ");
        List<Integer> squares = Stream.of(in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        System.out.print("Insert d and m: ");
        String[] dm = in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" ");
        int d = Integer.parseInt(dm[0]);
        int m = Integer.parseInt(dm[1]);

        int result = Result.subarrayDivision(squares, d, m);
        System.out.println(result);

        in.close();
    }
}

class Result {
    public static int subarrayDivision(List<Integer> s, int d, int m) {
        int n = s.size();
        int sum, result=0;

        for(int i = 0; i <= n-m; i++) {
            sum=0;
            for(int j = i; j < i+m; j++) {
                sum += s.get(j);
            }

            if(sum == d)
                result++;
        }

        return result;
    }
}

