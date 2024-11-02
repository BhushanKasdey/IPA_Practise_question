import javax.swing.text.Element;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                count ++;
            }
        }
        if (count > 0){
            System.out.println(count);
        }
        else {
            System.out.println("No lower case characters present");
        }
    }
}
