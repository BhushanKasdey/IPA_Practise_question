import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Hotel[] arr = new Hotel[4];
        for (int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            int e = sc.nextInt(); sc.nextLine();

            arr[i] = new Hotel(a, b, c, d, e);
        }

        String hotelCabFacility = sc.nextLine();
        int result = hotelByHighestRating(arr, hotelCabFacility);
        if (result == 0){
            System.out.println("NO HOTEL WITH GIVEN FACILITY" );
        }
        else {
            System.out.println(result);
        }
    }

    public static int hotelByHighestRating(Hotel[] arr, String hotelCabFacility){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getHotelCabFacility().equalsIgnoreCase(hotelCabFacility) && arr[i].getRating() > 5){
                return arr[i].getRating();
            }
        }
        return 0;
    }
}

class Hotel{
    int hotelId;
    String hotelName;
    String hotelCabFacility;
    int rating;
    int fees;

    public Hotel(int hotelId, String hotelName, String hotelCabFacility, int rating, int fees) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelCabFacility = hotelCabFacility;
        this.rating = rating;
        this.fees = fees;
    }

    public int getHotelId() {
        return hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelCabFacility() {
        return hotelCabFacility;
    }

    public int getRating() {
        return rating;
    }

    public int getFees() {
        return fees;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setHotelCabFacility(String hotelCabFacility) {
        this.hotelCabFacility = hotelCabFacility;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
}
