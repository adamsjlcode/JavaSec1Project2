import java.util.Scanner; //User Input From Keyboard
public class Proj2 
{

	public static void main(String[] args) 
	{
		String strName;					//User Input For A Name
		String strAssign;				//Programmer Info
		String strDueDate;				//Programmer Info
		char cRepeat;					//User Input For Restarting Program
		Scanner kbInput = new Scanner(System.in);
		MathStats ms1= new MathStats( ); //creates both the reference variable and the instance
		//Utility.clearscreen();
		System.out.print("What is the assignment: ");
		strAssign = kbInput.nextLine();
		System.out.print("When is this due: ");
		strDueDate = kbInput.nextLine();
		do
		{
			theProgrammerInfo(strAssign, strDueDate);//Programmer Info
			ms1.menu();
			
			cRepeat = startOver();			//Start The Program Again
		}while(cRepeat == 'Y' || cRepeat == 'y');
	}
	
		public static void theProgrammerInfo(String Assign,String Date1 )
		/** 
		* Method Name: theProgrammerInfo
		* Method Purpose: Display Information About Programmer 
		* 
		* Date:09/23/2015
		* 
		* Notes: Ask User For The Of Assignment And Due Date
		* Display With The Assignment And Due Date
		* 
		* 	@param Scanner kbinput User Input From Keyboard
		*/
		{
			System.out.print("\nProgram Name:\tProj1.java");
			System.out.print("\n  Programmer:\tJustin Adams");		
			System.out.print("\n       Class:\tCSCI 1250-003");
			System.out.print("\n         Lab:\t" + Assign);
			System.out.print("\n    Due Date:\t" + Date1 + "\n\n");	
		}//End theProgrammerInfo(String,String)
		public static char startOver()
		
		{
		
			char cOver;					//Hold The Char To End Or Start Programs
			String strStart;			//User input For Starting Over The Program
			Scanner KeyBoard = new Scanner(System.in);
			System.out.println("\n\nWould you like to restart the program" + 
							" with new values.\nEnter Y for yes or N for no");
			strStart = KeyBoard.nextLine();
			cOver = strStart.charAt(0);	//Turning User Input Into A Char
		
			return cOver;
		}//End startOver()
}
