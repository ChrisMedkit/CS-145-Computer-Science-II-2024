public abstract class StoutPerson implements Comparable<StoutPerson> {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public StoutPerson(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String str = "Stout id: " + id;
        str += "\n" + firstName + " " + lastName;
        str += "\nEmail: " + email;
        return str;
    }

    /**
     * Compares people by Stout id so arrays of StoutPerson can be sorted.
     */
    @Override
    public int compareTo(StoutPerson o) {
        return Integer.compare(this.id, o.getId());
    }
}