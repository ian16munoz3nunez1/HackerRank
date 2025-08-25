import java.util.Scanner;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Collections;

class Result {
    public static int birthday(List<Integer> s, int d, int m) {
        int n = s.size();
        int sum, cont=0;

        for(int i = 0; i <= n-m; i++) {
            sum = 0;
            for(int j = i; j < i+m; j++) {
                sum += s.get(j);
            }

            if(sum == d)
                cont++;
        }

        return cont;
    }
}

public class Birthday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert the number of elements: ");
        int n = Integer.parseInt(in.nextLine());

        System.out.print("Insert the segments: ");
        List<Integer> s = Stream.of(in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        System.out.print("Insert day and month: ");
        String[] dm = in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" ");
        int day = Integer.parseInt(dm[0]);
        int month = Integer.parseInt(dm[1]);

        int result = Result.birthday(s, day, month);

        System.out.println(result);
    }
}

