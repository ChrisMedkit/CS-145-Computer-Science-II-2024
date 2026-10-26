/**
 * Class to do computations on a two-dimensional array.
 */
public class PrecipatationDriver {

    // constants for size of 2D array
    private final static int MONTHS = 12;
    private final static int YEARS = 5;
    private final static int STARTYEAR = 2017;
    private final static String[] monthLabel = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    // raw data for precipitation per month from 2017-2021
    private static double[][] precipitationAmount = {
        { 6.28, 12.16, 2.69, 5.76, 6.86, 16.91, 5.41, 3.82, 6.97, 1.67, 5.62, 14.02 },
        { 16.27, 4.55, 5.01, 8.86, 14.79, 1.52, 0.60, 13.48, 2.77, 12.78, 8.74, 4.64 },
        { 16.83, 11.66, 1.52, 7.95, 5.71, 13.64, 15.52, 16.29, 17.51, 12.34, 13.03, 14.72 },
        { 10.40, 11.32, 0.72, 5.33, 9.26, 10.40, 2.91, 7.99, 16.27, 6.31, 2.64, 13.77 },
        { 13.63, 15.18, 15.65, 1.30, 5.78, 16.82, 12.38, 15.19, 12.16, 6.84, 0.12, 4.37 },
    };

    // arrays to be filled with data calculated from precipitationAmount
    public static double[] yearTotal = new double[YEARS];
    public static double[] monthlyAverage = new double[MONTHS];

    /**
     * The main method
     */
    public static void main(String[] args) {
        printTable();
        System.out.println("\nMax and Min:");
        printMax();
        printMin();
    }

    /**
     * printTable outputs the data stored in the two-dimensional array,
     * the total for each year, and the average for each month.
     */
    public static void printTable() {
        calculateYearTotal();
        calculateMonthlyAverage();

        // header row
        System.out.printf("%7s", "Year");
        for (int i = 0; i < monthLabel.length; i++) {
            System.out.printf("%7s", monthLabel[i]);
        }
        System.out.printf("%7s", "Total");
        System.out.println();

        // data rows
        for (int year = 0; year < precipitationAmount.length; year++) {
            System.out.printf("%7d", STARTYEAR + year);
            for (int month = 0; month < precipitationAmount[year].length; month++) {
                System.out.printf("%7.2f", precipitationAmount[year][month]);
            }
            System.out.printf("%7.2f", yearTotal[year]);
            System.out.println();
        }

        // monthly average row
        System.out.printf("%7s", "Avg");
        for (int month = 0; month < monthlyAverage.length; month++) {
            System.out.printf("%7.2f", monthlyAverage[month]);
        }
        System.out.println();
    }

    /**
     * printMax will print out the maximum amount, month and year
     */
    public static void printMax() {
        double maxValue = precipitationAmount[0][0];
        int maxYearIndex = 0;
        int maxMonthIndex = 0;

        for (int year = 0; year < precipitationAmount.length; year++) {
            for (int month = 0; month < precipitationAmount[year].length; month++) {
                if (precipitationAmount[year][month] > maxValue) {
                    maxValue = precipitationAmount[year][month];
                    maxYearIndex = year;
                    maxMonthIndex = month;
                }
            }
        }

        System.out.printf("Max: %.2f, Month: %s, Year: %d%n",
                maxValue, monthLabel[maxMonthIndex], STARTYEAR + maxYearIndex);
    }

    /**
     * printMin will print out the minimum amount, month and year
     */
    public static void printMin() {
        double minValue = precipitationAmount[0][0];
        int minYearIndex = 0;
        int minMonthIndex = 0;

        for (int year = 0; year < precipitationAmount.length; year++) {
            for (int month = 0; month < precipitationAmount[year].length; month++) {
                if (precipitationAmount[year][month] < minValue) {
                    minValue = precipitationAmount[year][month];
                    minYearIndex = year;
                    minMonthIndex = month;
                }
            }
        }

        System.out.printf("Min: %.2f, Month: %s, Year: %d%n",
                minValue, monthLabel[minMonthIndex], STARTYEAR + minYearIndex);
    }

    /**
     * Fill array monthlyAverage with data from precipitationAmount.
     */
    public static void calculateMonthlyAverage() {
        for (int month = 0; month < MONTHS; month++) {
            double sum = 0.0;
            for (int year = 0; year < precipitationAmount.length; year++) {
                sum += precipitationAmount[year][month];
            }
            monthlyAverage[month] = sum / precipitationAmount.length;
        }
    }

    /**
     * Fill array yearTotal with data from precipitationAmount.
     */
    public static void calculateYearTotal() {
        for (int year = 0; year < precipitationAmount.length; year++) {
            double sum = 0.0;
            for (int month = 0; month < precipitationAmount[year].length; month++) {
                sum += precipitationAmount[year][month];
            }
            yearTotal[year] = sum;
        }
    }
}