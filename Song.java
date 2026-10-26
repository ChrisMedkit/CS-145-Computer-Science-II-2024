/**
 * Represents a song with its details
 * 
 * This class extends RetailItem
 * 
 */
public class Song extends RetailItem {
    private String artist;
    private int length;

    /**
     * Constructs a new Song with a specified name, length, and artist
     *
     * @param name the name of the song
     * @param length the length of the song in minutes
     * @param artist the name of the artist
     */
    public Song (String name, int length, String artist) {
        super(name, length);
        this.artist = artist;
    }

    /**
     * Constructs a new Song with the specified name, length, artist, and stars
     *
     * @param name the name of the song
     * @param length the length of the song in minutes
     * @param artist the name of the artist
     * @param stars the rating of the song
     */
    public Song (String name, int length, String artist, int stars) {
        super(name, stars);
        this.artist = artist;
    }

    /**
     * Returns the artist of the song
     *
     * @return the artist of the song
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Returns the length of this song.
     *
     * @return the length of the song in minutes
     */
    public int getLength() {
        return length;
    }

    /**
     * Returns a string representation of this song, including its name, stars, artist, and length.
     *
     * @return a string representation of the song
     */
    public String toString() {
        String str = super.toString();
        str += "\nArtist : " + artist;
        str += "\nLength : " + length;
        return str;
    }

    /**
     * Compares this song to another retail item.
     * 
     *
     * @param o the retail item to compare to
     * @return a negative integer, zero, or a positive integer as this song is less than,
     * equal to, or greater than the specified song
     */
    @Override
    public int compareTo(RetailItem o) {
        if (o == null || !(o instanceof Song)) {
            return 1; 
        }
        Song otherSong = (Song) o;
        return Integer.compare(this.getStars(), otherSong.getStars());
    }
}
