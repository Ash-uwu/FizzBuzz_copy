/**
 * Count the amount of numbers that are multiples of 3 or 5 within 1000.
 */
public class Multiples {
    public static void main(String[] args) {
        int i = 1;

        int count = 0;
        while (i < 1000){
            if (i % 3 == 0){
                count++;
                i++;
            }
            else if (i % 5 == 0){
                count++;
                i++;
            }
            else{
                i++;
            }
        }
        System.out.println(count);
    }
}
