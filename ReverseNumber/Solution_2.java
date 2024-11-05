import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0){
            System.out.println(0);
        }
        else {
            while (num != 0){
                System.out.print(num % 10);
                num = num / 10;
            }
        }
    }
}
