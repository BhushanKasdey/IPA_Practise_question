import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int v_count = 0, c_count = 0;
        for (int i = 0; i < str.length(); i++){
           char chh = str.charAt(i);
           if (chh >= 'a' && chh <= 'z'){
               if (chh == 'a' || chh == 'e' || chh == 'i' || chh == 'o' || chh == 'u'){
                   v_count ++;
               }
               else {
                   c_count ++;
               }
            }

        }

        System.out.println("Vowels count - "+ v_count);
        System.out.println("Consonants count - "+ c_count);
    }
}
