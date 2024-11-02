import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory[] arr = new Inventory[4];
        for (int i = 0; i < arr.length; i++){
            String a = sc.nextLine();
            int b = sc.nextInt(); sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Inventory(a, b, c, d);
        }

        int limit = sc.nextInt(); sc.nextLine();
        sc.close();
        Inventory[] result = replenish(arr, limit);
        for (int i = 0; i < result.length; i++){
            if (result[i].getThreshold() > 75){
                System.out.println(result[i].getInventoryId() + " Critical Filling");
            } else if (result[i].getThreshold() >= 50 && result[i].getThreshold() < 75) {
                System.out.println(result[i].getInventoryId() + " Moderate Filling");
            }
            else {
                System.out.println(result[i].getInventoryId() + " Non-Critical Filling");
            }
        }
    }

    public static Inventory[] replenish(Inventory[] arr, int limit){
        Inventory[] arr2 = new Inventory[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getThreshold() <= limit) {
                arr2 = Arrays.copyOf(arr2, arr2.length + 1);
                arr2[arr2.length - 1] = arr[i];
            }
        }
        return arr2;
    }
}

class Inventory{
    String inventoryId;
    int maxQuantity;
    int currQuantity;
    int threshold;

    public Inventory(String inventoryId, int maxQuantity, int currQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maxQuantity = maxQuantity;
        this.currQuantity = currQuantity;
        this.threshold = threshold;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public int getCurrQuantity() {
        return currQuantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public void setCurrQuantity(int currQuantity) {
        this.currQuantity = currQuantity;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
}
