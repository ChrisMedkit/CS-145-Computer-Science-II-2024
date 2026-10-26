/**
 * A movie item with its name, rating, genre, and star rating.
 * This class extends RetailItem for movies
 */
public class Movie extends RetailItem {
    /**
     * The rating of the movie.
     */
    private String rating;

    /**
     * The genre of the movie.
     */
    private String genre;
    
    /**
     * Constructs a new Movie with the given name, rating, and genre, and a default star rating of 0
     *
     * @param name the name of the movie
     * @param rating the rating of the movie
     * @param genre the genre of the movie
     */
    public Movie(String name, String rating, String genre) {
        super(name, 0);
        this.rating = rating;
        this.genre = genre;
    }
    
    /**
     * Constructs a new Movie with the given name, rating, genre, and specified star rating
     *
     * @param name the name of the movie
     * @param rating the rating of the movie
     * @param genre the genre of the movie
     * @param stars the star rating of the movie
     */
    public Movie(String name, String rating, String genre, int stars) {
        super(name, stars);
        this.rating = rating;
        this.genre = genre;
    }
    
    /**
     * Returns the rating of the movie
     *
     * @return the rating of the movie
     */
    public String getRating() {
        return rating;
    }

    /**
     * Returns the genre of the movie
     *
     * @return the genre of the movie
     */
    public String getGenre() {
        return genre;
    }
    
    /**
     * Returns a string representation of the movie, including its name, star rating, rating, and genre
     *
     * @return a string representation of the movie
     */
    public String toString() {
        String str = super.toString();
        str += "\nRating : " + rating;
        str += "\nGenre : " + genre;
        return str;
    }
 
    /**
     * Compares this movie to another RetailItem. If the other item is not a Movie or is null, this movie is considered greater
     *
     * @param o the RetailItem to compare with
     * @return a negative integer, zero, or a positive integer as this movie is less than, equal to, or greater than the specified movie
     */
    @Override
    public int compareTo(RetailItem o) {
        if (o == null || !(o instanceof Movie)) {
            return 1; 
        }
        Movie otherMovie = (Movie) o;
        try {
            double thisRating = Double.parseDouble(this.rating);
            double otherRating = Double.parseDouble(otherMovie.getRating());
            return Double.compare(thisRating, otherRating);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
