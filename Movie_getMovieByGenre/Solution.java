import java.lang.management.MonitorInfo;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] arr = new Movie[4];
        for (int i = 0; i < arr.length; i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Movie(a, b, c, d);
        }

        String genre = sc.nextLine();
        Movie[] result = getMovieByGenre(arr, genre);
        for (int i = 0; i < result.length; i++){
            if (result[i].getBudget() > 80000000){
                System.out.println("High Budget Movie");
            }
            else {
                System.out.println("Low Budget Movie");
            }
        }
    }

    public static Movie[] getMovieByGenre(Movie[] arr, String genre){
        Movie[] arr2 = new Movie[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getGenre().equalsIgnoreCase(genre)){
                arr2 = Arrays.copyOf(arr2, arr2.length + 1);
                arr2[arr2.length - 1] = arr[i];
            }
        }
        return arr2;
    }
}

class Movie{
    String movieName;
    String company;
    String genre;
    int budget;

    public Movie(String movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getCompany() {
        return company;
    }

    public String getGenre() {
        return genre;
    }

    public int getBudget() {
        return budget;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
