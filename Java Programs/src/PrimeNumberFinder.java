
    import java.util.Scanner;

     class PrimeNumberFinder {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the range
            System.out.print("Enter the lower bound of the range: ");
            int lowerBound = scanner.nextInt();

            System.out.print("Enter the upper bound of the range: ");
            int upperBound = scanner.nextInt();

            System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + " are:");

            // Find and print prime numbers in the range
            for (int i = lowerBound; i <= upperBound; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }

            scanner.close();
        }

        // Function to check if a number is prime
        private static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


