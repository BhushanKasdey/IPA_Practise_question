import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NavalVessel[] arr = new NavalVessel[4];
        for (int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new NavalVessel(a, b, c, d, e);
        }
        int percentage = sc.nextInt(); sc.nextLine();
        String purpose = sc.nextLine();

        int result = findAvgVoyagesByPct(arr, percentage);
        if (result > 0){
            System.out.println(result);
        }
        else {
            System.out.println("There are no voyages completed with this percentage");
        }

        NavalVessel result_2 = findVesselByGrade(arr, purpose);
        if (result_2 == null){
            System.out.println("No Naval Vessel is available with the specified purpose");
        }
        else {
            System.out.println(result_2.getVesselName() + "%" + result_2.getClassification());
        }
    }

    public static int findAvgVoyagesByPct(NavalVessel[] arr, int percentage){
        int avg = 0, count = 0;
        for (int i = 0; i < arr.length; i++){
            int percent = (arr[i].getNoOfVoyagesCompleted() * 100) / arr[i].getNoOfVoyagesPlanned();
            if (percent >= percentage){
                avg = avg + arr[i].getNoOfVoyagesCompleted();
                count ++;
            }
        }
        if (count > 0){
            return avg / count;
        }
        else {
            return 0;
        }
    }

    public static NavalVessel findVesselByGrade(NavalVessel[] arr, String purpose){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getPurpose().equalsIgnoreCase(purpose)){
                int percent = (arr[i].getNoOfVoyagesCompleted() * 100) / arr[i].getNoOfVoyagesPlanned();
                if (percent == 100){
                    arr[i].setClassification("Star");
                } else if (percent >= 80 && percent <= 99) {
                    arr[i].setClassification("Leader");
                } else if (percent >= 55 && percent <= 79) {
                    arr[i].setClassification("Inspirer");
                }
                else {
                    arr[i].setClassification("Striver");
                }
                return arr[i];
            }

        }
        return null;
    }
}

class NavalVessel{
    int vesselId;
    String vesselName;
    int noOfVoyagesPlanned;
    int noOfVoyagesCompleted;
    String purpose;
    String classification;

    public NavalVessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
        this.purpose = purpose;
    }

    public int getVesselId() {
        return vesselId;
    }

    public String getVesselName() {
        return vesselName;
    }

    public int getNoOfVoyagesPlanned() {
        return noOfVoyagesPlanned;
    }

    public int getNoOfVoyagesCompleted() {
        return noOfVoyagesCompleted;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getClassification() {
        return classification;
    }

    public void setVesselId(int vesselId) {
        this.vesselId = vesselId;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public void setNoOfVoyagesPlanned(int noOfVoyagesPlanned) {
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
    }

    public void setNoOfVoyagesCompleted(int noOfVoyagesCompleted) {
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
}
