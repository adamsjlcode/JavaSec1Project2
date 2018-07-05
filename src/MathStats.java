import java.util.Scanner;
public class MathStats 
{
	//public MathStats()
	//{
		
	//}
	public static byte menu()
	/**
	 * 
	 */
	{
		byte bUserChoice;
		Scanner kbInput = new Scanner(System.in);
		System.out.print("\t\t     M E N U\n");
		System.out.print("\t1)\tAdjust a score\n");
		System.out.print("\t2)\tFind Max and Min for 5 scores\n");
		System.out.print("\t3)\tFind Weighted Averages them\n");
		System.out.print("\t4)\tInput Scores and Average them\n");
		System.out.print("\t5)\tDetermine the max score for varying numbers of scores\n");
		System.out.print("\t6)\tExit the program\n\n");
		System.out.print("\t\tEnter number of your choice: ");
		bUserChoice = kbInput.nextByte();
		
		return bUserChoice;
	}
		//public getScore()
		//{
			System.out.print()
		//}
		public int adjustScore(int score)
		{
			
		}
		public int maxScore(int x,int y,int z,int u,int v)
		{
			
		}
		public int minScore(int x,int y,int z,int u,int v)
		{
			
		}
		public double weightedAvg(int x1,int w1,int x2,int w2,int x3,int w3)
		{
			
		}
		public double inputScoresAndAverage(int numScores)
		{
			
		}
		public int maxScoreInput()
		{
			
		}
}
