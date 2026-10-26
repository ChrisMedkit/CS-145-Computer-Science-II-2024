public class Instructor extends StoutPerson {

    private String department;

    public Instructor(int id, String firstName, String lastName, String email, String department) {
        super(id, firstName, lastName, email);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartment: " + department;
    }
}
