import java.util.Scanner;

public class Stringpalinrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = input.nextLine();
        char[] arr = str.toCharArray();
        int mid = arr.length / 2;
        int start = 0,end = arr.length -1,flag=1;
        while (end > mid) {
            if (arr[start] == arr[end]) {
                start++;
                end--;
            } else {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
