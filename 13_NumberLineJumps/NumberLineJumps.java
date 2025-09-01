import java.util.Scanner;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class NumberLineJumps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert the data: ");
        String[] kangaroos = in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" ");

        int x1 = Integer.parseInt(kangaroos[0]);
        int v1 = Integer.parseInt(kangaroos[1]);

        int x2 = Integer.parseInt(kangaroos[2]);
        int v2 = Integer.parseInt(kangaroos[3]);

        String result = Result.numberLineJumps(x1, v1, x2, v2);

        System.out.println(result);

        in.close();
    }
}

class Result {
    public static String numberLineJumps(int x1, int v1, int x2, int v2) {
        return (v1>v2 && (x2-x1)%(v1-v2)==0) ? "YES" : "NO";
    }
}

