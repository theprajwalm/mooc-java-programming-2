
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!(input.equals("end"))) {
            int number = Integer.valueOf(input);
            int cube = number * number * number;
            System.out.println(cube);
            input = scanner.nextLine();
        }

    }
}
