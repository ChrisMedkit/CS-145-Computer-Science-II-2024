public class Student extends StoutPerson {

    private int startYear;
    private double gpa;
    private String major;

    public Student(int id, String firstName, String lastName, String email,
                   int startYear, double gpa, String major) {
        super(id, firstName, lastName, email);
        this.startYear = startYear;
        this.gpa = gpa;
        this.major = major;
    }

    // getters and setters
    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "\nStart Year: " + startYear;
        str += "\nGPA: " + gpa;
        str += "\nMajor: " + major;
        return str;
    }
}
