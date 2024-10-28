import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Associate[] arr = new Associate[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Associate(a, b, c, d);
        }

        String technology = sc.nextLine();
        Associate[] result = associatesForGivenTechnology(arr, technology);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i].getId());
        }
    }

    public static Associate[] associatesForGivenTechnology(Associate[] arr, String technology){
        Associate arr2[] = new Associate[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getTechnology().equalsIgnoreCase(technology) && arr[i].getExperienceInYears() % 5 == 0){
                arr2 = Arrays.copyOf(arr2, arr2.length + 1);
                arr2[arr2.length - 1] = arr[i];
            }
        }
        return arr2;
    }
}

class Associate{
    int id;
    String name;
    String technology;
    int experienceInYears;

    public Associate(int id, String name, String technology, int experienceInYears) {
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.experienceInYears = experienceInYears;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTechnology() {
        return technology;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }
}