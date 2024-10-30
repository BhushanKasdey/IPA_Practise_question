import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Institution[] arr = new Institution[4];
        for (int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new Institution(a, b, c, d, e);
        }

        String location = sc.nextLine();
        String instituionName = sc.nextLine();

        int result = findNumClearancedByLoc(arr, location);
        if (result > 0){
            System.out.println(result);
        }
        else {
            System.out.println("There are no cleared students in this particular location");
        }

        Institution result_2 = updateInstitutionGrade(arr, instituionName);
        if (result_2 == null){
            System.out.println(" No Institute is available with the specified name");
        }
        else {
            System.out.println(result_2.getInstitutionName()+"::"+result_2.getGrade());
        }
    }

    public static int findNumClearancedByLoc(Institution[] arr, String location){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getLocation().equalsIgnoreCase(location)){
                sum = sum + arr[i].getGetNoOfStudentsCleared();
            }
        }
        return sum;
    }

    public static Institution updateInstitutionGrade(Institution[] arr, String institutionName){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getInstitutionName().equalsIgnoreCase(institutionName)){
                int rating = (arr[i].getNoOfStudentsPlaced() * 100) / (arr[i].getGetNoOfStudentsCleared());
                if (rating >= 80){
                    arr[i].setGrade("A");
                }
                else {
                    arr[i].setGrade("B");
                }
                return arr[i];
            }
        }
        return null;
    }
}

class Institution{
    int institutionId;
    String institutionName;
    int noOfStudentsPlaced;
    int getNoOfStudentsCleared;
    String location;
    String grade;

    public Institution(int institutionId, String institutionName, int noOfStudentsPlaced, int getNoOfStudentsCleared, String location) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.getNoOfStudentsCleared = getNoOfStudentsCleared;
        this.location = location;
    }

    public int getInstitutionId() {
        return institutionId;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public int getNoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public int getGetNoOfStudentsCleared() {
        return getNoOfStudentsCleared;
    }

    public String getLocation() {
        return location;
    }

    public String getGrade() {
        return grade;
    }

    public void setInstitutionId(int institutionId) {
        this.institutionId = institutionId;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public void setNoOfStudentsPlaced(int noOfStudentsPlaced) {
        this.noOfStudentsPlaced = noOfStudentsPlaced;
    }

    public void setGetNoOfStudentsCleared(int getNoOfStudentsCleared) {
        this.getNoOfStudentsCleared = getNoOfStudentsCleared;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
