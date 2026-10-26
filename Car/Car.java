import java.util.LinkedList;

public class Car {
    private String vin;
    private String make;
    private String model;
    private int year;

    public Car(String vin, String make, String model, int year) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getVin() {
        return vin;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car: " +
                "vin: " + vin +
                " make: " + make + 
                " model: " + model + 
                " year:  " + year ;
    }

    public static void printList(LinkedList<Car> list) {
        for (Car car : list) {
            System.out.println(car);
        }
    }

    //sort by make
    
   public static LinkedList<Car> getListOfMake(LinkedList<Car> list, String make) {
        LinkedList<Car> makeList = new LinkedList<>();
        for (Car car : list) {
            if (car.getMake().equalsIgnoreCase(make)) {
                makeList.add(car);
            }
        }
       return makeList;
    }

    //sort by years
    
  //  public static LinkedList<Car> getListOfYearsRange(LinkedList<Car> list, int startYear, int endYear) {
   //     LinkedList<Car> yearsList = new LinkedList<>();
   //     for (Car car : list) {
   //         if (car.getYear() >= startYear && car.getYear() <= endYear) {
   //             yearsList.add(car);
   //         }
   //     }
   //     return yearsList;
    }

