import java.util.ArrayList;
import java.util.Collections;


public class SongandMovieDriver {

    public static void main(String[] args) {
        
        //array list
        ArrayList<RetailItem> items = new ArrayList<>();
        
        // create the 4 songs
        items.add(new Song("Bad Habit", 232, "Steve Lacy", 4));
        items.add(new Song("Break My Soul", 278, "Beyonce", 5));
        items.add(new Song("Spitting Off the Edge of the World", 257, "Yeah, Yeah, Yeahs, Perfume Genius", 4));
        
        // as it was
        Song asItWas = new Song("As It Was", 167, "Harry Styles");
        asItWas.setStars(5);
        items.add(asItWas);
        
        // create the 4 movies
        items.add(new Movie("Everything Everywhere All at Once", "R", "Adventure, Sci-Fi", 5));
        items.add(new Movie("Top Gun: Maverick", "PG-13", "Action, Adventure", 4));
        items.add(new Movie("Nope", "R", "Horror", 3));
        
        //avatar
        Movie avatar = new Movie("Avatar: The Way of Water", "PG", "Adventure, Fantasy");
        avatar.setStars(4);
        items.add(avatar);

        //SORT
        Collections.sort(items);
        Collections.reverse(items);

        for (RetailItem item : items) {
            System.out.println(item);
        }
    }
}
