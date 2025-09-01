import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert the matrix size: ");
        int n = Integer.parseInt(in.nextLine());

        System.out.println("Insert the matrix: ");
        List<List<Integer>> matrix = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> {
            matrix.add(
                Stream.of(in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList())
            );
        });

        int result = Result.diagonalDifference(matrix);
        System.out.println(result);

        in.close();
    }
}

class Result {
    public static int diagonalDifference(List<List<Integer>> matrix) {
        int sum1=0, sum2=0, n=matrix.size();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j == i)
                    sum1 += matrix.get(i).get(j);

                if(j == (n-1)-i)
                    sum2 += matrix.get(i).get(j);
            }
        }

        return Math.abs(sum1 - sum2);
    }
}

