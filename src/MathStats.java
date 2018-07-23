/*Program Name:				MathStats.java     
*   Programmer:				Justin Adams
*        Class:				CSCI-003
*          Lab:				MathStats
*      Purpose: 			A Method To Hold Different Way A User To Adjust, Find 
*							Max Or Min Find Averages Of Different Amount Integer
*      						From User Input
*     Due Date:				October 20, 2015
*/  			
import java.text.DecimalFormat;
import java.util.Scanner;
public class MathStats 
{
	Scanner kbInput = new Scanner(System.in);//User Input From Keyboard
	DecimalFormat decimal = new DecimalFormat("00.#");//Format For Integer
	/** 
	* Method Name: getScore <br>
	* Method Purpose: Prompt The User For Score From Keyboard
	* 				  It Then Returns That Value
	* <hr>
	* Date:10/11/2015
	* <hr>
	* Notes:
	* <hr>
	*	*<hr>
	*	@return iScore int,  User Input Score From Keyboard
	*/
	public int getScore()
	{
			int iScore;		//Hold User Score Input
			System.out.print("\nWhat is the Value: ");
			return iScore = kbInput.nextInt();
	}//End getScore()
	/** 
	* Method Name: adjustScore <br>
	* Method Purpose: Accepts 5 Value Parameters And Determines The Adjusted Score
	* 				  It Then Returns That Value
	* <hr>
	* Date:10/11/2015
	* <hr>
	* Notes: 
	* 
	* <hr>
	* 	@param score int, Hold User Input Adjusted Score
	*/
	public int adjustScore(int score)
	{
		if (score < 60)
		{
			score += 10;
		}
		else if (score < 70)
		{
			score += 8;
		}
		else if (score < 80)
		{
			score += 6;	
		}
		else if (score < 90)
		{
			score += 4;
		}
		else if (score < 100)
		{
			score += 2;
		}
		return score;		
	}//End adjustScore(int)
	/** 
	* Method Name: maxScore <br>
	* Method Purpose: Accepts 5 Integer Parameters And Determines The Largest
	* 				  It Then Returns That Value
	* 
	* <hr> 
	* Date:10/11/2015
	* <hr>
	* Notes:
	* 
	* <hr>
	* 	@param x int, First Score
	* 	@param y int, Second Score
	* 	@param z int, Third Score
	* 	@param u int, Forth Score
	* 	@param v int, Fifth Score
	* 	*<hr>
	* 	@return iHigh int, The Highest Score
	*/
	public int maxScore(int x,int y,int z,int u,int v)
	{
		int iHigh = -1;		//Hold User Input Largest Number
		if(iHigh<x)
		{
			iHigh=x;
		}
		if(iHigh<y)
		{
			iHigh=y;
		}
		if(iHigh<z)
		{
			iHigh=z;
		}
		if(iHigh<u)
		{
			iHigh=u;
		}
		if(iHigh<v)
		{
			iHigh=v;
		}
		return iHigh;	
	}//End maxScore(int,int,int,int,int)
	/** 
	* Method Name: theProgrammerInfo <br>
	* Method Purpose: Accepts 5 Integer Parameters And Determines The Smallest 
	* 				  It Then Returns That Value 
	* <hr>
	* Date:10/11/2015
	* <hr>
	* Notes:
	* 
	* <hr>
	* 	@param x int, First Score
	* 	@param y int, Second Score
	* 	@param z int, Third Score
	* 	@param u int, Forth Score
	* 	@param v int, Fifth Score
	* 	*<hr>
	* 	@return iLow int, The Lowest Score
	*/
	public int minScore(int x,int y,int z,int u,int v)
	{
		int iLow = 101;		//Hold User Input Smallest Number
		if(iLow>x)
		{
			iLow=x;
		}
		if(iLow>y)
		{
			iLow=y;
		}
		if(iLow>z)
		{
			iLow=z;
		}
		if(iLow>u)
		{	
			iLow=u;
		}
		if(iLow>v)
		{
			iLow=v;
		}
		return iLow;
			
	}//End minScore(int,int,int,int,int)
	/** 
	* Method Name: weightedAvg <br>
	* Method Purpose: Accepts 6 Integer Parameters And Determines The Average
	* 				  Weighted Score And It Then Returns That Value
	* 
	* <hr> 
	* Date:10/11/2015
	* 
	* Notes:
	* 
	* <hr>
	* 	@param x1 int, First Score
	* 	@param w1 int, First Percent
	* 	@param x2 int, Second Score
	* 	@param w2 int, Second Percent
	* 	@param x3 int, Third Score
	* 	@param w2 int, Third Percent
	* 	*<hr>
	* 	@return weightedAvg double, The Weighted Average Score
	*/
	public double weightedAvg(int x1,int w1,int x2,int w2,int x3,int w3)
	{
		double weightedAvg; //Holds The Weighted Average Score Form User Input
		weightedAvg = (1.0*x1*(1.0*w1/100.0))
					+(1.0*x2*(1.0*w2/100.0))
					+(1.0*x3*(1.0*w3/100.0));
		return weightedAvg;
	}//End weightedAvg(int,int,int,int,int,int)
	/** 
	* Method Name: inputScoresAndAverage <br>
	* Method Purpose:   Accepts 1 Value For Amount Of User Scores In Parameters 
	* 					And Determines The Average Score
	* 					It Then Returns Average Of All Integer
	* <hr>
	* Date:10/11/2015
	* <hr>
	* Notes:
	*
	* <hr>
	* 	@param numScores int, Amount Of Scores User Wants To Input
	* 	*<hr>
	*	@return dTotalScoreAverage, The Total Scores And Average 
	*/
	public double inputScoresAndAverage(int numScores)
	{

		int iScore;					//Hold User Score From Method getScore()
		int iCount;					//Hold The Counter Of User Number Of Score
		double dTotalScoreAverage = 0;//Hold User Input Total Scores And Average

		for(iCount = 1;numScores >= iCount; iCount++)
		{
			iScore = getScore();
			dTotalScoreAverage += iScore;
		}
		dTotalScoreAverage /= numScores;
		return dTotalScoreAverage;
	}//End inputScoresAndAverage(int)
	/** 
	* Method Name: maxScoreInput <br>
	* Method Purpose:  Prompt User For Scores Until User Enters -1
	* 					Find Lowest, Highest, And Average Between Lowest-Highest
	* 					It Then Returns Average Of All Integer
	* <hr>
	* Date:09/23/2015
	* <hr>
	* Notes:
	*
	* <hr>
	* 	*<hr>
	*	@return dTotalScoreAverage, The Total Scores And Average Of All And
	*								Max and Min
	*/
	public double maxScoreInput()
	{
		int iScore;					//Hold User Input Score From Method getScore()
		int iCount = 0;				//Hold The Counter Of User Number Of Score
		int iMaxScore;				//Hold User Input Largest Number
		int iMinScore;				//Hold User Input Smallest Number
		double dTotalScoreAverage;	//Hold User Input Total Scores And Average Scores
		iScore = getScore();
		iMaxScore = iScore;
		iMinScore = iScore;
		dTotalScoreAverage = iScore;
		for(;;)
		{
			iCount++;
			iScore = getScore();
			if (iScore == -1) break;
			dTotalScoreAverage += iScore;
			if (iScore > iMaxScore)
			{
				iMaxScore = iScore;
			}
			else if (iScore < iMinScore)
			{
				iMinScore = iScore;
			}
		}
		dTotalScoreAverage /= iCount;
		System.out.println("\nSmallest: " + iMinScore + 
						"\tLargest: " + iMaxScore + 
						"\tAverage: " + 
						decimal.format(dTotalScoreAverage));
		dTotalScoreAverage = iMinScore + iMaxScore;
		dTotalScoreAverage /= 2;
		return dTotalScoreAverage;
	}//End maxScoreInput()
}//End MathStats