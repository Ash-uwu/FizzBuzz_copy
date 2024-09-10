/**
 * Print out how many steps it takes to reach 0 if you start at 100.
 */
public class Reduce {
    public static void main(String[] args) {
        int n = 2;
        int steps = 0;

        while (n != 0){
            if (n % 2 == 0){
                n = n / 2;
                steps++;
            }
            else{
                n--;
                steps++;
            }
        }
        System.out.println(steps);
    }
}
