

/*
 /*
 * Student Name: Liying Guo
 * Lab Professor: Amal Ibrahim
 * Due Date: Aug 4, 2023
 * Description: Lab Exercise 5
 */

/*
 * This is the class to provide the following functionalities:
 * 1. enterData: collect data from user and keep the count of specific number
 * 	  in a specific element of the array
 * 2. printReport: print a bar graph chart as the report of the records 
 *    kept in the array
 * 3. Reset array: clean array for next game
 * 
 */
public class AirQualityHealthIndexRecorder {
	private static final int AQHI_MAX = 10;
	private int[] values = null;
	
	/*
	 * No-argument constructor, creates an array of the size of the maximum value of
	 * Air Quality Index (AQI) to record data.
	 */
	public AirQualityHealthIndexRecorder() {
		values = new int[AQHI_MAX];
	}
	
	/*
	 * This method originally prompted the user to enter integer values between 1,
	 * i.e. min, to the max value which is based on the AQHI_MAX constant value.
	 * After each value the user was asked if they would like to enter more values
	 * (y/n). Each value is used as an index, offset by -1, in the array and for
	 * each entry the count stored in the associated element is increased by 1.
	 */
	public void enterData() {
		int input = 0;
		int min = 1;
		int max = AQHI_MAX;
		String continueDataEntry = null;
		do {
			input = User.inputInteger("Enter AQHI value: ", min, max);
			// numbers will be from 1 to AQHI_MAX, so offset by -1 as index
			// and add 1 to the value in the indexed element.
			// i.e. AQHI value 1 is stored at index 0 and so on.
			values[input - 1]++;
			continueDataEntry = User.inputString("Enter another? (y/n): ", new String[] { "y", "n" });
		}while(continueDataEntry.equalsIgnoreCase("y") );
	}
	
	/*
	 * This function is to give the bar chart of Air Quality Health Index
	 * It has a main loop to traverse the array and out put the index+1 as label
	 * Within each loop, an inner loop is used to print some amount of * to indicate
	 * how many times the label number user entered
	 * after inner-for loop output a new-line
	 */
	public void printReport() {
		//this is the main loop to traverse the array
		for(int index = 0; index < values.length; index++) {
			//out put the index+1 as label of the bar graph
			System.out.printf("%d ",index+1);
			//this is the inner loop is to print some amount of * to indicate
			//how many times the label number user entered
			for(int count=1;count<=values[index];count++)
			{
				System.out.print("*");
			}
			//after inner-for loop output a new-line
			System.out.println();
		}
	}
	
	/*
	 * This method iterates over the values array and
	 * places zero into each element.
	 */
	public void resetData() {
		for(int index = 0; index < values.length; index++) {
			values[index] = 0; // zero out each element
		}
	}
}
