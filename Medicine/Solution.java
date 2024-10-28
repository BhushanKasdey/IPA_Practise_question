import javax.print.attribute.standard.MediaName;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Medicine[] arr = new Medicine[4];
        for (int i = 0; i < arr.length; i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Medicine(a, b, c, d);
        }

        String disease = sc.nextLine();
        int[] result = getPriceByDisease(arr, disease);
        if (result != null){
            for (int i = 0; i < result.length; i++){
                System.out.println(result[i]);
            }
        }
        else {
            System.out.println("No Medicine Found");
        }
    }

    public static int[] getPriceByDisease(Medicine[] arr, String disease){
        int[] arr2 = new int[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getDisease().equalsIgnoreCase(disease)){
                arr2 = Arrays.copyOf(arr2, arr2.length + 1);
                arr2[arr2.length - 1] = arr[i].getPrice();
                Arrays.sort(arr2);
            }
        }

        if (arr2.length > 0){
            return arr2;
        }
        else {
            return null;
        }
    }
}

class Medicine{
    String MedicineName;
    String batch;
    String disease;
    int price;

    public Medicine(String medicineName, String batch, String disease, int price) {
        MedicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getMedicineName() {
        return MedicineName;
    }

    public String getBatch() {
        return batch;
    }

    public String getDisease() {
        return disease;
    }

    public int getPrice() {
        return price;
    }

    public void setMedicineName(String medicineName) {
        MedicineName = medicineName;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
