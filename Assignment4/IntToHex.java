import java.util.InputMismatchException;
import java.util.Scanner;

public class IntToHex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;

        while (true) {
            try {
                System.out.println("Enter Integer:");
                input = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input, try again");
                break;
            }
            System.out.println(Integer.toHexString(input));
        }

    }
}
