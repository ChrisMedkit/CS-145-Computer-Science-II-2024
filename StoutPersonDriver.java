import java.util.Arrays;

public class StoutPersonDriver {

    public static void main(String[] args) {

        Student me = new Student(21, "Alex", "Smith", "asmith@example.edu", 2023, 4.0, "CS");
        System.out.println(me);
        System.out.println();

        StoutPerson[] stouties = new StoutPerson[4];
        stouties[0] = new Student(54321, "Taylor", "Jones", "tjones@example.edu", 2004, 3.8, "ART");
        stouties[1] = me;
        stouties[2] = new Instructor(1001, "Jordan", "Lee", "jlee@example.edu", "Computer Science");

        // sort by id (uses compareTo in StoutPerson)
        Arrays.sort(stouties);

        System.out.println("Sorted by id:");
        for (StoutPerson person : stouties) {
            System.out.println(person);
            System.out.println();
        }
    }
}