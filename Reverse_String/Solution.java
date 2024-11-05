import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String empty = "";
        for (int i = str.length() - 1; i >= 0; i--){
            empty = empty + str.charAt(i);
        }
        System.out.println(empty.toLowerCase());
    }
}
