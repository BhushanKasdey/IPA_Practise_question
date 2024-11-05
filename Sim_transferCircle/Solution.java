import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim[] arr = new Sim[5];
        for (int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble(); sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new Sim(a, b, c, d, e);
        }

        String circle1 = sc.nextLine();
        String circle2 = sc.nextLine();

        Sim[] result = transferCircle(arr, circle1, circle2);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i].getSimId() + " " + result[i].getCustomerName() + " " + result[i].getCircle() + " " + result[i].getRatePerSecond());
        }
    }

    public static Sim[] transferCircle(Sim[] arr, String circle1, String circle2){
        Sim[] arr2 = new Sim[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getCircle().equalsIgnoreCase(circle1)){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length - 1] = arr[i];
                arr2[arr2.length - 1].setCircle(circle2);
            }
        }

        Arrays.sort(arr2, (s1, s2) -> Double.compare(s2.getRatePerSecond(), s1.getRatePerSecond()));
        return arr2;
    }
}

class Sim{
    int simId;
    String customerName;
    double balance;
    double ratePerSecond;
    String circle;

    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getSimId() {
        return simId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setSimId(int simId) {
        this.simId = simId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}
