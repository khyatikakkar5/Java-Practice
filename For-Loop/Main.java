public class Main {
        public static void main(String... args) {

            for (int counter = 1; counter <= 5; counter++) {
                System.out.println(counter);
            }

            for (double interestRate = 2; interestRate <= 5; interestRate++) {

                System.out.println("10000 at " +interestRate +"% interest = " + calculateInterest(10000, interestRate));
            }
        }

        public static double calculateInterest( double amount, double interestRate){

             return (amount * ( interestRate / 100));
        }
} 
