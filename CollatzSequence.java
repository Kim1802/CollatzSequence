import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Starting number: ");
        int num = keyboard.nextInt();
        System.out.print(num);
        int step = 0;
        int max = num;

        while (num > 1) {
            if (num % 2 == 0)
                num /= 2;
            else
                num = 3 * num + 1;
            System.out.print("\t" + num);
            if (num > max)
                max = num;
            step++;
        }

        System.out.println("\nTerminated after " + step + " steps.");
        System.out.println("The largest value was " + max + ".");
    }
}
