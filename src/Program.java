import java.util.Scanner;

/*
 * Student Name: Liying Guo	
 * Lab Professor: Amal Ibrahim
 * Due Date: Aug 4, 2023
 * Description: Lab Exercise 5
 */

/*
 * This program class gives a menu system as the following:
 * given a menu with the list of menu item as:
 * 				1 Enter AQHI Values
				2 Display Report
				3 Reset AQHI Data
				4 Exit Program
 * Run specific function based on user'input if the input is between 1 to 3
 * Stop the application once user inputs 4
 */
public class Program {

	/*
	 * This main function use the do-while structure
	 * the condition to keep in loop is that user's input is not 4
	 * which is the "Exit" option in menu list
	 * In the loop, based user's selected option
	 * invoke the corresponding function of the instance of 
	 * AirQualityHealthIndexRecorder
	 */
	public static void main(String[] args) {
		//declare constant&field variable and assignment 
		final int ENTER_VALUES = 1;
		final int DISPLAY_REPORT = 2;
		final int RESET_VALUES = 3;
		final int EXIT_PROGRAM = 4;
		int option = 0;
		//instantiate an object named aqhi
		AirQualityHealthIndexRecorder aqhi = new AirQualityHealthIndexRecorder();
		//as above
		do
		{
			//Output menu
			System.out.print("""
					1 Enter AQHI Values
					2 Display Report
					3 Reset AQHI Data
					4 Exit Program
					Select option: """);
			//
			Scanner scanner = new Scanner(System.in);
			option = scanner.nextInt();
			switch (option) {
				case 1:
					aqhi.enterData();
					break;
				case 2:
					aqhi.printReport();
					break;
				case 3:
					aqhi.resetData();
					break;
	
				default:
					break;
			}
		}
		while(option!=EXIT_PROGRAM);
		//output my message
		System.out.println(""" 
				Program by Amir Rad
				Program exits
				
				""");
	}

}
