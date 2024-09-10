/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {
            // for each iteration, the int i will start at one, and keep on adding
            //one until i hits 100, each iteration will run as long as i is less than
            //100, otherwise, it will stop adding a value to i.

            //parameters for for loop statement: for(start value; end value; how it will increase)

            // Find out which numbers divide i.
            doFizzBuzz(i);
            i++;
        }
    }

    private static void doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}
