import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] arr = new Player[4];
        for (int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Player(a, b, c, d);
        }

        String skill = sc.nextLine();
        String level = sc.nextLine();

        int sum = findPointsForGivenSkill(arr, skill);
        if (sum  > 0 ){
            System.out.println(sum);
        }
        else {
            System.out.println("The given Skill is not available");
        }

        Player result = getPlayerBasedOnLevel(arr, level, skill);
        if (result == null){
            System.out.println("No player is available with specified level, skill and eligibility points");
        }
        else {
            System.out.println(result.getPlayerId());
        }
    }

    public static int findPointsForGivenSkill(Player[] arr, String skill){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getSkill().equalsIgnoreCase(skill)){
                sum = sum + arr[i].getPoints();
            }
        }
        return sum;
    }

    public static Player getPlayerBasedOnLevel(Player[] arr, String level, String skill){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getLevel().equalsIgnoreCase(level) && arr[i].getSkill().equalsIgnoreCase(skill)){
                if (arr[i].getPoints() >= 20)
                    return arr[i];
            }
        }
        return null;
    }
}

class Player{
    int playerId;
    String skill;
    String level;
    int points;

    public Player(int playerId, String skill, String level, int points) {
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getSkill() {
        return skill;
    }

    public String getLevel() {
        return level;
    }

    public int getPoints() {
        return points;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
