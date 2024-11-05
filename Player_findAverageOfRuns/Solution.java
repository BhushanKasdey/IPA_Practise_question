import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] arr = new Player[4];
        for (int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            int e = sc.nextInt(); sc.nextLine();

            arr[i] = new Player(a, b, c, d, e);
        }

        int target = sc.nextInt(); sc.nextLine();
        double[] result = findAverageOfRuns(arr, target);
        for (int i = 0; i < result.length; i++){
            if (result[i] >= 80 && result[i] <= 100){
                System.out.println("Grade A");
            } else if (result[i] >= 50 && result[i] <= 79) {
                System.out.println("Grade B");
            }
            else {
                System.out.println("Grade C");
            }
        }
    }

    public static double[] findAverageOfRuns(Player[] arr, int target){
        double[] arr2 = new double[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getMatchesPlayed() >= target){
                arr2 = Arrays.copyOf(arr2, arr2.length + 1);
                arr2[arr2.length - 1] = (double) (arr[i].getRunsScored() / arr[i].getMatchesPlayed());
            }
        }
        return arr2;
    }

}

class Player{
    int id;
    String name;
    int iccRank;
    int matchesPlayed;
    int runsScored;

    public Player(int id, String name, int iccRank, int matchesPlayed, int runsScored) {
        this.id = id;
        this.name = name;
        this.iccRank = iccRank;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getIccRank() {
        return iccRank;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIccRank(int iccRank) {
        this.iccRank = iccRank;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }
}
