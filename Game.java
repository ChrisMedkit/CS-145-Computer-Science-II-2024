public class Game {
    // instance variables
    private String genre;
    private String title;
    private boolean hasCoverArt;
    private String platform;

    // constructor
    public Game(String genre, String title, boolean cover, String platform) {
        this.genre = genre;
        this.title = title;
        this.hasCoverArt = cover;
        this.platform = platform;
    }

    // getters
    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public boolean hasCoverArt() {
        return hasCoverArt;
    }

    public String getPlatform() {
        return platform;
    }

    // setters
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setHasCoverArt(boolean hasCoverArt) {
        this.hasCoverArt = hasCoverArt;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void printGame() {
        System.out.println(this);
    }

    public String toString() {
        return title + " is a(n) " + genre + " game, has cover art: " + hasCoverArt
                + ", on the platform: " + platform;
    }
}