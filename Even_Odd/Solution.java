import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        while (number !=0){
            int remainder =  number % 10;
            if (remainder % 2 != 0){
                count++;
            }
            number = number / 10;
        }
        if (count >= 3){
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }

    }
}
