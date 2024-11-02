import javax.swing.text.Element;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.nextLine();
        double square = Math.sqrt(num);
        if ((int)square == square){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }

    }
}
