import java.util.Scanner;

/**
 *Name: Camisha
 *Teacher: Mr. Hardman
 *Assignment Demo, Program #1
 * Date Last Modified: 11/21/2016
 */

/**
 * @author c.pruden
 *
 */
public class ArrayAverages {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		double[] student1 = {56.2, 65.7, 45.32, 89.213, 65, 76, 54, 98, 45, 87.2};
		
		double[] student2 = new double[10];
		
		double average1 = 0;
		double average2 = 0;
		
		System.out.println("Please enter ten marks to be average:");
		
		for(int i = 0; i < student2.length; i++){
			System.out.print("Please enter a mark:");
			student2[i] = userInput.nextDouble();
		}
		
		average1 = calcAverage(student1);
		average2 = calcAverage(student2);
		
		if(average2 > average1){
			
			System.out.println("Your average is greater then student 1's by " + (average2 - average1) + "points.");
		} else if(average2 < average1){
			
			System.out.println("Your average is less then student 1's by " + (average1 - average2) + "points.");
		} else {
			
			System.out.println("Your average is equal to student 1's.");
			
		} 
		
		userInput.close();
		
	}
	
	
    /**
     * (Type the name of the method and give a description of what it does)
     *
    * @param (Name any parameters and what that parameter will store)
    * @return (Describe what will be sent back by this method)
    */
	public static double calcAverage( double[] marks ){
		
		double Average = 0;
		double Sum = 0;
		
		for(int i = 0; i < marks.length; i++){
			Sum += marks[i];
		}
		
		Average = Sum / marks.length;
		
		return Average;
	} 

	

}