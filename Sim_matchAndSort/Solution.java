import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim[] arr = new Sim[4];
        for (int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new Sim(a, b, c, d, e);
        }

        String circle = sc.nextLine();
        double ratePerSecond = sc.nextDouble(); sc.nextLine();

        Sim[] result = matchAndSort(arr, circle, ratePerSecond);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i].getId());
        }
    }

    public static Sim[] matchAndSort(Sim[] arr, String circle, double ratePerSecond ){
        Sim[] arr2 = new Sim[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getCircle().equalsIgnoreCase(circle) && arr[i].getRatePerSecond() < ratePerSecond){
                arr2 = Arrays.copyOf(arr2, arr2.length + 1);
                arr2[arr2.length - 1] = arr[i];
            }
        }

        Arrays.sort(arr2, (s1, s2) -> Integer.compare(s2.getBalance(), s1.getBalance()));
        return arr2;
    }
}

class Sim{
    int id;
    String company;
    int balance;
    double ratePerSecond;
    String circle;

    public Sim(int id, String company, int balance, double ratePerSecond, String circle) {
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public int getBalance() {
        return balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}
