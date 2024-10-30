import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Phone[] arr = new Phone[4];
        for (int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Phone(a, b, c, d);
        }

        String brand = sc.nextLine();
        String os = sc.nextLine();

        int result = findPriceForGivenBrand(arr, brand);
        if (result > 0){
            System.out.println(result);
        }
        else {
            System.out.println("The given Brand is not available");
        }

        Phone result_2 = getPhoneIdBasedOnOs(arr, os);
        if (result_2 == null){
            System.out.println("No phones are available with specified os and price range");
        }
        else {
            System.out.println(result_2.getPhoneId());
        }
    }

    public static int findPriceForGivenBrand(Phone[] arr, String brand){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getBrand().equalsIgnoreCase(brand)){
                sum = sum + arr[i].getPrice();
            }
        }
        return sum;
    }

    public static Phone getPhoneIdBasedOnOs(Phone[] arr, String os){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getOs().equalsIgnoreCase(os) && arr[i].getPrice() >= 50000){
                return arr[i];
            }
        }
        return null;
    }
}

class Phone{
    int phoneId;
    String os;
    String brand;
    int price;

    public Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public String getOs() {
        return os;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
