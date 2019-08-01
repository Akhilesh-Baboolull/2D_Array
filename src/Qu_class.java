import java.util.Scanner;

/**
 * 
 */

/**
 * @author Akhilesh
 *
 */
public class Qu_class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myIn = new Scanner(System.in);
				
		int[][] studDb;
		int numOfStuds;
		final int NUMOFMODULES = 6;
		
		do {
			System.out.print("Enter number of Students: ");
			numOfStuds = myIn.nextInt();
			
			if(numOfStuds <= 0) { //validating first index of the array
				System.out.print("Wrong Number of students entered! Please Re-Enter.");
			}
			
		}while(numOfStuds <= 0);
		
		studDb = new int[numOfStuds][NUMOFMODULES]; //defining 2D array
		
		
		for(int row = 0;row <= studDb.length - 1;row++) { //insertion in the array
			
			System.out.println("Details for Student " + (row + 1) + " : ");
			
			for(int col = 0;col <= studDb[0].length - 1;col++) {
				
				if(col == 0) {
					System.out.print("Enter Marks for Applied Maths: ");
					studDb[row][col] = myIn.nextInt();
				}
				else if(col == 1) {
					System.out.print("Enter Marks for Fundamentals Of IT: ");
					studDb[row][col] = myIn.nextInt();
				}
				else if(col == 2) {
					System.out.print("Enter Marks for Programming and Algorithm: ");
					studDb[row][col] = myIn.nextInt();
				}
				else if(col == 3) {
					System.out.print("Enter Marks for Hardware Maintenance & Networking: ");
					studDb[row][col] = myIn.nextInt();
				}
				else if(col == 4) {
					System.out.print("Enter Marks for Fundamentals Of Management: ");
					studDb[row][col] = myIn.nextInt();
				}
				else if(col == 5) {
					System.out.print("Enter Marks for Machine Learning With Python: ");
					studDb[row][col] = myIn.nextInt();
					
				}
			}
			
		}
		
		System.out.println(); //leaving a line
		//Output in the form of a table with headings
		System.out.println("Stud Num     AP     IT     Prog     H&N     Mgmt     Py");
			for(int row = 0;row <= studDb.length - 1;row++) {
			
				System.out.print((row + 1) + "            ");
				
			for(int col = 0;col <= studDb[0].length - 1;col++) {
		
				System.out.print(studDb[row][col] + "      ");
						
			}
			
			System.out.println(); //Change line after each student
			
			}
		
		
		
		
		
		myIn.close();
	}

}
