import java.util.Scanner;

public class Armstrong {
    public static int countdigit(int n){
        int cnt = 0;
        while (n > 0) {
            cnt = cnt + 1;
            n = n / 10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int num2 = num;
        double digit = (double)countdigit(num);
        double temp = 0;
        while (num > 0) {
            double rem = num % 10;
            temp = temp + Math.pow(rem, digit);

            num = num / 10;
        }
        if (num2 == temp) {
            System.out.println("armostring");
        }
        else {
            System.out.println("not");
        }
        
    }
}
