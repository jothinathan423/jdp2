import java.util.*;
public class Palnum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("given number" + num);
        int reversed = reverse(num);
        if (num == reversed) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palidrome");
        }
    }
    public static int reverse(int num){
        int reversed = 0; // 5 6
        while (num != 0) {
            int reminder = num % 10; //5 
            num = num / 10; //0
            reversed = reversed * 10 + reminder;//760+5
        }
        return reversed;
    }


}