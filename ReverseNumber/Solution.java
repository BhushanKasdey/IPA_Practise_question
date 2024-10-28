import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        String reverse_num = new StringBuilder(number).reverse().toString();
        System.out.println("The reverse of the number is : "+ reverse_num);
    }
}
