/**
 * A retail item with a name and a rating in stars.
 */
public abstract class RetailItem implements Comparable<RetailItem> {
    /**
     * The name of the retail item.
     */
    private String name;

    /**
     * The rating of the retail item in stars.
     */
    private int stars;

    /**
     * Constructs a new retail item with the specified name and stars
     *
     * @param name the name of the retail item
     * @param stars the rating of the retail item in stars
     */
    public RetailItem(String name, int stars) {
        super();
        this.name = name;
        this.stars = stars;
    }

    /**
     * Returns the name of the retail item.
     *
     * @return the name of the retail item
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the rating of the retail item in stars.
     *
     * @return the rating of the retail item in stars
     */
    public int getStars() {
        return stars;
    }

    /**
     * Sets the rating of the retail item in stars.
     *
     * @param stars the new rating of the retail item in stars
     */
    public void setStars(int stars) {
        this.stars = stars;
    }

    /**
     * Returns a string representation of the retail item, including its name and stars.
     *
     * @return a string representation of the retail item
     */
    public String toString() {
        String str = super.toString();
        str += "\nName : " + name;
        str += "\nStars : " + stars;
        return str;
    }
}
