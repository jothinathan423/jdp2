import java.util.Scanner;
public class Primeornot{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int count = 0;
        for (int i = 2; i <= num/2; i++) {
            if (num % i != 0) {
                count++;
                continue;
            } else {
                System.out.println("number is not a prime");
                return;
            }
        }
        System.out.println("number is prime");
        System.out.println("count"+count);
    }
}