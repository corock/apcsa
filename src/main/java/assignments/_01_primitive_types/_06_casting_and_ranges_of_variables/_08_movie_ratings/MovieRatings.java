package assignments._01_primitive_types._06_casting_and_ranges_of_variables._08_movie_ratings;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double movieRating = input.nextDouble();
        int roundedMovieRating = (int) (movieRating + 0.5);
        System.out.print(roundedMovieRating);
    }
}
