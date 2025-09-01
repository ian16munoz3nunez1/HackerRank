import java.util.Scanner;

public class SolveMeFirst {
    public static int solveMeFirst(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert the first number: ");
        int a = Integer.parseInt(in.nextLine());
        System.out.print("Insert the second number: ");
        int b = Integer.parseInt(in.nextLine());

        int result = solveMeFirst(a, b);

        System.out.println(result);

        in.close();
    }
}
