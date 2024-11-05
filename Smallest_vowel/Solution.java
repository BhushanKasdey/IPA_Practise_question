import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        char smallestVowel = 'z';
        for (int i = 1; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
                if (ch < smallestVowel){
                    smallestVowel = ch;
                }
            }
        }

        if (smallestVowel != 'z') {
            System.out.println(smallestVowel);
        }
        else {
            System.out.println("No vowel found");
        }
    }
}
