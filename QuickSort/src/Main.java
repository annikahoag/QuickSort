import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Quick qu = new Quick ();
		Scanner scn = new Scanner(System.in);
		int num, userInput;
		boolean runAgain=true;
		
		/*add one integer to start, 
		error check for input mismatch, if true add zero at index 1*/
		try {
			System.out.println("Please add one number to the array to start: ");
			num = scn.nextInt();
			qu.addArray(num);
		}catch(java.util.InputMismatchException e) {
			System.out.println("Please only enter integers, 0 wil be added to first index of array.");
			qu.addArray(0);
			userInput=0;
		}
		
		//ask user what they want to do until they wish to stop
		while(runAgain) {
			//if input mismatch, end program
			try {
				scn = new Scanner(System.in);
				System.out.println("What would you like to do? Please enter: " 
						+ "\n1 to add more integers, please enter no more than 10. "
						+ "\n2 to sort your array from largest to smallest. "
						+ "\n3 to print sorted and unsorted arrays. "
						+ "\n4 to end program.");
				userInput = scn.nextInt();
				
				//add to array
				if (userInput==1) {
					System.out.println("Please enter the number you want to add.");
					num = scn.nextInt();
					qu.addArray(num);
					
					runAgain=true;
				
				//sort array
				}else if (userInput==2) {
					qu.sortCall();
					System.out.println("Array has been sorted.");
					System.out.println();
					
					runAgain=true;
					
				//sort array and print sorted and unsorted 	
				}else if (userInput==3) {
					qu.sortCall();
					qu.print();
					System.out.println();
					
					runAgain=true;
					
				//end program	
				}else if (userInput==4) {
					System.out.println("Program is ending.");
					System.out.println();
					
					runAgain=false;
					
				//default	
				}else {
					System.out.println("Please only enter the specified numbers. Program will continue.");
					System.out.println();
					
					runAgain=true;
				}
			}catch (java.util.InputMismatchException e) {
				System.out.println("Please only enter integers, program will end.");
				runAgain=false;
			}
		}
		

		scn.close();
	}

}
