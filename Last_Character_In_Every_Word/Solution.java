import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++){
            String word = arr[i];
            char ch = word.charAt(word.length() - 1);
            if (Character.isDigit(ch)){
                continue;
            }
            System.out.print(ch);
        }
    }
}
