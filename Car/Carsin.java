
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.LinkedList;
	import java.util.Scanner;

	public class Carsin {
	    public static void main(String[] args) {
	        LinkedList<Car> cars = new LinkedList<>();
	        try {
	            File file = new File("cars.txt");
	            Scanner scanner = new Scanner(file);
	            scanner.nextLine();
	            while (scanner.hasNextLine()) {
	                String[] carData = scanner.nextLine().split(",");
	                cars.add(new Car(carData[0], carData[1], carData[2], Integer.parseInt(carData[3])));
	            }
	            scanner.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }

	    //    System.out.println("All Cars:");
	    //    Car.printList(cars);

	       System.out.println("\nBMWs:");
	       LinkedList<Car> listBMWs = Car.getListOfMake(cars, "BMW");
	       Car.printList(listBMWs);

	   //     System.out.println("\nCars from 1988 to 2003:");
	   //    LinkedList<Car> listYears = Car.getListOfYearsRange(cars, 1988, 2003);
	   //    Car.printList(listYears);

	   //     System.out.println("\nFords from 2000 to 2009:");
	   //     LinkedList<Car> listFords = Car.getListOfMake(cars, "Ford");
	   //     LinkedList<Car> listFordsDecade = Car.getListOfYearsRange(listFords, 2000, 2009);
	   //     Car.printList(listFordsDecade);
	    }
	}
