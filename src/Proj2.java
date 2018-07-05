/*Program Name:				Proj2.java     
*   Programmer:				Justin Adams
*        Class:				CSCI-003
*          Lab:				Project 2
*      Purpose: 			Create an instance of the MathStats class and 
*      						use the reference variable throughout the program 
*      						to access the methods for user
*     Due Date:				October 16, 2015
*/  			
import java.util.Scanner; //User Input From Keyboard
import java.text.DecimalFormat;
public class Proj2 
{

	public static void main(String[] args) 
	{
		String strAssign;				//Programmer Info For Assignment
		String strDate;				//Programmer Info For Due Date
		byte bCount;					//Counter Marker		
		int iUserChoice = 0;				//User Input For Menu/Numbers Choices
		int iX1;						//User Input For (One) Scores
		int iW1;						//User Input For First Weighted Score 
		int iX2;						//User Input For Score Two
		int iW2;						//User Input For Second Weighted Score 
		int iX3;						//User Input For Score Three
		int iW3;						//User Input For Third Weighted Score 
		double dScores;					//Average Scores
		Scanner kbInput = new Scanner(System.in);//User Input From Keyboard
		DecimalFormat decimal = new DecimalFormat("00.#");//Format For Integer
		MathStats ms1= new MathStats();//Creates Reference Variable And Instance.
	
		clearScreen();					
		System.out.print("What is this date: ");
		strDate = kbInput.nextLine();
		System.out.print("What is the assignment: ");
		strAssign = kbInput.nextLine();
		for (bCount = 1; bCount <=5; bCount++)
		{
			theProgrammerInfo(strDate,strAssign);
			iUserChoice = menu();		
			switch(iUserChoice)
			{
			case 1: //Adjust A Score	
				iX1= ms1.getScore();
				iX1 = ms1.adjustScore(iX1);
				System.out.println("The Adjusted Score: " + iX1);
				pressEnterToContinue();
				break;
			case 2:	//Find Max And Min For 5 Scores
				iX1 = ms1.getScore();
				iW1 = ms1.getScore();
				iX2 = ms1.getScore();
				iW2 = ms1.getScore();
				iX3 = ms1.getScore();
				dScores = ms1.maxScore(iX1, iW1, iX2, iW2, iX3);
				System.out.println("\nLargest Score: " + (int)dScores);
				dScores = ms1.minScore(iX1, iW1, iX2, iW2, iX3);
				System.out.println("Smallest Score: " + (int)dScores);
				pressEnterToContinue();
				break;
			case 3://Find Weighted Average
				System.out.print("\nEnter 3 Sets Of A Scores And A Weight\n");
				iX1 = ms1.getScore();
				iW1 = ms1.getScore();
				iX2 = ms1.getScore();
				iW2 = ms1.getScore();
				iX3 = ms1.getScore();
				iW3 = ms1.getScore();
				dScores = ms1.weightedAvg(iX1, iW1, iX2, iW2, iX3, iW3);
				System.out.println("\nThe Weighted Average: " + dScores);
				pressEnterToContinue();
				break;
			case 4://Input Scores And Average Them
				System.out.print("\nHow Many Scores Do You Wish To Average? ");
				iUserChoice = kbInput.nextByte();
				dScores = ms1.inputScoresAndAverage(iUserChoice);
				System.out.println("\nThe Average Of Those " + iUserChoice +
						" Numbers Is: "+ dScores);
				pressEnterToContinue();
				break;
			case 5://Determine The Max Score For Varying Numbers Of Scores
				System.out.println("\nDetermine The Max And Min Scores For Varying "
						+ "Numbers Of Scores");
				dScores = ms1.maxScoreInput();
				System.out.println("\nThe Average Of Max And Min Is " 
										+ decimal.format(dScores));
				pressEnterToContinue();
				break;
			case 6://Exit The Program
				System.exit(0);
				break;
			default:
				System.out.println("Invaild choice.");
			}
			
		}
	}//End Main(String)
	/** 
	* Method Name: menu <br>
	* Method Purpose: Prompt The User From Choice On Menu 
	* <hr>
	* Date:10/11/2015
	* <hr>
	* Notes:
	* <hr>
	* 	*<hr>
	* 	@return iUserChoice int,  User Selection Choice For The Menu 
	*/
	public static int menu()
	{
		int iUserChoice;						 //User Input For Menu Selection
		Scanner kbInput = new Scanner(System.in);//User Input From Keyboard
		System.out.print("\t\t     M E N U\n");
		System.out.print("\t1)\tAdjust a score\n");
		System.out.print("\t2)\tFind Max and Min for 5 scores\n");
		System.out.print("\t3)\tFind Weighted Averages them\n");
		System.out.print("\t4)\tInput Scores and Average them\n");
		System.out.print("\t5)\tDetermine the max score for varying numbers " +
																"of scores\n");
		System.out.print("\t6)\tExit the program\n\n");
		System.out.print("\t\tEnter number of your choice: ");
		iUserChoice = kbInput.nextByte();
		
		return iUserChoice;
	}//End menu()	
	public static void clearScreen()
		/** 
		* Method Name: clearScreen <br>
		* Method Purpose: Clear The Screen Of Previous Info.
		*<hr> 
		* Date:09/23/2015
		* <hr>
		* Notes: Develop By Dr. Bailey
		* 
		*/
		{
			System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+"\n\n\n\n");
		}//End clearScreen()
	
		public static void theProgrammerInfo(String assign,String date )
		/** 
		* Method Name: theProgrammerInfo <br>
		* Method Purpose: Display Information About Programmer 
		* <hr>
		* Date:09/23/2015
		* <hr>
		* Notes: Ask User For The Of Assignment And Due Date
		* Display With The Assignment And Due Date
		* <hr>
		* 	@param assign String, User Input For Which Assighment
		* 	@param date String, User Input When Is Due Date
		*/
		{
			System.out.print("\nProgram Name:\tProj2.java");
			System.out.print("\n  Programmer:\tJustin Adams");		
			System.out.print("\n       Class:\tCSCI 1250-003");
			System.out.print("\n        Date:\t" + date);
			System.out.print("\n         Lab:\t\n\n" + assign +"\n\n");
				
		}//End theProgrammerInfo(String,String)
		/** 
		* Method Name: pressEnterToContinue <br>
		* Method Purpose: Pause Display For User 
		* <hr>
		* Date:09/23/2015
		* <hr>
		* Notes:
		* <hr>
		*
		*/
		public static void pressEnterToContinue()
		{
		Scanner kbInput = new Scanner(System.in);
		System.out.println("\nPress Enter To Continue\n");
		kbInput.nextLine();	
		}//End pressEnterToContinue(Scanner)
}//End Proj2
