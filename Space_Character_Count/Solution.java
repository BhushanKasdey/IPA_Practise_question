import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int s_count = 0, c_count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                s_count ++;
            }
            else {
                c_count ++;
            }
        }
        System.out.println("No of spaces : " + s_count + " and characters : " + c_count);
    }
}
