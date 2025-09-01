import java.util.Scanner;

import java.util.List;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class BetweenTwoSets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert the a and b dimensions: ");
        String[] nm = in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        System.out.print("Insert the a array: ");
        List<Integer> a = Stream.of(in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        System.out.print("Insert the b array: ");
        List<Integer> b = Stream.of(in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = Result.getTotalX(a, b);
        System.out.println(result);

        in.close();
    }
}

class Result {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int count=0;
        int start = Collections.max(a);
        int end = Collections.min(b);
        int n = a.size() > b.size() ? a.size() : b.size();

        for(int i = start; i <= end; i++) {
            for(int j = 0; j < n; j++) {
                if(j < a.size() && i%a.get(j)!=0)
                    break;

                if(j < b.size() && b.get(j)%i!=0)
                    break;

                if(j == n-1)
                    count++;
            }
        }

        return count;
    }
}

