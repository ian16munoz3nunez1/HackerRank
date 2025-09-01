import java.util.Scanner;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert s and t: ");
        String[] st = in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" ");
        int s = Integer.parseInt(st[0]);
        int t = Integer.parseInt(st[1]);

        System.out.print("Insert a and b: ");
        String[] ab = in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);

        System.out.print("Insert m and n: ");
        String[] mn = in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" ");
        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);

        System.out.print("Insert the apples: ");
        List<Integer> apples = Stream.of(in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" "))
            .map(Integer::parseInt).collect(Collectors.toList());

        System.out.print("Insert the oranges: ");
        List<Integer> oranges = Stream.of(in.nextLine().replaceAll("\\s+$", "").replaceAll("\\s+", " ").split(" "))
            .map(Integer::parseInt).collect(Collectors.toList());

        Result.countApplesAndOranges(s, t, a, b, apples, oranges);

        in.close();
    }
}

class Result {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int apple=0, orange=0;

        for(int i: apples) {
            if(a+i >= s && a+i <= t)
                apple++;
        }

        for(int i: oranges) {
            if(b+i >= s && b+i <= t)
                orange++;
        }

        System.out.println(apple);
        System.out.println(orange);
    }
}

