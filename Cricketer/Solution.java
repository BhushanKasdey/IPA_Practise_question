import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Cricketer[] arr = new Cricketer[4];
        for (int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            int b = sc.nextInt(); sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            String d = sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new Cricketer(a, b, c, d, e);
        }

        int cricketId = sc.nextInt();

        Cricketer player_1 = findCricketerWithMinimumMatchesPlayed(arr);
        System.out.println(player_1.getCricketerId());
        System.out.println(player_1.getMatchesPlayed());

        Cricketer player_2 = searchCricketerByld(arr, cricketId);
        if (player_2 == null){
            System.out.println("No such Cricketer");
        }
        else {
            System.out.println(player_2.getCricketerId()+"::"+player_2.getName());
        }
    }
    public static Cricketer findCricketerWithMinimumMatchesPlayed(Cricketer[] arr){
        Cricketer minimum = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i].getMatchesPlayed() < minimum.getMatchesPlayed()) {
                minimum = arr[i];
            }
        }
        return minimum;
    }

    public static Cricketer searchCricketerByld(Cricketer[] arr, int cricketerId){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getCricketerId() == cricketerId){
                return arr[i];
            }
        }
        return null;
    }
}

class Cricketer{
    int cricketerId;
    int matchesPlayed;
    int totalRuns;
    String cricketerName;
    String Name;

    public Cricketer(int cricketerId, int matchesPlayed, int totalRuns, String cricketerName, String name) {
        this.cricketerId = cricketerId;
        this.matchesPlayed = matchesPlayed;
        this.totalRuns = totalRuns;
        this.cricketerName = cricketerName;
        Name = name;
    }

    public int getCricketerId() {
        return cricketerId;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public String getCricketerName() {
        return cricketerName;
    }

    public String getName() {
        return Name;
    }

    public void setCricketerId(int cricketerId) {
        this.cricketerId = cricketerId;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public void setCricketerName(String cricketerName) {
        this.cricketerName = cricketerName;
    }

    public void setName(String name) {
        Name = name;
    }
}
