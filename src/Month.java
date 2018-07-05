
public class Month
{
	private int numberMonth;


public Month()
{
numberMonth=1;
}

public Month(int numberMonth)
{
setNumberMonth(numberMonth);
}
public Month(String nameMonth)
{
	switch(nameMonth.toUpperCase())
	{
	case "January":
	case "january":
		numberMonth=1;
		break;
	case "February":
	case "february":
		numberMonth=2;
		break;
	case "march":
	case "March":
		numberMonth=3;
		break;
	case "april":
	case "April":
		numberMonth=4;
		break;
	case "May":
	case "may":
		numberMonth=5;
		break;
	case "June":
	case "june":
		numberMonth=6;
		break;
	case "July":
	case "july":
		numberMonth=7;
		break;
	case "August":
	case "august":
		numberMonth=8;
		break;
	case "September":
	case "september":
		numberMonth=9;
		break;
	case "October":
	case "october":
		numberMonth=10;
		break;
	case "November":
	case "november":
		numberMonth=11;
		break;
	case "December":
	case "december":
		numberMonth=12;
		break;
	}//End switch(String)
}
public void setNumberMonth(int numberMonth)
{
	if(numberMonth>0||numberMonth<13)
	{	
		this.numberMonth = numberMonth;
	}
	else
	{
		this.numberMonth=0;
	}
}//End setMonthNumber(int)
public int getMonthNumber()
{
	return numberMonth;
}//End getMonthNumber()
public String getMonthName()
{
	String strNumMonth=null;
	switch(numberMonth)
	{
		case 1:
			strNumMonth = "January";
			break;
		case 2:
			strNumMonth = "February";
			break;
		case 3:
			strNumMonth = "March";
			break;
		case 4:
			strNumMonth = "April";
			break;
		case 5:
			strNumMonth = "May";
			break;
		case 6:
			strNumMonth = "June";
			break;
		case 7:
			strNumMonth = "July";
			break;
		case 8:
			strNumMonth = "August";
			break;
		case 9:
			strNumMonth = "September";
			break;
		case 10:
			strNumMonth =  "October";
			break;
		case 11:
			strNumMonth =  "November";
			break;
		case 12:
			strNumMonth = "December";
			break;
	}//End switch(String)
	return strNumMonth;
}
}//End Month(String)
