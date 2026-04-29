import java.util.Scanner;

public class weedkly_work_hours {
	

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		  String[] NAMES = {"Tom", "Jane", "Mark"};
	        String[] DAYS = {"MON", "TUE", "WED", "THU", "FRI"};

	        // 2D array to store hours (rows = employees, columns = days)
	        double[][] hours = new double[NAMES.length][DAYS.length];

	        // Invoke methods
	        input_hours(hours, NAMES, DAYS);
	        display_hours(hours, NAMES, DAYS);
	        
	        System.out.println("-------------------------------------------");
	        System.out.println("Total hours : " + totalHours(hours, NAMES, DAYS));
	        
	        totalHoursByEmployee(hours, NAMES, DAYS);
	    }

	    // 1) Method to enter work hours
	    public static void input_hours(double[][] hours, String[] NAMES, String[] DAYS) {
	        Scanner sc = new Scanner(System.in);
	        for (int i = 0; i < NAMES.length; i++) {
	            System.out.println("Enter the work hours for " + NAMES[i]);
	            for (int j = 0; j < DAYS.length; j++) {
	                System.out.print(DAYS[j] + " : ");
	                hours[i][j] = sc.nextDouble();
	            }
	        }
	    }

	    // 2) Method to display all work hours in a table
	    public static void display_hours(double[][] hours, String[] NAMES, String[] DAYS) {
	        System.out.println("\nDisplay Weekly Work Hours");
	        System.out.print("\t");
	        for (String day : DAYS) {
	            System.out.print(day + "\t");
	        }
	        System.out.println("\n-------------------------------------------");

	        for (int i = 0; i < NAMES.length; i++) {
	            System.out.print(NAMES[i] + "\t| ");
	            for (int j = 0; j < DAYS.length; j++) {
	                System.out.print(hours[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }

	    // 3) Method to compute the grand total of all hours
	    public static double totalHours(double[][] hours, String[] NAMES, String[] DAYS) {
	        double grandTotal = 0;
	        for (int i = 0; i < hours.length; i++) {
	            for (int j = 0; j < hours[i].length; j++) {
	                grandTotal += hours[i][j];
	            }
	        }
	        return grandTotal;
	    }

	    // 4) Method to show total hours for each employee
	    public static void totalHoursByEmployee(double[][] hours, String[] NAMES, String[] DAYS) {
	        for (int i = 0; i < NAMES.length; i++) {
	            double empTotal = 0;
	            for (int j = 0; j < DAYS.length; j++) {
	                empTotal += hours[i][j];
	            }
	            System.out.println("Total hours for " + NAMES[i] + " : " + empTotal);
	        }
	    }
	


	}


