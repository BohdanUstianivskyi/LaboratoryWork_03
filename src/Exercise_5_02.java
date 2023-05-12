import java.util.Scanner;
public class Exercise_5_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the starting value of the range: ");
            double start = scanner.nextDouble();
            System.out.print("Enter the end value of the range: ");
            double end = scanner.nextDouble();
            System.out.print("Enter a step: ");
            double step = scanner.nextDouble();

            int count = 0;
            double x = start;
            while (x <= end) {
                double result = Math.sqrt(Math.pow(x, 3) + x + 1.5) / (x + 1);
                if (result >= start && result <= end) {
                    count++;
                }
                x += step;
            }
            if (count > 0) {
                System.out.println("The number of function values that belong to the range: " + count);
            } else {
                System.out.println("There are no function values belonging to the range.");
            }
        }
    }


