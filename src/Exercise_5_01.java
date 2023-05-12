import java.util.Scanner;
public class Exercise_5_01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the starting value of the range: ");
            double start = scanner.nextDouble();
            System.out.print("Enter the end value of the range: ");
            double end = scanner.nextDouble();
            System.out.print("Enter a step: ");
            double step = scanner.nextDouble();

            int count = 0;
            for (double x = start; x <= end; x += step) {
                double result = Math.sqrt(Math.pow(x, 3) + x + 1.5) / (x + 1);
                System.out.println("f(" + x + ") = " + result);

                if (result >= 2 && result <= 4) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("The number of function values that belong to the range: " + count);
            } else {
                System.out.println("There are no function values belonging to the range.");
            }
        }
    }


