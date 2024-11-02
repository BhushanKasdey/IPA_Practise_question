import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] arr = new Movie[4];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();

            arr[i] = new Movie(a, b, c, d);
        }

        String director = sc.nextLine();
        int rating = sc.nextInt(); sc.nextLine();
        int budget = sc.nextInt(); sc.nextLine();

        int result = findAvgBudgetByDirector(arr, director);
        if (result > 0){
            System.out.println(result);
        }
        else {
            System.out.println("Sorry - The given director has not yet directed any movie");
        }

        Movie result2 = getMovieByRatingBudget(arr, rating, budget);
        if (result2 == null){
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }
        else {
            System.out.println(result2.getMovieId());
        }
    }

    public static int findAvgBudgetByDirector(Movie[] arr, String director){
        int avg = 0, s = 0, j = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getDirector().equalsIgnoreCase(director)){
                s = s + arr[i].getBudget();
                j++;
            }
        }
        if (j > 0){
            avg = s / j;
            return avg;
        }
        else {
            return 0;
        }
    }

    public static Movie getMovieByRatingBudget(Movie[] arr, int rating, int budget){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getRating() == rating && arr[i].getBudget() == budget && arr[i].getBudget() % arr[i].getRating() == 0){
                return arr[i];
            }
        }
        return null;
    }
}

class Movie{
    int movieId;
    String director;
    int rating;
    int budget;

    public Movie(int movieId, String director, int rating, int budget) {
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getDirector() {
        return director;
    }

    public int getRating() {
        return rating;
    }

    public int getBudget() {
        return budget;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
