import java.util.Scanner;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Collections;

class Result {
    public static int migratoryBirds(List<Integer> arr) {
        List<Integer> result = Arrays.asList(0, 0, 0, 0, 0);

        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 1)
                result.set(0, result.get(0)+1);
            if(arr.get(i) == 2)
                result.set(1, result.get(1)+1);
            if(arr.get(i) == 3)
                result.set(2, result.get(2)+1);
            if(arr.get(i) == 4)
                result.set(3, result.get(3)+1);
            if(arr.get(i) == 5)
                result.set(4, result.get(4)+1);
        }

        int max = Collections.max(result);

        int i = 0;
        while(i < result.size()) {
            if(result.get(i) == max)
                break;
            i++;
        }

        return i+1;
    }
}

public class MigratoryBirds {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        // System.out.print("Insert the length of the array: ");
        // int n = Integer.parseInt(in.nextLine());

        // System.out.print("Insert the array of integers: ");
        // List<Integer> ints = Stream.of(in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" "))
        //     .map(Integer::parseInt)
        //     .collect(Collectors.toList());

        // int n=6;
        // List<Integer> ints = Arrays.asList(1, 4, 4, 4, 5, 3);
        // int n=11;
        // List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);

        int result = Result.migratoryBirds(ints);

        System.out.println(result);
    }
}

