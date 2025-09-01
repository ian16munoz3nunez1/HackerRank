import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert the dimesion: ");
        int n = Integer.parseInt(in.nextLine());

        Result.staircase(n);

        in.close();
    }
}

class Result {
    public static void staircase(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < n-i; j++)
                System.out.print(" ");

            for(int j = 0; j < i; j++)
                System.out.print("#");

            System.out.println();
        }
    }
}

