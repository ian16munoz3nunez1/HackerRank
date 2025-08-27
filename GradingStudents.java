import java.util.Scanner;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class GradingStudents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert the number of grades: ");
        int gradesCount = Integer.parseInt(in.nextLine());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            return in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ");
        }).map(String::trim).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = Result.gradingStudents(grades);

        result.forEach(System.out::println);

        in.close();
    }
}

class Result {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();

        for(int e: grades) {
            if(e%5 >= 3 && e >= 38) {
                int diff = 5 - (e%5);
                result.add(e+diff);
            }
            else
                result.add(e);
        }

        return result;
    }
}

